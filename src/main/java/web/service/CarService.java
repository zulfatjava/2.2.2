package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> carsFromList(List<Car> cars, int count);

    List<Car> getCars();
}
