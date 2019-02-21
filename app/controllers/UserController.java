package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.io.BaseEncoding;
import com.google.inject.Inject;
//import controllers.security.Authenticator;
import daos.UserDao;
import models.User;
import org.apache.commons.lang3.RandomStringUtils;
import play.Logger;

import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Optional;



public class UserController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(UserController.class);


    private final static int HASH_ITERATIONS = 100;



    final UserDao userDao;


    @Inject
    public UserController(UserDao userDao){

        this.userDao = userDao;
    }


    @Transactional
    public Result registerUser()  {

        final JsonNode json = request().body().asJson();

        final User user = Json.fromJson(json, User.class);

        LOGGER.debug("User name is  = " + user.getName());
        //LOGGER.error("This is an error");


        if (null == user.getName()  && null == user.getEmail()) {
            return badRequest("Missing Mandatory Parameters");
        }

        final String password = json.get("password").asText();

        if(null == password){
            return badRequest("Missing mandatory parameters");
        }

        if(userDao.read(user.getName()).isPresent()){
            return badRequest("user taken!");
        }

        final String salt = generateSalt();

        final String hash = generateHash(salt,password,HASH_ITERATIONS);

        user.setHashIterations(HASH_ITERATIONS);
        user.setSalt(salt);
        user.setPasswordHash(hash);

        if (null == user.getName() && null == user.getPassword() && null == user.getEmail()) {
            return badRequest("Missing Mandatory Parameters");
        }

        if (userDao.read(user.getName()).isPresent()){
            return badRequest("User Name already taken!");
        }


        user.setState(User.State.VERIFIED);
        user.setRole(User.Role.USER);

        final User newUser = userDao.create(user);

        final JsonNode result = Json.toJson(newUser);

        return ok(result);

    }


    private String generateSalt() {

        String mySalt = RandomStringUtils.randomAlphabetic(10);
        return mySalt;

    }

    private String generateHash(String salt,String password,int iterations) {

        try{

            final String concat = salt + ":" + password;
            //TODO Run in a loo x iterations
            //TODO Use a better hash function

            final MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(concat.getBytes());
            final String passwordHash = BaseEncoding.base16().lowerCase().encode(messageDigest);

            LOGGER.debug("Password hash {}", passwordHash);

            return passwordHash;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Transactional
    public Result signInUser() {

        final JsonNode json = request().body().asJson();
        final User user = Json.fromJson(json,User.class);

        if(null == user.getName() || null == user.getPassword()){
            return badRequest("Missing Mandatory Parameters");
        }

        final Optional<User> optionalExistingUser = userDao.read(user.getName());


        final String name = json.get("name").asText();
        final String password = json.get("password").asText();

        if(null == password || null == name){
            return badRequest("Missing Mandatory Parameters");
        }

        final Optional<User> poptionalExistingUser = userDao.read(name);

        if(!poptionalExistingUser.isPresent()) {
            return unauthorized("Wrong username!");
        }

        final User existingUser = optionalExistingUser.get();

        final String salt = existingUser.getSalt();
        final int iterations = existingUser.getHashIterations();
        final String hash = generateHash(salt,password, iterations);


        if(!existingUser.getPasswordHash().equals(hash)) {
            return unauthorized("Wrong password!");
        }


        if(!optionalExistingUser.isPresent()) {
            return unauthorized("Wrong username!");
        }

        final User pexistingUser = optionalExistingUser.get();

        if(!pexistingUser.getPassword().equals(user.getPassword())) {
            return unauthorized("Wrong password!");
        }


        if(existingUser.getState() != User.State.VERIFIED) {
            return unauthorized("Account not verified");
        }

        existingUser.setAccessToken(generateAccessToken());

        userDao.update(existingUser);

        final JsonNode result = Json.toJson(existingUser);

        return ok(result);

    }



  //  private String generateAccessToken() {

    //    return "ABC123";

//        String authToken = RandomStringUtils.randomAlphabetic(100);
//        System.out.println(authToken);
//        return authToken;

        private String generateAccessToken() {

            String authToken = RandomStringUtils.randomAlphabetic(10);
            return authToken;
        }



      //  @Authenticator
        @Transactional
        public Result signOutUser() {

            final User user = (User) ctx().args.get("user");

            user.setAccessToken(null);

            userDao.update(user);

            return ok();
        }

        @Transactional
        public Result getCurrentUser() {

            final Optional<String> authHeader = request().header("Authorization");

            if (!authHeader.isPresent()) {
                return unauthorized("Go and sign in");
            }

            LOGGER.debug("Auth token = {}", authHeader.get());

            if (!authHeader.get().startsWith("Bearer ")) {
                return unauthorized("Invalid auth header format");
            }

            final String accessToken = authHeader.get().substring(7);
            LOGGER.debug("accessToken {}", accessToken);
            if (accessToken.isEmpty()) {
                return unauthorized("Invalid auth header format");
            }

            User user = userDao.findUserByAuthToken(accessToken);
            if (null == user) {
                return unauthorized("User not found");
            }

            LOGGER.debug("found user");

            final JsonNode result = Json.toJson(user);
            return ok(result);
        }


          //  @Authenticator


            @Transactional

            public Result deleteUserByName (String name){
                if (null == name) {
                    return badRequest("Name must be provided");
                }

                final User user = userDao.delete(name);


                final JsonNode result = Json.toJson(user);
                return ok(result);
            }

            @Transactional
            public Result getAllUsers () {

                Collection<User> users = userDao.all();

                final JsonNode result = Json.toJson(users);

                return ok(result);
            }
        }