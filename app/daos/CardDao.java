package daos;



import models.Card;

import java.util.Collection;

    public interface CardDao extends Crud2Dao<Card, Integer>{

        Collection<Card> findCardByName(String name);

    }


