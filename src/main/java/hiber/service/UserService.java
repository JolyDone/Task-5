package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(Object o);
    List<User> listUsers();
    List<Car> listCars();

    User getUserByCar(String model, int series);
}
