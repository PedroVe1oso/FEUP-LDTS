package pt.up.fe.ldts.patterns.transformer;

import pt.up.fe.ldts.patterns.StringDrink;

/**
 * @author Tatiana Fritzová
 */
public class StringReplacer implements StringTransformer {

    private char character;
    private char replacement;

    public StringReplacer(char character, char replacement) {
        this.character = character;
        this.replacement = replacement;
    }


    @Override
    public void execute(StringDrink drink) {
        String replaced = drink.getText()
                .replace(character, replacement);
        drink.setText(replaced);
    }

    @Override
    public void undo(StringDrink drink) {
        String replaced = drink.getText()
                .replace(replacement, character);
        drink.setText(replaced);
    }
}
