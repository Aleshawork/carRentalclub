package service.work.carrentalclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.work.carrentalclub.dto.FindCarDto;
import service.work.carrentalclub.model.Car;
import service.work.carrentalclub.model.TopOfCars;
import service.work.carrentalclub.service.CarService;
import service.work.carrentalclub.service.FakeImageService;
import service.work.carrentalclub.service.TopOfCarService;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private FakeImageService fakeImageService;

    @Autowired
    private CarService carService;

    @Autowired
    private TopOfCarService topOfCarService;

    @GetMapping("/all")
    public String all(Model model) {
        List<Car> all = carService.findAll();
        model.addAttribute("cars",all);
        return "cars";

    }

    @GetMapping("/{carId}")
    public String findById(@PathVariable int carId, Model model) {
        try {
            model.addAttribute("car", fakeImageService.setMark(carService.findById(carId)));
            return "car_info";
        } catch(NoResultException ex) {
            model.addAttribute("cars", carService.findFreeCar());
            return "cars_carts";
        }
    }

    @GetMapping("/free")
    public String allFreeCars(Model model) {
        List<Car> freeCar = fakeImageService.setAllMark(carService.findFreeCar());
        model.addAttribute("cars", freeCar);
        FindCarDto carDto = new FindCarDto();
        carDto.setActive(false);
        model.addAttribute("findCarDto", carDto);
        return "cars_carts";
    }

    //todo: продумать вариант поиск по параметрам по машинам в аренде на данные момент
    @GetMapping("/lizing")
    public String allLizingCars(Model model) {
        Set<Car> lizingCar = carService.findLizingCar();
        model.addAttribute("cars", lizingCar);
        return "cars";
    }

    @GetMapping("/notes/{userId}")
    public String notesCar(@PathVariable int userId, Model model) {
        List<TopOfCars> notes = topOfCarService.findByUserId(userId);
        model.addAttribute("notes",notes);
        return "listNotes";
    }

    //todo: убрать временный костыль с фильтрами в param запроса
    @GetMapping("/filter")
    public String filterCars(Model model, @RequestParam(value = "color") String color, @RequestParam("mark") String mark) {
        FindCarDto findCarDto = new FindCarDto();
        if (!Objects.isNull(color) && !"".equals(color)) {
            findCarDto.setColor(color);
        }
        if (!Objects.isNull(mark)) {
           findCarDto.setMark(mark);
        }

        List<Car> byAllParametr = fakeImageService.setAllMark(carService.findByAllParametr(findCarDto));
        model.addAttribute("cars", byAllParametr);
        return "cars_carts";
    }


}
