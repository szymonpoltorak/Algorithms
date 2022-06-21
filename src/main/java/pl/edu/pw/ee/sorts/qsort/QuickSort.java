package pl.edu.pw.ee.sorts.qsort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class QuickSort {
    private QuickSort(){}

    public static void main(String[] args){
        var doubleArray = new double[10];

        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = Math.random() * 99 + 1;
        }
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        QuickSort.qsortAscending(doubleArray, 0, doubleArray.length - 1);
        System.out.println("Sorted double array ascending: " + Arrays.toString(doubleArray));

        QuickSort.qsortDescending(doubleArray, 0, doubleArray.length - 1);
        System.out.println("Sorted double array descending: " + Arrays.toString(doubleArray));
    }

    private static int participateMax(double @NotNull [] array, int min, int max){
        var pivot = array[max];
        var i = min - 1;

        for (int j = min; j < max; j++){
            if (array[j] <= pivot){
                var temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i+1];
        array[i+1] = array[max];
        array[max] = temp;

        return i + 1;
    }

    private static int participateMin(double @NotNull [] array, int min, int max){
        var pivot = array[max];
        var i = min - 1;

        for (int j = min; j < max; j++){
            if (array[j] >= pivot){
                var temp = array[++i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i+1];
        array[i+1] = array[max];
        array[max] = temp;

        return i + 1;
    }

    public static void qsortAscending(double[] array, int min, int max){
        if (min < max){
            var pivot = QuickSort.participateMax(array, min, max);

            QuickSort.qsortAscending(array, min, pivot - 1);

            QuickSort.qsortAscending(array, pivot + 1, max);
        }
    }

    public static void qsortDescending(double[] array, int min, int max){
        if (min < max){
            var pivot = QuickSort.participateMin(array, min, max);

            QuickSort.qsortDescending(array, min, pivot - 1);

            QuickSort.qsortDescending(array, pivot + 1, max);
        }
    }
}
