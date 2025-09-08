package web.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2019));
        cars.add(new Car("BMW", "X5", 2020));
        cars.add(new Car("Mercedes", "C-Class", 2021));
        cars.add(new Car("Audi", "A4", 2018));
        cars.add(new Car("Tesla", "Model 3", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}