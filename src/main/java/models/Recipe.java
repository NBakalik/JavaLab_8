package models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Recipe {
    private String description;
    private Ingredient[] ingredient;
    private Cocktail cocktail;

    public Recipe(String description, Ingredient[] ingredient, String name, double price, int volumeInMl,
                  Country country, String receipt, CupType cupType) {
        this.description = description;
        this.ingredient = ingredient;
        cocktail = new Cocktail(name, price, volumeInMl, country, receipt, cupType);
    }
}
