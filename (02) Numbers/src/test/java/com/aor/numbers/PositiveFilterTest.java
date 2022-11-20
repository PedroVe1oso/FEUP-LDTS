package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    @Test
    public void accept() {
        GenericListFilter positiveFilter = new PositiveFilter();
        List<Integer> positives = Arrays.asList(1, 10, 100, 1000, Integer.MAX_VALUE);
        List<Integer> notPositives = Arrays.asList(0, -1, -10, -100, -1000, Integer.MIN_VALUE);

        for (int number : positives) {
            Assertions.assertTrue(positiveFilter.accept(number));
        }
        for (int number : notPositives) {
            Assertions.assertFalse(positiveFilter.accept(number));
        }
    }
}
