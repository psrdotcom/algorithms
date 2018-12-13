package in.pillisureshraju.algorithms.sorting;

/**
 * @author Suresh Raju Pilli
 * 
 *         Bubble Sort compare the sibling elements and swap the higher value to
 *         right side After first iteration, the hight values will be on the
 *         right most i.e. high index. Repeat the steps untill, the length of
 *         the array.
 */

class BubbleSort {
  public static void main(String args[]) {
    int arr[] = { 4, 2, 6, 1, 9, 32, 3, 7 };
    boolean isSorted;

    System.out.println("Array before sort: " + java.util.Arrays.toString(arr));

    for (int i = 1; i < arr.length; i++) {
      isSorted = true;
      for (int j = 0; j < arr.length - i; j++) {
        if (arr[j] > arr[j + 1]) {
          swapValues(arr, j, j + 1);
          isSorted = false;
        }
      }
      if (isSorted) {
        break;
      }
    }

    System.out.println("Array after sort: " + java.util.Arrays.toString(arr));
  }

  /**
   * Swap Array values
   * 
   * @param a    the array
   * @param pos1 the first index position of array
   * @param pos2 the second index position of array
   */
  private static void swapValues(int a[], int pos1, int pos2) {
    int temp = 0;
    temp = a[pos1];
    a[pos1] = a[pos2];
    a[pos2] = temp;
  }
}