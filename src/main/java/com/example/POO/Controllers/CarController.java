package com.example.POO.Controllers;

import com.example.POO.Models.Car;
import com.example.POO.Models.Customer;
import com.example.POO.Repositories.CarRepository;
import com.example.POO.Services.CarService;
import com.example.POO.Services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    List<Car> listAllCars(){
        return carService.findAll();
    }
    @PostMapping
    Car saveCars(@RequestBody Car car) {
        return carService.save(car);
    }

    @PutMapping("/{code}")
    Car updateCar(@RequestBody Car car, @PathVariable Long code) {
        return carService.updateCar(car, code);
    }

    @DeleteMapping("/{code}")
    public void deleteCar(@PathVariable Long code) {
        carService.delete(code);
    }
}
