package hr.algebra.DriveOff.dal;

import hr.algebra.DriveOff.dal.sql.CarSqlRepository;
import hr.algebra.DriveOff.dal.sql.ReservationSqlRepository;
import hr.algebra.DriveOff.dal.sql.UserSqlRepository;
import hr.algebra.DriveOff.model.Car;
import hr.algebra.DriveOff.model.Reservation;
import hr.algebra.DriveOff.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public final class RepositoryFactory {
    private RepositoryFactory() {
    }
    private static final Map<Class<?>, Repository<?>> classRepositoryMap =Map.of(
            User.class, new UserSqlRepository(),
            Car.class, new CarSqlRepository(),
            Reservation.class, new ReservationSqlRepository());

    @SuppressWarnings("unchecked")
    public static<T> Repository<T> get(Class<T> clazz)  {
        if (classRepositoryMap.containsKey(clazz)) {
            return (Repository<T>) classRepositoryMap.get(clazz);
        }

        throw new RuntimeException("No such repository");
    }
}
