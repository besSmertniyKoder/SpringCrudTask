package web.service;

import web.model.Car;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> carList = new LinkedList<>();

    public List<Car> printCars() {
        carList.add(new Car("lada", "cumlina", "a33fjjf"));
        carList.add(new Car("bmw", "ee", "5555rgf"));
        carList.add(new Car("olga", "mohzga", "plate"));
        carList.add(new Car("monika", "maine", "nsdmf"));
        carList.add(new Car("kia", "korea", "aboba"));
        return carList;
    }


    @Override
    public List<Car> getCarByNum(int id) {

        return carList.stream().limit(id).collect(Collectors.toList());

    }
}
