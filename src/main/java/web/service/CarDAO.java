package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> carlist;

    {
        carlist = new ArrayList<>();

        carlist.add(new Car("BMW", "Germany", 2014));
        carlist.add(new Car("Hyundai", "South Korea", 2023));
        carlist.add(new Car("Audi", "Germany", 2024));
        carlist.add(new Car("Nissan", "Japan", 1999));
        carlist.add(new Car("Aurus Senat", "Russia", 2024));
    }

    public List<Car> getCarlist() {
        return carlist;
    }

    public List<Car> getListByCount(int count) {
        List<Car> list = new ArrayList<>();

        if (count >= carlist.size()) {
            return getCarlist();
        } else {
            for (int i = 0; i < count; i++) {
                list.add(carlist.get(i));
            }
            return list;
        }
    }
}
