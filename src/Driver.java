import java.util.Scanner;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // get arr size from user - N
        System.out.print("Enter the number of elements (N) in arr: ");
        int n = scanner.nextInt();

        // use random to fill the N elements of the arr
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = random.nextInt(100); // limit bound to 100, for data readability
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
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
