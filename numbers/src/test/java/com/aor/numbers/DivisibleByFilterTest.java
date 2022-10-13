package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    public void accept() {
        GenericListFilter divisibleByFilter = new DivisibleByFilter(2);
        List<Integer> divisible = Arrays.asList(0, 2, 4, 1000, 2600, 468000);
        List<Integer> notDivisible = Arrays.asList(1, 3, 5, 1001, 2709, 405793);

        for (int number : divisible) {
            Assertions.assertTrue(divisibleByFilter.accept(number));
        }
        for (int number : notDivisible) {
            Assertions.assertFalse(divisibleByFilter.accept(number));
        }
    }
}
