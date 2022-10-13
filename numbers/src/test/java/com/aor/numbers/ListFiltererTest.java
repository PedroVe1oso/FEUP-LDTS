package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class ListFiltererTest {
    @Test
    public void filter(){
        GenericListFilter filter = Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(1)).thenReturn(false);
        Mockito.when(filter.accept(2)).thenReturn(true);
        Mockito.when(filter.accept(3)).thenReturn(false);
        Mockito.when(filter.accept(4)).thenReturn(true);
        Mockito.when(filter.accept(5)).thenReturn(false);
        Mockito.when(filter.accept(6)).thenReturn(true);

        Mockito.when(filter.accept(7)).thenReturn(true);
        Mockito.when(filter.accept(-10)).thenReturn(false);
        Mockito.when(filter.accept(-1)).thenReturn(false);
        Mockito.when(filter.accept(23)).thenReturn(true);
        Mockito.when(filter.accept(-4)).thenReturn(false);
        Mockito.when(filter.accept(9)).thenReturn(true);


        ListFilterer filterer = new ListFilterer(filter);
        Assertions.assertEquals(Arrays.asList(2, 4, 6), filterer.filter(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertEquals(Arrays.asList(7, 23, 9), filterer.filter(Arrays.asList(7, -10, -1, 23, -4, 9)));
    }
}
