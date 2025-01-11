package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarDAO;


@Controller
public class CarsController {

    private final CarDAO service;

    public CarsController(CarDAO service) {
        this.service = service;
    }



    @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("carList", service.getListByCount(count));
        return "cars";
    }
}
