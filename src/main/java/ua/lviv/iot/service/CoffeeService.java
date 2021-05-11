package ua.lviv.iot.service;

import ua.lviv.iot.model.Coffee;

import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeService {
    private static int id = 1;
    static Map<Integer, Coffee> coffeeMap = new HashMap<Integer, Coffee>();

    public List<Coffee> getAllCoffee() {
        return new ArrayList<Coffee>(coffeeMap.values());
    }

    public Coffee getCoffee(int id) {
        Coffee coffee = coffeeMap.get(id);
        if (coffee == null) {
            throw new NotFoundException();
        }
        return coffee;
    }

    public Coffee addCoffee(Coffee coffee) {
        coffee.setId(id);
        coffeeMap.put(id++, coffee);
        return coffee;
    }

    public Coffee updateCoffee(Coffee coffee) {
        Coffee coffeeExist = coffeeMap.get(coffee.getId());
        if (coffeeExist == null) {
            throw new NotFoundException();
        }
        coffeeMap.put(coffee.getId(), coffee);
        return coffeeExist;
    }

    public Coffee deleteCoffee(int id) {
        Coffee coffee = coffeeMap.get(id);
        if (coffee == null) {
            throw new NotFoundException();
        }
        coffeeMap.remove(id);
        return coffee;
    }
}
