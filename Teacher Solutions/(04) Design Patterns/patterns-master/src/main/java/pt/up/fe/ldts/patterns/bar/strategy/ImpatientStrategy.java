package pt.up.fe.ldts.patterns.bar.strategy;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.StringBar;

/**
 * @author Tatiana Fritzová
 */
public class ImpatientStrategy implements OrderingStrategy {

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}
