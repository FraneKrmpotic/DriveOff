package hr.algebra.DriveOff.dal.sql;

import hr.algebra.DriveOff.dal.Repository;
import hr.algebra.DriveOff.model.Reservation;

import java.util.List;
import java.util.Optional;

public class ReservationSqlRepository implements Repository<Reservation> {


    @Override
    public int createEntity(Reservation Entity) {
        return 0;
    }

    @Override
    public int createEntity(List<Reservation> entities) {
        return 0;
    }

    @Override
    public boolean updateEntity(int id, Reservation entity) {
        return false;
    }

    @Override
    public boolean deleteEntity(int id) {
        return false;
    }

    @Override
    public Optional<Reservation> selectEntity(int id) {
        return Optional.empty();
    }

    @Override
    public List<Reservation> selectEntities() {
        return null;
    }
}
