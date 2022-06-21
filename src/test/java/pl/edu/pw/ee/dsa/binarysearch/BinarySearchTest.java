package pl.edu.pw.ee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    @Test
    void binarySearchIterative_test_pass(){
        //given
        var expected = 3;
        var array = new int[]{2,7,9,25,80,91};
        var toBeFound = 25;

        //when
        var result = BinarySearch.binarySearchIterative(array, toBeFound, 0, array.length - 1);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void binarySearchRecursive_test_pass(){
        //given
        var expected = 4;
        var array = new int[]{4,5,7,8,15,18,27,31};
        var toBeFound = 15;

        //when
        var result = BinarySearch.binarySearchIterative(array, toBeFound, 0, array.length - 1);

        //then
        Assertions.assertEquals(expected, result);
    }
}
