package service.work.carrentalclub.repos;

import org.springframework.stereotype.Repository;
import service.work.carrentalclub.model.BaseRecord;
import service.work.carrentalclub.model.Rent;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class RentRepo extends CrudAbstractRepository {
    @Override
    public List<? extends BaseRecord> getAll() {
        return em.createQuery("select r from Rent r", Rent.class).getResultList();
    }

    @Override
    public BaseRecord getById(int recordId) throws NoResultException {
        return em.createQuery("select r from Rent  r where r.recordId=:id", Rent.class)
                .setParameter("id",recordId).getSingleResult();
    }

    @Override
    public void delete() {

    }
}
