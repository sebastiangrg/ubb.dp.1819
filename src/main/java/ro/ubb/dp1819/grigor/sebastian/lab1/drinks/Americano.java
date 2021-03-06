package ro.ubb.dp1819.grigor.sebastian.lab1.drinks;

import java.util.List;

/**
 * 4 cups water
 * 0.25 cups coffee-beans roasted
 */
public class Americano extends Drink {
    public Americano(List<Ingredient> ingredientList) {
        super(ingredientList);
    }

    @Override
    public void drink() {
        System.out.println("You are drinking an americano.");
    }
}
