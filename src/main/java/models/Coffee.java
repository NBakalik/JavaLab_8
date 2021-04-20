package models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Coffee extends Drink{
    private CoffeeType coffeeType;
    private int coffeeWeight;

    public Coffee(String name, double price, int volumeInMl, Country country, CoffeeType coffeeType, int coffeeWeight) {
        super(name, price, volumeInMl, country);
        this.coffeeType = coffeeType;
        this.coffeeWeight = coffeeWeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Coffee{" +
                "coffeeType=" + coffeeType +
                ", coffeeWeight=" + coffeeWeight +
                '}';
    }
}
