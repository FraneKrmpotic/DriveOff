package hr.algebra.DriveOff.dal.sql;

import hr.algebra.DriveOff.dal.Repository;
import hr.algebra.DriveOff.model.User;

import java.util.List;
import java.util.Optional;

public class UserSqlRepository implements Repository<User> {

    @Override
    public int createEntity(User Entity) {
        return 0;
    }

    @Override
    public int createEntity(List<User> entities) {
        return 0;
    }

    @Override
    public boolean updateEntity(int id, User entity) {
        return false;
    }

    @Override
    public boolean deleteEntity(int id) {
        return false;
    }

    @Override
    public Optional<User> selectEntity(int id) {
        return Optional.empty();
    }

    @Override
    public List<User> selectEntities() {
        return null;
    }
}
