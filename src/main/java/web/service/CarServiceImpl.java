package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(1L, "Toyota Camry", 2020));
        cars.add(new Car(2L, "Honda Civic", 2019));
        cars.add(new Car(3L, "Ford Mustang", 2018));
        cars.add(new Car(4L, "Chevrolet Silverado", 2021));
        cars.add(new Car(5L, "Jeep Wrangler", 2017));
    }
    @Override
    public List<Car> getCarsByCount(int count) {
        if (count < cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }

}
