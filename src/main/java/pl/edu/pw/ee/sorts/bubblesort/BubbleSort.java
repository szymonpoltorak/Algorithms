package pl.edu.pw.ee.sorts.bubblesort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    private BubbleSort(){}

    public static void main(String[] args){
        var intArray = new int[10];
        var random = new Random();

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt() * 99 + 1;
        }
        System.out.println("Int array: " + Arrays.toString(intArray));

        BubbleSort.bubbleSortAscending(intArray);
        System.out.println("Sorted int array ascending: " + Arrays.toString(intArray));

        BubbleSort.bubbleSortDescending(intArray);
        System.out.println("Sorted int array descending: " + Arrays.toString(intArray));
    }

    public static void bubbleSortAscending(int @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] > array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAscending(double @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] > array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAscending(float @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] > array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] < array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(float @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] < array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(double @NotNull [] array){
        for (int i = 0; i < array.length; i++){
            for (int j  = 1; j < array.length; j++){
                if (array[j-1] < array[j]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
