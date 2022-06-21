package pl.edu.pw.ee.sorts.insort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class InsertionSort {
    private InsertionSort(){}

    public static void main(String[] args){
        var doubleArray = new double[10];

        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = Math.random() * 99 + 1;
        }
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        InsertionSort.insertSortAscending(doubleArray);
        System.out.println("Sorted double array ascending: " + Arrays.toString(doubleArray));

        InsertionSort.insertSortDescending(doubleArray);
        System.out.println("Sorted double array descending: " + Arrays.toString(doubleArray));
    }

    public static void insertSortAscending(double @NotNull [] array){
        for (int i = 1; i < array.length; i++){
            var key = array[i];
            var j = i - 1;

            while (j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void insertSortDescending(double @NotNull [] array){
        for (int i = 1; i < array.length; i++){
            var key = array[i];
            var j = i - 1;

            while (j >= 0 && key > array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
