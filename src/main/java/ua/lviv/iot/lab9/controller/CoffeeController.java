package ua.lviv.iot.lab9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ua.lviv.iot.lab9.model.Coffee;
import ua.lviv.iot.lab9.service.CoffeeService;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("/{id}")
    public Object getCoffee(@PathVariable(name = "id") Integer id) {
        if (coffeeService.getCoffee(id) != null) {
            return coffeeService.getCoffee(id);
        } else {
            return new ResponseEntity<Coffee>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping()
    public List<Coffee> getAllCoffee() {
        return coffeeService.getAllCoffee();
    }

    @PostMapping()
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        return coffeeService.addCoffee(coffee);
    }

    @PutMapping()
    public Object updateCoffee(@RequestBody Coffee coffee) {
        if (coffeeService.getCoffee(coffee.getId()) != null) {
            return coffeeService.updateCoffee(coffee);
        } else {
            return new ResponseEntity<Coffee>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public Object deleteCoffee(@PathVariable(name = "id") Integer id) {
        if (coffeeService.getCoffee(id) != null) {
            return coffeeService.deleteCoffee(id);
        } else {
            return new ResponseEntity<Coffee>(HttpStatus.NOT_FOUND);
        }
    }
}
