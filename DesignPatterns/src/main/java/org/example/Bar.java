package org.example;

public abstract class Bar {
    protected boolean isHappyHour;

    public boolean getIsHappyHour() {
        return isHappyHour;
    }

    public void setIsHappyHour(boolean isHappyHour) {
        this.isHappyHour = isHappyHour;
    }

    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();
}
