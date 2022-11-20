package pt.up.fe.ldts.patterns.transformer;

import pt.up.fe.ldts.patterns.StringDrink;

/**
 * @author Tatiana Fritzová
 */
public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String reversed = new StringBuilder(drink.getText())
                .reverse()
                .toString();
        drink.setText(reversed);
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
