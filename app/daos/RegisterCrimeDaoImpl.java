package daos;

import models.RegisterCrime;
import play.Logger;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.*;
import java.lang.Long;


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
        List<RegisterCrime> card= query.getResultList();

        return card;
    }

    @Override
    public Collection<RegisterCrime> all10() {
        TypedQuery<RegisterCrime> query = jpaApi.em().createQuery("SELECT  c FROM  RegisterCrime c ORDER BY id desc ", RegisterCrime .class);
        query.setMaxResults(10);
        List<RegisterCrime> cards= query.getResultList();

        return cards;
    }

    @Override
    public  Collection<RegisterCrime> findRelavantCrimes(String crimetype) {
        TypedQuery<RegisterCrime> query = jpaApi.em().createQuery("SELECT c FROM RegisterCrime c where crimetype LIKE '%"+crimetype+"%'", RegisterCrime.class);
        List<RegisterCrime> cards= query.getResultList();

        return cards;
    }

   /* public  Map barValues() {
        CriteriaBuilder cb = jpaApi.em().getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<RegisterCrime> stud = cq.from(RegisterCrime.class);
        cq.multiselect(stud.get("Crimetype"),cb.count(stud)).groupBy(stud.get("Crimetype"));


        System.out.print("s_age");
        System.out.println("\t Count");
        List<Object[]> list = jpaApi.em().createQuery(cq).getResultList();
        Map< String,Integer> hm = new HashMap< String,Integer>();
        for(Object[] object : list){
            Logger.info(object[0] + "     " + object[1]);
            hm.put(String.valueOf(object[0]),Integer.parseInt(String.valueOf(object[1])));
        }
        for(Map.Entry<String,Integer> entry : hm.entrySet()){

            Logger.info("12",entry.getKey());


        }
        return hm;

    }*/

    @Override
    public  Collection<RegisterCrime> findDetails(Integer id) {
        TypedQuery<RegisterCrime> query = jpaApi.em().createQuery("SELECT c FROM RegisterCrime c where id ="+id+"", RegisterCrime.class);
        List<RegisterCrime> cards= query.getResultList();

        return cards;
    }

    public  Map barValues() {
        CriteriaBuilder cb = jpaApi.em().getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<RegisterCrime> crime = cq.from(RegisterCrime.class);
        cq.multiselect(crime.get("Crimetype"),cb.count(crime)).groupBy(crime.get("Crimetype"));
        List<Object[]> list = jpaApi.em().createQuery(cq).getResultList();
        Map< String,Integer> hm = new HashMap< String,Integer>();
        for(Object[] object : list){
            Logger.info(object[0] + "     " + object[1]);
            hm.put(String.valueOf(object[0]),Integer.parseInt(String.valueOf(object[1])));
        }
        return hm;

    }

    public String HighestValues() {
        CriteriaBuilder cb = jpaApi.em().getCriteriaBuilder();
        CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
        Root<RegisterCrime> crime = cq.from(RegisterCrime.class);
        cq.multiselect(crime.get("City"),cb.count(crime)).groupBy(crime.get("City"));
        List<Object[]> list = jpaApi.em().createQuery(cq).getResultList();
        Map< String,Integer> hm = new HashMap< String,Integer>();
        for(Object[] object : list){
            Logger.info(object[0] + "     " + object[1]);
            hm.put(String.valueOf(object[0]),Integer.parseInt(String.valueOf(object[1])));
        }
        int maxValueInMap=(Collections.max(hm.values()));
        String str=new String();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
                str=entry.getKey();
                Logger.info(str);
            }
        }
        return str;

    }
    

}
