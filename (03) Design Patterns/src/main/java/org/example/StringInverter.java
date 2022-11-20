package org.example;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(drink.getText());
        drink.setText(stringBuilder.reverse().toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
