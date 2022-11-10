package hr.algebra.DriveOff.dal;

import java.util.List;
import java.util.Optional;

public interface Repository <T>{
    int createEntity(T Entity);
    int createEntity(List<T> entities);
    boolean updateEntity(int id, T entity);
    boolean deleteEntity(int id);
    Optional<T> selectEntity(int id);
    List<T> selectEntities();
}
