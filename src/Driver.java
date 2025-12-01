/*
 * Driver.java
 *
 * Tests for comparing sorting algorithm performance.
 * Generates a random array and runs multiple sorting algorithms,
 * tracking and displaying the number of comparisons each makes.
 */

import java.util.Scanner;
import java.util.Random;

public class Driver {
    /// CHANGE ME to alter the bounds of integers to sort; ex. 1000 = [0-1000]
    private static final int UPPER_BOUND = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // get arr size from user - N
        System.out.print("Enter the number of elements (N) in arr: ");
        int n = scanner.nextInt();

        // use random to fill the N elements of the arr
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = random.nextInt(UPPER_BOUND); // limit bound - assign above
        }

        // clone the array so each method has to sort the same data
        Integer[] arr1 = arr.clone();
        Integer[] arr2 = arr.clone();
        Integer[] arr3 = arr.clone();
        Integer[] arr4 = arr.clone();

        // display the original arr
        System.out.println("\n******* Original Array *******");
        printArr(arr);

        // selection sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr1);
        System.out.println(selectionSort);
        System.out.println("Sorted Array:");
        printArr(arr1);

        // insertion sort
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr2);
        System.out.println(insertionSort);
        System.out.println("~Sorted Array~");
        printArr(arr2);

        // merge sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr3);
        System.out.println(mergeSort);
        System.out.println("~Sorted Array~");
        printArr(arr3);

        // quicksort
        QuickSort2 quickSort = new QuickSort2();
        quickSort.sort(arr4);
        System.out.println(quickSort);
        System.out.println("~Sorted Array~");
        printArr(arr4);

    }
    public static void printArr(Integer[] arr) {
        // calculate print width -> counts the max digits determined by UPPER_BOUND + pads each side
        int width = String.valueOf(UPPER_BOUND - 1).length() + 1;

        for (int i = 0; i < arr.length; ++i) {
            // format consistently for different digit lengths; ex. width = 5 -> "%5d"
            System.out.print(String.format("%" + width + "d", arr[i]));
            // Print line every 20 elements for readability
            if ((i + 1) % 20 == 0) { System.out.println(); }
        }
        // print newline unless one just was printed
        if (arr.length % 20 != 0) { System.out.println(); }
    }
}
