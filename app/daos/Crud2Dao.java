package daos;

import java.util.Collection;

public interface Crud2Dao<Entity ,Key> {
    Entity create(Entity entity);
    //Optional<Entity> read(Key id);
    // Entity update(Entity entity);
    // Entity delete(Key id);
    Collection<Entity> all();
    Collection<Entity> all10();

}



