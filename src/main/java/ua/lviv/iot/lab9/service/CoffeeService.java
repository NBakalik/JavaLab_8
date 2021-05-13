package ua.lviv.iot.lab9.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.lab9.model.Coffee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@ApplicationScope
public class CoffeeService {

    private AtomicInteger id = new AtomicInteger(0);
    Map<Integer, Coffee> coffeeMap = new HashMap<>();

    public Coffee addCoffee(Coffee coffee) {
        int orderId = id.incrementAndGet();
        coffee.setId(orderId);
        coffeeMap.put(orderId, coffee);
        return coffee;
    }

    public List<Coffee> getAllCoffee() {
        return new ArrayList<>(coffeeMap.values());
    }

    public Coffee getCoffee(Integer id) {
        return coffeeMap.get(id);
    }

    public Coffee updateCoffee(Coffee coffee) {
        coffeeMap.put(coffee.getId(), coffee);
        return coffee;
    }

    public Coffee deleteCoffee(Integer id) {
        return coffeeMap.remove(id);
    }
}
