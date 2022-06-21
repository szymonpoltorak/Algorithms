package pl.edu.pw.ee.sorts.countingsort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class CountingSort {
    private CountingSort(){}

    public static void main(String[] args) {
        var intArray = new int[10];
        var random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt() * 99 + 1;
        }
        System.out.println("Int array: " + Arrays.toString(intArray));

        CountingSort.countSort(intArray);
        System.out.println("Sorted int array: " + Arrays.toString(intArray));
    }

    public static void countSort(int @NotNull [] array) {
        var max = 0;
        var sorted = new int[array.length];

        for (var i : array) {
            if (max < i) {
                max = i;
            }
        }

        var counter = new int[max + 1];
        for (var i : array) {
            counter[i]++;
        }

        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        for (var i : array) {
            var index = counter[i] - 1;
            sorted[index] = i;
            counter[i]--;
        }

        System.arraycopy(sorted, 0, array, 0, array.length);
    }
}