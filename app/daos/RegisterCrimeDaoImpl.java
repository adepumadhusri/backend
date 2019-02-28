package daos;

import models.Card;
import models.RegisterCrime;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;



public class RegisterCrimeDaoImpl implements RegisterCrimeDao{

    final JPAApi jpaApi;
    String crimetype;
    String location;
    String info;
    Integer id;

    @Inject
    public RegisterCrimeDaoImpl(JPAApi jpaApi) {

        this.jpaApi = jpaApi;

    }

    public RegisterCrime create(RegisterCrime crime) {


        if(null == crime) {
            throw new IllegalArgumentException("Crime must be provided");
        }
        crimetype=crime.getCrimetype();
        location=crime.getCity();
        info=crime.getDescription();

        jpaApi.em().persist(crime);

        return crime;

    }

    /*public void addToCards(){

        TypedQuery<RegisterCrime> query = jpaApi.em().createQuery("INSERT INTO card values(info,location,) ", Card.class);

    }*/

    @Override
    public Collection<RegisterCrime> all() {
        TypedQuery<RegisterCrime> query = jpaApi.em().createQuery("SELECT  c FROM  RegisterCrime c ORDER BY id desc ", RegisterCrime .class);
        query.setMaxResults(3);
        List<RegisterCrime> cards= query.getResultList();

        return cards;
    }



}
