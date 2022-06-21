package pl.edu.pw.ee.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {
    private MergeSort(){}

    public static void main(String[] args){
        var doubleArray = new double[5];

        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = Math.random() * 99 + 1;
        }
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        MergeSort.sort(doubleArray, 0, doubleArray.length - 1);
        System.out.println("Sorted double array : " + Arrays.toString(doubleArray));
    }

    public static void merge(double[] array, int subStartIndex, int subEndIndex, int size){
        var subArrayA = new double[subEndIndex - subStartIndex + 1];
        var subArrayB = new double[size - subEndIndex];
        var indexA = 0;
        var indexB = 0;
        var indexArray = subStartIndex;

        for (int i = 0; i < subArrayA.length; i++){
            subArrayA[i] = array[subStartIndex + i];
        }
        for (int i = 0; i < subArrayB.length; i++){
            subArrayB[i] = array[subEndIndex + i + 1];
        }

        while (indexA < subArrayA.length && indexB < subArrayB.length){
            if (subArrayA[indexA] <= subArrayB[indexB]){
                array[indexArray++] = subArrayA[indexA++];
            }
            else {
                array[indexArray++] = subArrayB[indexB++];
            }
        }

        while (indexA < subArrayA.length){
            array[indexArray++] = subArrayA[indexA++];
        }
        while (indexB < subArrayB.length){
            array[indexArray++] = subArrayB[indexB++];
        }
    }

    public static void sort(double[] array, int subStartIndex, int size){
        if (subStartIndex >= size){
            return;
        }
        int subEndIndex = (subStartIndex + size) / 2;

        MergeSort.sort(array, subStartIndex, subEndIndex);
        MergeSort.sort(array, subEndIndex + 1, size);
        MergeSort.merge(array, subStartIndex, subEndIndex, size);
    }
}
