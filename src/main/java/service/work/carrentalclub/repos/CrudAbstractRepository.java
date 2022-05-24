package service.work.carrentalclub.repos;

import service.work.carrentalclub.model.BaseRecord;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

public abstract class CrudAbstractRepository {
    
    @PersistenceContext
    protected EntityManager em;
    
    public abstract List<? extends BaseRecord> getAll();
    public abstract BaseRecord getById(int recordId) throws NoResultException;
    public abstract void delete( BaseRecord baseRecord);

    public   EntityManager getEm() {
        return em;
    }
}
