package service.work.carrentalclub.service;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.Car;

import java.util.List;

/*
Сервис для поиска картинок к авто, на данный момент выдает заглущки
 */
@Service
public class FakeImageService {
    private final String AUDI = "https://bfauto.ru/wp-content/uploads/8/e/1/8e1341d5bc601f83e538bcf74b2e61ec.jpeg";
    private final String BMV = "https://fb.ru/media/i/2/8/9/8/7/i/28987.jpg";
    private final String LEXUS = "https://novostidnja.ru/wp-content/uploads/2021/06/scale_1200-6.jpg";

    public List<Car> setAllMark(List<Car> cars) {
        for(Car car: cars) {
            identifyMark(car);
        }

        return cars;
    }
    public Car setMark(Car car) {
        identifyMark(car);
        return  car;
    }

    private void identifyMark(Car car) {
        switch (car.getMark()) {
            case "audi":
                car.setImageUrl(AUDI);
                break;
            case "bmv":
                car.setImageUrl(BMV);
                break;
            case "lexus":
                car.setImageUrl(LEXUS);
                break;
        }
    }


}
