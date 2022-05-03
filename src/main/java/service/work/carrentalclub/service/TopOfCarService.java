package service.work.carrentalclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.TopOfCars;
import service.work.carrentalclub.repos.TopOfCarRepo;

import java.util.List;

@Service
public class TopOfCarService {

    @Autowired
    private TopOfCarRepo topOfCarRepo;

    /**
     * Возвращает список понравившихся авто по id пользователя
     * @param userId идентификатор пользователя
     * @return массив авто
     */
    public List<TopOfCars> findByUserId(int userId) {
        return topOfCarRepo.getEm()
                .createQuery("select t from TopOfCars  t where t.user.recordId = :id", TopOfCars.class)
                .setParameter("id", userId)
                .getResultList();
    }
}
