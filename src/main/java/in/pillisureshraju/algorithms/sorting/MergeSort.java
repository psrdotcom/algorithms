package in.pillisureshraju.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Suresh Raju Pilli
 * 
 *         Merge Sort uses divide and conquer technique by splitting the array
 *         into sub arrays and joining them.
 */

class MergeSort {

  /**
   * MergeSort
   * 
   * @param arr the input array
   */
  public void mergeSort(int arr[]) {
    int arrLen = arr.length;

    // When array has only 1 item then it's already in merged state
    if (arrLen < 2)
      return;

    int mid = (int) (arrLen / 2);
    int leftArray[] = new int[mid];
    int rightArray[] = new int[arrLen - mid];

    System.out.println("Array before sort: " + Arrays.toString(arr));

    for (int i = 0; i < leftArray.length; i++) {
      leftArray[i] = arr[i];
    }
    // System.out.println(Arrays.toString(leftArray));

    for (int i = mid; i < arrLen; i++) {
      rightArray[i - mid] = arr[i];
    }
    // System.out.println(Arrays.toString(rightArray));

    mergeSort(leftArray); // mergesoft recursion on left array
    mergeSort(rightArray); // mergesoft recursion on right array
    merge(leftArray, rightArray, arr); // Merge left, right array into main array

    System.out.println("Array after sort: " + Arrays.toString(arr));
  }

  public void merge(int leftArray[], int rightArray[], int arr[]) {
    int l = 0, r = 0, m = 0;
    int ll = leftArray.length;
    int rl = rightArray.length;

    // Compare the two arrays and add the minimum value to main array
    while (l < ll && r < rl) {
      if (leftArray[l] < rightArray[r]) {
        arr[m] = leftArray[l];
        l++;
      } else {
        arr[m] = rightArray[r];
        r++;
      }
      m++;
    }

    // Search for left overs in left array and add them to main array
    while (l < ll) {
      arr[m] = leftArray[l];
      l++;
      m++;
    }

    // Search for left overs in right array and add them to main array
    while (r < rl) {
      arr[m] = rightArray[r];
      r++;
      m++;
    }
  }

  public static void main(String args[]) {
    int arr[] = { 4, 2, 6, 1, 9, 3, 8 };
    new MergeSort().mergeSort(arr);
  }
}