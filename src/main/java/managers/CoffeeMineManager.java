package managers;

import models.Coffee;
import models.CoffeeType;
import models.Drink;
import models.SortOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeMineManager {
    private List<Drink> drinks = new ArrayList<Drink>();

    public CoffeeMineManager(List<Drink> drinks) {
        this.drinks.addAll(drinks);
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
    }

    public void addDrinks(List<Drink> drinks) {
        this.drinks.addAll(drinks);
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC)
            drinks.stream().sorted(Comparator.comparing(Drink::getPrice)).forEach(System.out::println);
        else
            drinks.stream().sorted(Comparator.comparing(Drink::getPrice).reversed()).forEach(System.out::println);
    }

    public void sortByAmountOfCoffee(SortOrder order) {
        List<Coffee> coffees = getCoffeeFromDrink();
        if (order == SortOrder.ASC)
            coffees.stream().sorted(Comparator.comparing(Coffee::getCoffeeWeight)).forEach(System.out::println);
        else
            coffees.stream().sorted(Comparator.comparing(Coffee::getCoffeeWeight).reversed()).forEach(System.out::println);
    }

    public List<Coffee> searchByCoffee(CoffeeType coffeeType) {
        List<Coffee> coffees = getCoffeeFromDrink();
        return coffees.stream().filter(coffee -> coffee.getCoffeeType() == coffeeType).collect(Collectors.toList());
    }

    public void printAllDrinks() {
        drinks.forEach(System.out::println);
    }

    public List<Coffee> getCoffeeFromDrink(){
        List<Coffee> coffees = new ArrayList<Coffee>();
        this.drinks.forEach(i -> {
            if (i.getClass().equals(Coffee.class))
                coffees.add((Coffee) i);
        });
        return coffees;
    }
}
