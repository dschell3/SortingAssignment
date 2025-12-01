/*
 * SortAlgorithm.java
 *
 * Interface defining the contract for sorting algorithms.
 * All sorting implementations must provide a sort method that
 * operates on arrays of Comparable objects.
 */

/**
 * Interface to define sort algorithms.
 * @author Paul Wolfgang
 */
public interface SortAlgorithm {

    /** Sort an array of Comparable objects
     * @param <T> the type to be sorted, must implement Comparable
     * @param table The array of items to sort
     */
    <T extends Comparable<T>>  void sort(T[] table);
}
