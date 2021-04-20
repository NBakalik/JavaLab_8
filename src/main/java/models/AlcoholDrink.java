package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
public class AlcoholDrink extends Drink {
    private int year;
    private int alcoholByVolume;

    public AlcoholDrink(String name, double price, int volumeInMl, Country country, int year, int alcoholByVolume) {
        super(name, price, volumeInMl, country);
        this.year = year;
        this.alcoholByVolume = alcoholByVolume;
    }

    @Override
    public String toString() {
        return super.toString() +
                " AlcoholDrink{" +
                "year=" + year +
                ", alcoholByVolume=" + alcoholByVolume +
                '}';
    }
}
