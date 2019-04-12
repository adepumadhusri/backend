package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import daos.RegisterCrimeDao;
import models.RegisterCrime;
import org.springframework.beans.factory.annotation.Autowired;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;

public class RegisCrimeController extends Controller {
    private final static Logger.ALogger LOGGER = Logger.of(CardController .class);

    @Autowired
    final RegisterCrimeDao RegisterCrimeDao;

    @Inject
    public RegisCrimeController( RegisterCrimeDao RegisterCrimeDao) { this.RegisterCrimeDao = RegisterCrimeDao; }
    //public UserController(UserDao userDao) { this.userDao = userDao; }


    @Transactional
    public Result registerCrime (){
        final JsonNode json = request().body().asJson();

        final RegisterCrime crime = Json.fromJson(json, RegisterCrime.class);

        final String crimetype = json.get("crimetype").asText();

        if(null == crimetype){
            return badRequest("Missing mandatory parameters");
        }

        final String gender = json.get("gender").asText();

        if(null == gender){
            return badRequest("Missing mandatory parameters");
        }

        final String description = json.get("description").asText();

        if(null == description){
            return badRequest("Missing mandatory parameters");
        }

        RegisterCrimeDao.create(crime);
        final JsonNode result = Json.toJson(crime);
        return ok(result);

    }

    @Transactional
    public Result getAllNews() {

        Collection<RegisterCrime> crime = RegisterCrimeDao.all();

        final JsonNode result = Json.toJson(crime);

        return ok(result);


    }

    @Transactional
    public Result getDetails(Integer id) {

        if (null == id) {
            return badRequest("id must be provided");
        }
        final Collection<RegisterCrime> crimes = RegisterCrimeDao.findDetails(id);
//
        final JsonNode result = Json.toJson(crimes);

        return ok(result);
    }

    @Transactional
    public Result getRelavantCrimes(String crimetype) {

        if (null == crimetype) {
            return badRequest("name must be provided");
        }
        final Collection<RegisterCrime> crimes = RegisterCrimeDao.findRelavantCrimes(crimetype);
//        if(restaurants.isPresent()) {
//            final JsonNode result = Json.toJson(restaurants.get());
//            return ok(result);
//        } else {
//            return notFound();
//        }
        final JsonNode result = Json.toJson(crimes);

        return ok(result);
    }

    @Transactional
    public Result getAll10() {

        Collection<RegisterCrime> crime = RegisterCrimeDao.all10();

        final JsonNode result = Json.toJson(crime);

        return ok(result);


    }

    @Transactional
    public Result getBarValues() {

        Map crime = RegisterCrimeDao.barValues();

        final JsonNode result = Json.toJson(crime);

        return ok(result);


    }

    @Transactional
    public Result getHighestValues() {

        String crime = RegisterCrimeDao.HighestValues();

        final JsonNode result = Json.toJson(crime);

        return ok(result);


    }


}

