package hr.algebra.DriveOff.dal.sql;

import hr.algebra.DriveOff.dal.Repository;
import hr.algebra.DriveOff.model.Car;

import java.util.List;
import java.util.Optional;

public class CarSqlRepository implements Repository<Car> {


    @Override
    public int createEntity(Car Entity) {
        return 0;
    }

    @Override
    public int createEntity(List<Car> entities) {
        return 0;
    }

    @Override
    public boolean updateEntity(int id, Car entity) {
        return false;
    }

    @Override
    public boolean deleteEntity(int id) {
        return false;
    }

    @Override
    public Optional<Car> selectEntity(int id) {
        return Optional.empty();
    }

    @Override
    public List<Car> selectEntities() {
        return null;
    }
}
