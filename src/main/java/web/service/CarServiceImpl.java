package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarsByCount(int count) {
        List<Car> allCars = createCarList();
        if (count < allCars.size()) {
            return allCars.subList(0, Math.min(count, allCars.size()));
        } else {
            return allCars;
        }
    }
    public List<Car> createCarList() {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car();
        car1.setId(1L);
        car1.setModel("Toyota Camry");
        car1.setYear(2020);
        cars.add(car1);

        Car car2 = new Car();
        car2.setId(2L);
        car2.setModel("Honda Civic");
        car2.setYear(2019);
        cars.add(car2);

        Car car3 = new Car();
        car3.setId(3L);
        car3.setModel("Ford Mustang");
        car3.setYear(2018);
        cars.add(car3);

        Car car4 = new Car();
        car4.setId(4L);
        car4.setModel("Chevrolet Silverado");
        car4.setYear(2021);
        cars.add(car4);

        Car car5 = new Car();
        car5.setId(5L);
        car5.setModel("Jeep Wrangler");
        car5.setYear(2017);
        cars.add(car5);

        return cars;
    }
}
