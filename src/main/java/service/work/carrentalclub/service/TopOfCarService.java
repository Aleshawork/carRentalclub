package service.work.carrentalclub.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.Car;
import service.work.carrentalclub.model.TopOfCars;
import service.work.carrentalclub.model.User;
import service.work.carrentalclub.repos.TopOfCarRepo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class TopOfCarService {

    @Autowired
    private TopOfCarRepo topOfCarRepo;

    @Autowired
    private  CarService carService;

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

    public void save(User user, int carId) {
        Date now  = Date.valueOf(LocalDate.now());
        TopOfCars topOfCar = new TopOfCars();
        topOfCar.setUser(user);
        topOfCar.setDateOfLike(now);
        Car car = carService.findById(carId);
        topOfCar.setCar(car);
        topOfCarRepo.save(topOfCar);
        log.info("Save new top car");

    }

    public void delete(int recordId) {
        TopOfCars topOfCars = (TopOfCars) topOfCarRepo.getById(recordId);
        topOfCarRepo.delete(topOfCars);
    }
}
