package pt.up.fe.ldts.patterns.bar.client;

import pt.up.fe.ldts.patterns.StringDrink;
import pt.up.fe.ldts.patterns.StringRecipe;
import pt.up.fe.ldts.patterns.bar.BarObserver;
import pt.up.fe.ldts.patterns.bar.StringBar;

public interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
