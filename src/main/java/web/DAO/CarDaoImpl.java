package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "green", 2019));
        cars.add(new Car("BMW", "black", 2007));
        cars.add(new Car("Toyota", "blue", 2020));
        cars.add(new Car("Porsche", "yellow", 2010));
        cars.add(new Car("Volkswagen", "white", 2000));

    }

    @Override
    public List<Car> getCarList(int count) {
        return (count >= 0) ? cars.subList(0, Math.min(count, cars.size())) : cars;
    }
}
