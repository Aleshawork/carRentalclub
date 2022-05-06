package service.work.carrentalclub.service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.work.carrentalclub.dto.FindCarDto;
import service.work.carrentalclub.model.Car;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class CarServiceTest extends BaseAbstractTest {

    @Autowired
    private CarService carService;


    @Test
    void shouldGetAllCars() {
        List<Car> all = carService.findAll();
        assertEquals(all.size(), 3);
    }

    @Test
    public void shouldGetFreeCars() {
        List<Car> freeCar = carService.findFreeCar();
        assertEquals(2,freeCar.size());
    }


    @Test
    public void ShouldGetByColorAndMarkParametr() {
        List<Car> byAllParametr = carService.findByAllParametr(
                FindCarDto.builder()
                        .color("red")
                        .mark("BMV").build()
        );
        assertEquals( 2,byAllParametr.size());

    }

    @Test
    public void shouldGetByPriceAndMarkAndColor() {
        List<Car> byAllParametr = carService.findByAllParametr(FindCarDto.builder()
                .price(12234.3)
                .color("blue")
                .mark("Reno")
                .build());
        assertEquals(1, byAllParametr.size());
    }
}