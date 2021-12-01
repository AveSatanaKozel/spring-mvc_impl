package web.sevice;

import org.springframework.ui.Model;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {


    @Override
    public void watchCar(List<Car> list, Model model, String count) {
        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("carList", list);
        } else {
            model.addAttribute("carList", list.stream()
                    .limit(Integer.parseInt(count)).collect(Collectors.toList()));
        }
    }
}
