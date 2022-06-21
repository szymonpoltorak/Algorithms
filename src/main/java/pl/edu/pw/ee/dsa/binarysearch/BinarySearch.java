package pl.edu.pw.ee;

public class BinarySearch {
    private BinarySearch(){}

    public static int binarySearchIterative(int[] array, int toBeFound, int min, int max){
        while (max >= min){
            int midValue = min + (max - min) / 2;

            if (toBeFound == array[midValue]){
                return midValue;
            }
            else if(toBeFound > array[midValue]) {
                min = midValue + 1;
            }
            else {
                max = midValue - 1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] array, int toBeFound, int min, int max){
        if (max >= min) {
            int midValue = min + (max - min) / 2;

            if (toBeFound == array[midValue]) {
                return midValue;
            }
            else if (toBeFound > array[midValue]) {
                return BinarySearch.binarySearchRecursive(array, toBeFound, midValue + 1, max);
            }
            return BinarySearch.binarySearchRecursive(array, toBeFound, min, midValue - 1);
        }

        return -1;
    }
}
