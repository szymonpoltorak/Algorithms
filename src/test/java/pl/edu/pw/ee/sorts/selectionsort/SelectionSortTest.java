package pl.edu.pw.ee.sorts.selectionsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
    @Test
    void selectionSortAscending_test_pass(){
        //given
        var expected = new float[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var result = new float[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        SelectionSort.selectionSortAscending(result);

        //then
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void selectionSortDescending_test_pass(){
        //given
        var expected = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1};
        var result = new int[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        SelectionSort.selectionSortDescending(result);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
