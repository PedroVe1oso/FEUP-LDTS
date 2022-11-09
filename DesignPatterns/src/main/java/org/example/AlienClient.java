package org.example;

public abstract class AlienClient implements Client {
    private OrderingStrategy strategy;

    public AlienClient() {
        this.strategy = createOrderingStrategy();
    }
    @Override
    public void happyHourStarted(Bar bar) {

    }
    @Override
    public void happyHourEnded(Bar bar) {

    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {

    }
    protected abstract OrderingStrategy createOrderingStrategy();
}
