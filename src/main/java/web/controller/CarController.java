package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.sevice.CarService;
import web.sevice.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping("/cars")

    public String carRequest(@RequestParam(value = "count", required = false) Integer count, Model model) {

        CarService carService = new CarServiceImpl();

        model.addAttribute("carList", carService.watchCar(count));

        return "cars";
    }
}
