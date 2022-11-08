package org.example;

public class StringBar extends Bar{
    @Override
    public boolean isHappyHour() {
        return getIsHappyHour();
    }
    @Override
    public void startHappyHour() {
        setIsHappyHour(true);
    }
    @Override
    public void endHappyHour() {
        setIsHappyHour(false);
    }
}
