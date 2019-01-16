package com.learntocode.sorting;

import java.util.Arrays;

public class SelectionSort implements Sorting {
  @Override
  public void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
    System.out.println(Arrays.toString(array));

  }
}
