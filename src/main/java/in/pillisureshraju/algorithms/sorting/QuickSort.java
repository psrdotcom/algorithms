package in.pillisureshraju.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Suresh Raju Pilli
 * 
 *         Quick Sort uses divide and conquer technique by identifying the pivot
 *         exact position and divide the array left to pivot and right to pivot
 *         recursively.
 */

class QuickSort {

  /**
   * Quick Sort with array of values, start index and end index
   * 
   * @param arr  the input array
   * @param sIdx the start index
   * @param eIdx the end index
   */
  public void quickSort(int arr[], int sIdx, int eIdx) {
    if (sIdx < eIdx) {
      // Identify the partion index
      int pIdx = partition(arr, sIdx, eIdx);
      quickSort(arr, sIdx, pIdx - 1);
      quickSort(arr, pIdx + 1, eIdx);
    }
  }

  /**
   * Identify the partition index
   * 
   * @param arr  the input array
   * @param sIdx the start index
   * @param eIdx the end index
   * @return the partition index
   */
  public int partition(int arr[], int sIdx, int eIdx) {
    int pIdx = sIdx;
    int pivot = arr[eIdx];
    for (int i = sIdx; i < eIdx; i++) {
      if (arr[i] <= pivot) {
        swapValues(arr, i, pIdx);
        pIdx++;
      }
    }
    swapValues(arr, pIdx, eIdx);
    return pIdx;
  }

  /**
   * Swap Array values
   * 
   * @param a    the array
   * @param pos1 the first index position of array
   * @param pos2 the second index position of array
   */
  private void swapValues(int a[], int pos1, int pos2) {
    if (a[pos1] != a[pos2]) {
      int temp = 0;
      temp = a[pos1];
      a[pos1] = a[pos2];
      a[pos2] = temp;
    }
  }

  public static void main(String args[]) {
    int arr[] = { 4, 2, 6, 1, 9, 3, 8 };
    System.out.println("Array before sort: " + Arrays.toString(arr));
    new QuickSort().quickSort(arr, 0, arr.length - 1);
    System.out.println("Array after sort: " + Arrays.toString(arr));
  }
}