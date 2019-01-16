package com.learntocode.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortingMain {
  private static final int N = 200;

  public static void main(String[] args) {
    int[] arr = generateRandomArray(20);
    System.out.println(Arrays.toString(arr));
    SortingProvider.getSortingAlgo(SortingType.INSERTION).sort(arr);
    SortingProvider.getSortingAlgo(SortingType.SELECTION).sort(arr);
    SortingProvider.getSortingAlgo(SortingType.BUBBLE).sort(arr);

  }

  public static int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, N);
    }
    return arr;
  }

}
