package pl.edu.pw.ee.sorts.shellsort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    private ShellSort(){}

    public static void main(String[] args) {
        var intArray = new int[10];
        var random = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt() * 99 + 1;
        }
        System.out.println("Int array: " + Arrays.toString(intArray));

        ShellSort.shellSort(intArray);
        System.out.println("Sorted int array: " + Arrays.toString(intArray));
    }

    public static void shellSort(int @NotNull [] array){
        var size = array.length;

        for (int i = size / 2; i > 0; i /= 2){
            for (int j = i; j < size; j++){
                var temp = array[j];
                int k;

                for (k = j; k >= i && array[k-i] > temp; k -= i){
                    array[k] = array[k-i];
                }
                array[k] = temp;
            }
        }
    }
}
