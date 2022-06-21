package pl.edu.pw.ee.sorts.selectionsort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SelectionSort {
    private SelectionSort(){}

    public static void main(String[] args){
        var floatArray = new float[10];

        for (int i = 0; i < floatArray.length; i++){
            floatArray[i] = (float) (Math.random() * 99 + 1);
        }
        System.out.println("float array: " + Arrays.toString(floatArray));

        SelectionSort.selectionSortAscending(floatArray);
        System.out.println("Sorted float array ascending: " + Arrays.toString(floatArray));

        SelectionSort.selectionSortDescending(floatArray);
        System.out.println("Sorted float array descending: " + Arrays.toString(floatArray));
    }

    public static void selectionSortAscending(float @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var minimum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minimum]){
                    minimum = j;
                }
            }
            var temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }

    public static void selectionSortAscending(int @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var minimum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minimum]){
                    minimum = j;
                }
            }
            var temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }

    public static void selectionSortAscending(double @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var minimum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minimum]){
                    minimum = j;
                }
            }
            var temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
    }

    public static void selectionSortDescending(float @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var maximum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > array[maximum]){
                    maximum = j;
                }
            }
            var temp = array[i];
            array[i] = array[maximum];
            array[maximum] = temp;
        }
    }

    public static void selectionSortDescending(int @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var maximum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > array[maximum]){
                    maximum = j;
                }
            }
            var temp = array[i];
            array[i] = array[maximum];
            array[maximum] = temp;
        }
    }

    public static void selectionSortDescending(double @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            var maximum = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > array[maximum]){
                    maximum = j;
                }
            }
            var temp = array[i];
            array[i] = array[maximum];
            array[maximum] = temp;
        }
    }
}
