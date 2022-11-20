package pt.up.fe.ldts.patterns.transformer;

import pt.up.fe.ldts.patterns.StringDrink;

/**
 * @author Tatiana Fritzová
 */
public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder();
        for (char c : drink.getText().toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        drink.setText(sb.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
