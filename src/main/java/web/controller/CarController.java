package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;


@Controller
public class CarController {
    private final CarService carsService;

    public CarController(CarService carsService) {
        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue="5") Integer count, ModelMap model) {
        model.addAttribute("cars", carsService.getCarsByCount(count));
        return "cars";
    }
}