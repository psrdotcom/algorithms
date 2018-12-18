package in.pillisureshraju.algorithms.sorting;

/**
 * @author Suresh Raju Pilli
 * 
 *         Insertion Sort sorts one item at a time, by moving it the sorted list
 *         with in the array. Starts with first two elements comparision and
 *         swap the elements if right element is smaller. Compare and swap
 *         continues till the smallest element reaches its exact position.
 */

class InsertionSort {
  public static void main(String args[]) {
    int arr[] = { 4, 2, 6, 1, 9, 3 };
    int value, index;

    System.out.println("Array before sort: " + java.util.Arrays.toString(arr));

    for (int i = 1; i < arr.length; i++) {
      value = arr[i];
      index = i;

      // Compare and exchange the positions
      while (index > 0 && value < arr[index - 1]) {
        arr[index] = arr[index - 1];
        arr[index - 1] = value;
        index--;
      }
    }

    System.out.println("Array after sort: " + java.util.Arrays.toString(arr));
  }
}