package pl.edu.pw.ee.sorts.shellsort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShellSortTest {
    @Test
    void shellSort_test_pass(){
        //given
        var expected = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var result = new int[]{ 7, 2, 9, 4, 1, 5, 3, 8, 6};

        //when
        ShellSort.shellSort(result);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
