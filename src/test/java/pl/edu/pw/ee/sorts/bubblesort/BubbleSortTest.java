package pl.edu.pw.ee.sorts.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void bubbleSortAscending_test_pass(){
        //given
        var expected = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var result = new int[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        BubbleSort.bubbleSortAscending(result);

        //then
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void bubbleSortDescending_test_pass(){
        //given
        var expected = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1};
        var result = new int[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        BubbleSort.bubbleSortDescending(result);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
