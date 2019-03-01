package daos;

import java.util.Collection;
import java.util.Optional;

public interface Crud3Dao<Entity ,Key> {
    Entity create(Entity entity);
    //Optional<Entity> read(Key Name);
    //Entity update(Entity entity);
    // Entity delete(Key id);
    Collection<Entity> all();

}
