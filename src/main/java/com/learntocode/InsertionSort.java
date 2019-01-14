package com.learntocode;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort implements Sorting {
  private static final int N = 200;

  public static void main(String[] args) {
    int[] array = generateRandomArray(50);
    System.out.println(Arrays.toString(array));
    insertionSort(array);
  }

  public void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int ele = array[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (ele < array[j]) {
          array[j + 1] = array[j];
        }
      }
      array[j + 1] = ele;
    }
    System.out.println(Arrays.toString(array));
  }

  public int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, N);
    }
    return arr;
  }

  @Override
  public void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int ele = array[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (ele < array[j]) {
          array[j + 1] = array[j];
        }
      }
      array[j + 1] = ele;
    }
    System.out.println(Arrays.toString(array));

  }
}
