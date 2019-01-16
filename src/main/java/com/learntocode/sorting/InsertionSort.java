package com.learntocode.sorting;

import java.util.Arrays;

public class InsertionSort implements Sorting {

  @Override
  public void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int ele = array[i];
      int j = i - 1;

      while (j >= 0 && ele < array[j]) {
        if (ele < array[j]) {
          array[j + 1] = array[j];
          j--;
        }
      }
      array[j + 1] = ele;
    }
    System.out.println(Arrays.toString(array));
  }
}
