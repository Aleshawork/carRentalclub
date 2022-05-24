package service.work.carrentalclub.repos;

import org.springframework.stereotype.Repository;
import service.work.carrentalclub.model.BaseRecord;
import service.work.carrentalclub.model.FeedBack;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class FeedBackRepo extends CrudAbstractRepository{
    @Override
    public List<? extends BaseRecord> getAll() {
        return em.createQuery("select q from FeedBack q", FeedBack.class).getResultList();
    }

    @Override
    public BaseRecord getById(int recordId) throws NoResultException {
        return null;
    }

    @Override
    public void delete(BaseRecord baseRecord) {

    }
}
