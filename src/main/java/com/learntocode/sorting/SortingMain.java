package com.learntocode.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortingMain {
  private static final int N = 200;

  public static void main(String[] args) {
    int[] arr = generateRandomArray(20);
    for (SortingType type : getImplementedSortingAlgo()) {
      int[] arrIns = Arrays.copyOf(arr, arr.length);
      System.out.println(Arrays.toString(arrIns));
      long startTime = System.nanoTime();
      SortingProvider.getSortingAlgo(type).sort(arrIns);
      System.out.println(
          "Sorting Algo :: " + type + " , Time Taken : " + (System.nanoTime() - startTime) + " ns");
    }
  }


  public static SortingType[] getImplementedSortingAlgo() {
    SortingType[] arr = {SortingType.INSERTION, SortingType.BUBBLE, SortingType.SELECTION,
        SortingType.REC_BUBBLE, SortingType.REC_INSERTION};
    return arr;
  }

  public static int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(1, N);
    }
    return arr;
  }

}
