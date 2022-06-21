package pl.edu.pw.ee.sorts.qsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    void quickSortAscending_test_pass(){
        //given
        var expected = new double[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var result = new double[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        QuickSort.qsortAscending(result, 0, result.length - 1);

        //then
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void quickSortDescending_test_pass(){
        //given
        var expected = new double[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1};
        var result = new double[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        QuickSort.qsortDescending(result, 0, result.length - 1);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}