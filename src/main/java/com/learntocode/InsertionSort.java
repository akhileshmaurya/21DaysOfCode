package com.learntocode;

import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {
  private static final int N = 2000000;



  public static void main(String[] args) {
    insertionSort(generateRandomArray(50));
  }

  private static void insertionSort(int[] array) {

  }

  private static int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, N);
    }
    return arr;
  }
}
