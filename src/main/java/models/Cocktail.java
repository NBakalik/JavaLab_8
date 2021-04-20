package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Cocktail extends Drink{
    private String receipt;
    private CupType cupType;


    public Cocktail(String name, double price, int volumeInMl, Country country, String receipt, CupType cupType) {
        super(name, price, volumeInMl, country);
        this.receipt = receipt;
        this.cupType = cupType;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Cocktail{" +
                "receipt='" + receipt + '\'' +
                ", cupType=" + cupType +
                '}';
    }
}
