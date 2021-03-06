package com.learntocode.utils;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtils {

  private static final int MAX = 100;
  private static final int MIN = -100;

  public static int[] generateRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);
    }
    return arr;
  }

  public static void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));

  }

}
