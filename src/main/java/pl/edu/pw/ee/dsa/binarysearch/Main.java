package pl.edu.pw.ee;

public class Main {
    public static void main(String[] args) {
        var array = new int[]{6, 7, 8, 9 ,10, 15};
        var toBeFound = 9;

        System.out.println("Iterative Index of " + toBeFound + ": " + BinarySearch.binarySearchIterative(array, toBeFound, 0, array.length - 1));
        System.out.println("Recursive Index of " + toBeFound + ": " + BinarySearch.binarySearchRecursive(array, toBeFound, 0, array.length - 1));
    }
}
