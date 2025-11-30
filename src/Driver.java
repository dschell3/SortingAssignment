//import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // get arr size from user - N

        // use random to fill the N elements of the arr

        // display the original arr

        // display the sorted arr + # comparisons + algo info

        // create test arr for sort checking
        Integer[] arr = {55, 44, 66, 112, 8, 43, 0, 11, 49, 7, 100};

        System.out.println("\nOriginal Array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\nSorted Array:");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "  ");
        }

    }
}
