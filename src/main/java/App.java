import managers.CoffeeMineManager;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Coffee espresso = new Coffee("espresso", 45, 70, Country.BRAZIL, CoffeeType.INSTANT_JARS, 100);
        Coffee americano = new Coffee("americano", 15, 90, Country.GERMANY, CoffeeType.GROUND, 130);
        Coffee cappuccino = Coffee.builder()
                .name("cappuccino")
                .price(150)
                .volumeInMl(150)
                .country(Country.ITALY)
                .coffeeType(CoffeeType.INSTANT_BAGS)
                .coffeeWeight(300)
                .build();
        Cocktail cocktail = new Cocktail("mojito", 200, 150,Country.USA,"do some",CupType.COCKTAIL);

        List<Drink> arrayOfDrinks = new ArrayList<Drink>();
        arrayOfDrinks.add(espresso);
        arrayOfDrinks.add(americano);
        arrayOfDrinks.add(cappuccino);
        arrayOfDrinks.add(cocktail);

        CoffeeMineManager manager = new CoffeeMineManager(arrayOfDrinks);
        System.out.println("---ALL DRINKS---");
        manager.printAllDrinks();
        System.out.println("---FINDED DRINK BY COFFEE TYPE---");
        System.out.println(manager.searchByCoffee(CoffeeType.INSTANT_BAGS));
        System.out.println("---SORTED BY PRICE---");
        manager.sortByPrice(SortOrder.ASC);
        System.out.println("---SORTED BY COFFEE WEIGHT---");
        manager.sortByAmountOfCoffee(SortOrder.ASC);
    }
}
