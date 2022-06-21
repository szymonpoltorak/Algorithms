package pl.edu.pw.ee.sorts.mergesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {
    @Test
    void mergeSort_test_pass(){
        //given
        var result = new double[]{8.7, 6.4, 4.2, 7.9, 3.2, 5.3, 1.3};
        var expected = new double[]{1.3, 3.2, 4.2, 5.3, 6.4, 7.9, 8.7};

        //when
        MergeSort.sort(result, 0, result.length - 1);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
