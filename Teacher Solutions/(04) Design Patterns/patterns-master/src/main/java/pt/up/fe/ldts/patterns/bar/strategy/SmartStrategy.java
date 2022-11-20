package pt.up.fe.ldts.patterns.bar.strategy;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.StringBar;

/**
 * @author Tatiana Fritzová
 */
public class SmartStrategy implements OrderingStrategy {

    private StringOrder order;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            this.order = new StringOrder(bar, recipe, drink);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        if (order != null && order.bar.equals(bar)) {
            bar.order(order.drink, order.recipe);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }

    private static class StringOrder {

        private final StringBar bar;
        private final StringRecipe recipe;
        private final StringDrink drink;

        public StringOrder(StringBar bar, StringRecipe recipe, StringDrink drink) {
            this.bar = bar;
            this.recipe = recipe;
            this.drink = drink;
        }
    }
}
