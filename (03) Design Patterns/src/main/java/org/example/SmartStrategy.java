package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    List<StringRecipe> recipes = new ArrayList<>();
    List<StringDrink> drinks = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour())
            bar.order(drink, recipe);
        else {
            this.recipes.add(recipe);
            this.drinks.add(drink);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        while(!recipes.isEmpty()) {
            wants(drinks.get(0), recipes.get(0), bar);
            drinks.remove(0);
            recipes.remove(0);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
