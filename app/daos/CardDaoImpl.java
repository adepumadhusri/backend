package daos;


import models.Card;
import play.db.jpa.JPAApi;
import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;


public class CardDaoImpl implements CardDao{

    final JPAApi jpaApi;

    @Inject
    public CardDaoImpl(JPAApi jpaApi) {

        this.jpaApi = jpaApi;

    }


    public Card create(Card card) {

        if(null == card) {
            throw new IllegalArgumentException("Card must be provided");
        }

        jpaApi.em().persist(card);

        return card;

    }

    @Override
    public Collection<Card> all() {
        TypedQuery<Card> query = jpaApi.em().createQuery("SELECT  c FROM  Card c ORDER BY id desc ", Card .class);
        List<Card> cards= query.getResultList();

        return cards;
    }



    @Override
    public Collection<Card> findCardByName(String name) {
        TypedQuery<Card> query = jpaApi.em().createQuery("SELECT c FROM Card c where Name LIKE '%"+name+"%'", Card.class);
        List<Card> card= query.getResultList();

        return card;
    }
}
