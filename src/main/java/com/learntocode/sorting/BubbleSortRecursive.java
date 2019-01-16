package com.learntocode.sorting;

import java.util.Arrays;

public class BubbleSortRecursive implements Sorting {
  @Override
  public void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 1; j < array.length - i; j++) {
        if (array[j - 1] > array[j]) {
          int temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }

    }
    System.out.println(Arrays.toString(array));
  }
}
