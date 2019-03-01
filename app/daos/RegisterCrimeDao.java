package daos;

import models.RegisterCrime;

import java.util.Collection;

public interface RegisterCrimeDao extends Crud2Dao<RegisterCrime, Integer> {

    Collection<RegisterCrime> findRelavantCrimes(String crimetype);

}
