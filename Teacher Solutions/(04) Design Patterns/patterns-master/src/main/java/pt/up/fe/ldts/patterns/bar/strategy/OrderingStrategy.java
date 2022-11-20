package pt.up.fe.ldts.patterns.bar.strategy;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.StringBar;

/**
 * @author Tatiana Fritzová
 */
public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
