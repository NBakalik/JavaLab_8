package ua.lviv.iot.lab9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.lab9.model.Coffee;
import ua.lviv.iot.lab9.repo.CoffeeRepository;

import java.util.List;

@Service
@ApplicationScope
public class CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public Coffee addCoffee(Coffee coffee) {
        coffeeRepository.save(coffee);
        return coffee;
    }

    public List<Coffee> getAllCoffee() {
        return (List<Coffee>) coffeeRepository.findAll();
    }

    public Coffee getCoffee(Integer id) {
        return coffeeRepository.findById(id).orElse(null);
    }

    public Coffee updateCoffee(Coffee coffee) {
        coffeeRepository.save(coffee);
        return coffee;
    }

    public Coffee deleteCoffee(Integer id) {
        Coffee coffee = coffeeRepository.findById(id).orElse(null);
        coffeeRepository.deleteById(id);
        return coffee;
    }
}
