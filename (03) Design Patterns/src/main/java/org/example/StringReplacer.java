package org.example;

public class StringReplacer implements StringTransformer{

    private char a;
    private char b;

    public StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText().replace(a, b);
        drink.setText(str);
    }

    @Override
    public void undo(StringDrink drink) {
        String str = drink.getText().replace(b, a);
        drink.setText(str);
    }
}
