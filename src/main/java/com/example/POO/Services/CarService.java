package com.example.POO.Services;

import com.example.POO.Models.Car;
import com.example.POO.Repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    final
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Car car, Long code) {
        Car carNow = carRepository.findById(code).get();

        carNow.setModel(car.getModel());
        carNow.setDealership(car.getDealership());
        carNow.setFabricationAge(car.getFabricationAge());

        return carRepository.save(carNow);
    }
    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
