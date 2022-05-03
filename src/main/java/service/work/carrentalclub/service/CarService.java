package service.work.carrentalclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.dto.FindCarDto;
import service.work.carrentalclub.model.Car;
import service.work.carrentalclub.model.Rent;
import service.work.carrentalclub.repos.Attribute;
import service.work.carrentalclub.repos.CarRepo;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private RentService rentService;

    @Autowired
    private CarRepo carRepo;

    /**
     * Поиск всех машин, зарегестрированных в сервисе
     * @return массив {@link Car}
     */
    public List<Car> findAll() {
        return (List<Car>) carRepo.getAll();
    }


    /**
     * Поиск свободных для аренды машин, зарегестрированных в сервисе
     * @return массив {@link Car}
     */
    public List<Car> findFreeCar() {
        List<Car> carList = carRepo.getEm().createQuery("select c from Car c left join fetch c.cars", Car.class).getResultList();
        return carList.stream().filter(el -> freeCar(el.getCars())).collect(Collectors.toList());
    }

     /**
         * Поиск арендованных машин
         * @return массив {@link Car}
         */
        public Set<Car> findLizingCar() {
            List<Car> carList = carRepo.getEm().createQuery("select c from Car c left join fetch c.cars", Car.class).getResultList();
            return carList.stream().filter(el -> !freeCar(el.getCars())).collect(Collectors.toSet());
        }


    /**
     * Поиск машин по всем параметрам, параметры добавляются в фильтрацию
     * если они не null. В случае отсутствии всех параметров возращается пустой List.
     * @param findCarDto DTO с заполненными свойствами для поиска
     * @return массив {@link Car}
     */
    public List<Car> findByAllParametr(FindCarDto findCarDto) {
        Set<Attribute> attributeSet = new HashSet<>();
        for (Field field: findCarDto.getClass().getDeclaredFields()) {
            attributeSet.add(new Attribute(findCarDto,field));
        }
        List<Car> byAllParametr = new ArrayList<>();
        //todo: add ExceptionHandler
        try {
          byAllParametr = (List<Car>) carRepo.findByAllParametr(attributeSet);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        return  byAllParametr;
    }

    /**
     * Проверка наличия аренды на автомобиле. Если аренда на данный момент
     * присутствует false иначе true
     * @param rentSet коллекция с договорами аренды {@link Rent }
     * @return результат поиска аренды true/false
     */
    private boolean freeCar(Set<Rent> rentSet) {
        if (rentSet.size() == 0)
            return true;
        Date today = new Date();
        Timestamp timestamp = new Timestamp(today.getTime());
        for(Rent el: rentSet){
            if(el.getDataEnd().after(timestamp)) {
                return false;
            }
        }

        return true;
    }

}
