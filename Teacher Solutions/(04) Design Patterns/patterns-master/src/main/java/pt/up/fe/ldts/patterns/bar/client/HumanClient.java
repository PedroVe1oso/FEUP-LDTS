package pt.up.fe.ldts.patterns.bar.client;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.Bar;
import pt.up.fe.ldts.patterns.bar.StringBar;
import pt.up.fe.ldts.patterns.bar.strategy.OrderingStrategy;

public class HumanClient implements Client {

    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar)
            strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourStarted((StringBar) bar);
        }
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

}
