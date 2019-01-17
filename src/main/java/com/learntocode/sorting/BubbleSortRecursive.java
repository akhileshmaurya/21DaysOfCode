package com.learntocode.sorting;

import java.util.Arrays;

public class BubbleSortRecursive implements Sorting {
  @Override
  public void sort(int[] array) {
    recursive(array, array.length);
    System.out.println(Arrays.toString(array));

  }

  private void recursive(int[] array, int length) {
    if (length == 1)
      return;
    for (int j = 1; j < length; j++) {
      if (array[j - 1] > array[j]) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
      }
    }
    recursive(array, length - 1);


  }
}
