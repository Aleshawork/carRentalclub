package service.work.carrentalclub.repos;

import org.springframework.stereotype.Repository;
import service.work.carrentalclub.model.BaseRecord;
import service.work.carrentalclub.model.User;

import javax.persistence.NoResultException;
import java.util.List;

@Repository
public class UserRepo extends CrudAbstractRepository{

    public User findByUserName(String username) throws NoResultException {
        return em.createQuery("select u from User  u where u.username =:name", User.class)
                .setParameter("name",username)
                .getSingleResult();
    }

    @Override
    public List<? extends BaseRecord> getAll() {
        return em.createQuery("select u from User u",User.class).getResultList();
    }

    @Override
    public BaseRecord getById(int recordId) throws NoResultException {
        return em.createQuery("select u from User u where u.recordId =:id", User.class)
                .setParameter("id",recordId)
                .getSingleResult();
    }

    @Override
    public void delete(BaseRecord baseRecord) {

    }
}
