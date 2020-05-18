package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    public CarService() {
    }

    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("VAZ-11193", "в734св152", 164, "green"));
        list.add(new Car("VAZ-21093", "н344ух52", 138, "white"));
        list.add(new Car("IZH-2126", "х956се52", 115, "blue"));
        return list;
    }
}
