package in.pillisureshraju.algorithms.sorting;

/**
 * @author Suresh Raju Pilli
 * 
 *         Selection Sort: Find the smallest value in the array and place it in
 *         its position. Two complete loop iteration required to find the
 *         smallest value in the unsorted list of subarray.
 */

class SelectionSort {
  public static void main(String args[]) {
    int arr[] = { 4, 7, 3, 9, 2, 8, 1 };
    int index = 0;

    System.out.println("Array before sort: " + java.util.Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      index = i;
      // Identify the minimum value index in the array
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j;
        }
      }
      // Swap the positions
      swapValues(arr, i, index);
    }

    System.out.println("Array after sort: " + java.util.Arrays.toString(arr));
  }

  /**
   * Swap Array values
   * 
   * @param arr  the array
   * @param pos1 the first index position of array
   * @param pos2 the second index position of array
   */
  private static void swapValues(int a[], int pos1, int pos2) {
    if (a[pos1] != a[pos2]) {
      int temp = 0;
      temp = a[pos1];
      a[pos1] = a[pos2];
      a[pos2] = temp;
    }
  }
}