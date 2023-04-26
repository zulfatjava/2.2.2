package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> carsFromList(List<Car> cars, int count) {
        if (count >= 5)
            return cars;
        else
            return cars.stream().limit(count).toList();
    }
    @Override
    public List<Car>getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Mers", "black"));
        cars.add(new Car(2, "BMW", "pink"));
        cars.add(new Car(3, "Lada", "white"));
        cars.add(new Car(4, "ZIL", "black"));
        cars.add(new Car(5, "Niva", "green"));
        return cars;
    }
}
