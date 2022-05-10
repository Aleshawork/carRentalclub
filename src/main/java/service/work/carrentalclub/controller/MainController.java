package service.work.carrentalclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.work.carrentalclub.service.FeedBackService;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private FeedBackService feedBackService;

    @GetMapping
    public String greeting(Model model) {
        model.addAttribute("feedBacks", feedBackService.findAll());
        return "greeting";
    }

}
