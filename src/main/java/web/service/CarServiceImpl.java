package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = createCarList();
    @Override
    public List<Car> getCarsByCount(int count) {
        if (count < cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
    public List<Car> createCarList() {
        List<Car> allCars = new ArrayList<>();
        allCars.add(new Car(1L, "Toyota Camry", 2020));
        allCars.add(new Car(2L, "Honda Civic", 2019));
        allCars.add(new Car(3L, "Ford Mustang", 2018));
        allCars.add(new Car(4L, "Chevrolet Silverado", 2021));
        allCars.add(new Car(5L, "Jeep Wrangler", 2017));
        return allCars;
    }
}
