package pt.up.fe.ldts.patterns.bar;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {

    private boolean isHappyHour = false;

    public StringBar() {
        this(new ArrayList<>());
    }

    public StringBar(List<BarObserver> observers) {
        super(observers);
    }

    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour() {
        isHappyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
