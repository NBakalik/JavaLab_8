package models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Wine extends AlcoholDrink{
    private WineType wineType;

    public Wine(String name, double price, int volumeInMl, Country country, int year, int alcoholByVolume,
                WineType wineType) {
        super(name, price, volumeInMl, country, year, alcoholByVolume);
        this.wineType = wineType;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Wine{" +
                "wineType=" + wineType +
                '}';
    }
}
