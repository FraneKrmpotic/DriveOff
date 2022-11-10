package hr.algebra.DriveOff.dal.sql;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateFactory {
    private HibernateFactory() {
    }

    public static final String SELECT_PEOPLE = "Person.findAll";
    private static final String PERSISTENT_UNIT = "PersonManagerPU"; //TODO(Rename)

    private static final EntityManagerFactory EMF
            = Persistence.createEntityManagerFactory(PERSISTENT_UNIT);

    public static EntityManagerWrapper getEntityManager() {
        return new EntityManagerWrapper(EMF.createEntityManager());
    }

    public static void release() {
        EMF.close();
    }
}
