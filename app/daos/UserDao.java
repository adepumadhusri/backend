package daos;

import models.User;

public interface UserDao extends CrudDao<User, String>{

    User findUserByAuthToken(String Token);

}
