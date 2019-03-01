package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import daos.CardDao;
import daos.CardDaoImpl;
import javafx.scene.layout.CornerRadii;
import models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import play.Logger;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

public class CardController extends Controller {
    private final static Logger.ALogger LOGGER = Logger.of(CardController .class);

    @Autowired
    final CardDao CardDao;

    @Inject
    public CardController(CardDao CardDao) { this.CardDao = CardDao; }
    //public UserController(UserDao userDao) { this.userDao = userDao; }

    @Transactional
    public Result createCard (){

        final JsonNode json = request().body().asJson();

        final Card card = Json.fromJson(json, Card.class);

        //LOGGER.debug("Card name = " + Card.getName());
       // LOGGER.error("This is an error");

        if (null == card.getName()) {
            return badRequest("Name must be provided");
        }


        CardDao.create(card);
        final JsonNode result = Json.toJson(card);
        return ok(result);
    }

    @Transactional
    public Result getCardByName(String name) {

        if (null == name) {
            return badRequest("name must be provided");
        }

        final Collection<Card> restaurants = CardDao.findCardByName(name);
//        if(restaurants.isPresent()) {
//            final JsonNode result = Json.toJson(restaurants.get());
//            return ok(result);
//        } else {
//            return notFound();
//        }
        final JsonNode result = Json.toJson(restaurants);

        return ok(result);
    }


    @Transactional
    public Result getAllCards() {

        Collection<Card> card = CardDao.all();
        //Collection<Card> card2 = CardDao.all10();
        final JsonNode result = Json.toJson(card);

        return ok(result);
    }

}

