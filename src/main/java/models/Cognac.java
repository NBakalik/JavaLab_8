package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Cognac extends AlcoholDrink{
    private int stars;

    public Cognac(String name, double price, int volumeInMl, Country country, int year, int alcoholByVolume, int stars) {
        super(name, price, volumeInMl, country, year, alcoholByVolume);
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Cognac{" +
                "stars=" + stars +
                '}';
    }
}
