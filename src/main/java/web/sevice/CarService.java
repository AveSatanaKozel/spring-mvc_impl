package web.sevice;

import org.springframework.ui.Model;
import web.model.Car;

import java.util.List;

public interface CarService {
    void watchCar(List<Car> list, Model model, String count);
}
