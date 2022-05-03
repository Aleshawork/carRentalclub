package service.work.carrentalclub.repos;

import org.springframework.stereotype.Repository;
import service.work.carrentalclub.model.BaseRecord;
import service.work.carrentalclub.model.TopOfCars;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class TopOfCarRepo extends CrudAbstractRepository{
    @Override
    public List<? extends BaseRecord> getAll() {
        return em.createQuery("select t from TopOfCars t", TopOfCars.class)
                .getResultList();
    }

    @Override
    public BaseRecord getById(int recordId) throws NoResultException {
        return em.createQuery("select t from TopOfCars t where t.recordId =:id", TopOfCars.class)
                .setParameter("id", recordId)
                .getSingleResult();
    }

    @Override
    public void delete() {

    }
}
