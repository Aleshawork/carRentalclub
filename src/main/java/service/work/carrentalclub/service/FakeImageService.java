package service.work.carrentalclub.service;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.Car;

import java.util.List;

/*
Сервис для поиска картинок к авто, на данный момент выдает заглушки
 */
@Service
public class FakeImageService {
    private final String AUDI_WHITE = "https://bfauto.ru/wp-content/uploads/8/e/1/8e1341d5bc601f83e538bcf74b2e61ec.jpeg";
    private final String BMV_WHITE = "https://fb.ru/media/i/2/8/9/8/7/i/28987.jpg";
    private final String BMV_RED = "https://s1.1zoom.ru/b5250/932/BMW_Sight_X5M_F85_Red_548834_2048x1152.jpg";
    private final String LEXUS_WHITE = "https://novostidnja.ru/wp-content/uploads/2021/06/scale_1200-6.jpg";
    private final String AUDI_BLACK = "http://www.blogcdn.com/slideshows/images/slides/342/204/0/S3422040/slug/l/01-2015-audi-q3-review-1.jpg";
    private final String LEXUS_BLACK = "https://avatars.mds.yandex.net/get-autoru-vos/1588575/ce12b653d65d45ae5403e56bd3309eb7/1200x900n";

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

        if (car.getMark().equals("audi") && car.getColor().equals("white")) {
            car.setImageUrl(AUDI_WHITE);
        } else if (car.getMark().equals("audi") && car.getColor().equals("black")) {
            car.setImageUrl(AUDI_BLACK);
        }  else if (car.getMark().equals("bmv") && car.getColor().equals("white")) {
            car.setImageUrl(BMV_WHITE);
        } else if (car.getMark().equals("bmv") && car.getColor().equals("red")) {
            car.setImageUrl(BMV_RED);
        } else if (car.getMark().equals("lexus") && car.getColor().equals("white")) {
            car.setImageUrl(LEXUS_WHITE);
        } else if (car.getMark().equals("lexus") && car.getColor().equals("black")) {
            car.setImageUrl(LEXUS_BLACK);
        } else car.setImageUrl(AUDI_WHITE);
    }


}
