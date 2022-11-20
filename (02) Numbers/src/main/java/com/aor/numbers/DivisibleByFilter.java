package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private int divider;

    public DivisibleByFilter(int number) {
        divider = number;
    }

    @Override
    public boolean accept(Integer number) {
        return (number % divider) == 0;
    }
}
