package web.sevice;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    Car bugatti = new Car("Bugatti - Chiron", 2021, "W16");
    Car mustang = new Car("Ford - Mustang", 2019, "V8");
    Car raptor = new Car("Ford - Raptor", 2020, "V8");
    Car priora = new Car("Lada - priora", 2020, "R4");
    Car car = new Car("CAR!", 2022, "S15");

    @Override
    public List<Car> watchCar(Integer count) {
        List<Car> list = new ArrayList();
        list.add(bugatti);
        list.add(mustang);
        list.add(raptor);
        list.add(priora);
        list.add(car);
        if (count == null) {
            return new ArrayList<>(list);
        } else if (count <= 4) {
            return list.stream()
                    .limit(count).collect(Collectors.toList());
        }
        return new ArrayList<>(list);
    }
}
