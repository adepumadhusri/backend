package daos;

import models.RegisterCrime;

import java.util.Collection;
import java.util.Map;

public interface RegisterCrimeDao extends Crud2Dao<RegisterCrime, Integer> {

    Collection<RegisterCrime> findRelavantCrimes(String crimetype);
    Map barValues();
    String HighestValues();

}
