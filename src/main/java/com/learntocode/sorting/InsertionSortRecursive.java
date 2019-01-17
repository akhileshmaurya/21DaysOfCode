package com.learntocode.sorting;

import java.util.Arrays;

public class InsertionSortRecursive implements Sorting {

  @Override
  public void sort(int[] array) {
    recursive(array, array.length);
    System.out.println(Arrays.toString(array));

  }

  private void recursive(int[] array, int length) {

    if (length <= 1)
      return;
    recursive(array, length - 1);
    int ele = array[length - 1];
    int j = length - 2;

    while (j >= 0 && ele < array[j]) {
      if (ele < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
    }
    array[j + 1] = ele;
  }
}
