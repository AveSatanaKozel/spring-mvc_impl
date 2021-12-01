package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.sevice.CarService;
import web.sevice.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")

    public String carRequest(@RequestParam(value = "count", required = false) String count, Model model) {

        CarService carService = new CarServiceImpl();

        Car bugatti = new Car("Bugatti - Chiron", 2021, "W16");
        Car mustang = new Car("Ford - Mustang", 2019, "V8");
        Car raptor = new Car("Ford - Raptor", 2020, "V8");
        Car priora = new Car("Lada - priora", 2020, "R4");
        Car car = new Car("CAR!", 2022, "S15");

        List<Car> carList = new ArrayList();
        carList.add(bugatti);
        carList.add(mustang);
        carList.add(raptor);
        carList.add(priora);
        carList.add(car);

        carService.watchCar(carList, model, count);

        return "cars";
    }
}
