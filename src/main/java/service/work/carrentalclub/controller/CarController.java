package service.work.carrentalclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.work.carrentalclub.model.TopOfCars;
import service.work.carrentalclub.service.CarService;
import service.work.carrentalclub.service.TopOfCarService;

import java.util.List;


@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private TopOfCarService topOfCarService;

    @GetMapping("/all")
    public String allFreeCars() {
        return "null";
    }

    @GetMapping("/notes/{userId}")
    public String notesCar(@PathVariable int userId, Model model) {
        List<TopOfCars> notes = topOfCarService.findByUserId(userId);
        model.addAttribute("notes",notes);
        return "listNotes";
    }


}
