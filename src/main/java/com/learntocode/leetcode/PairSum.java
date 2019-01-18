package com.learntocode.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import com.learntocode.utils.CommonUtils;

// Modified Version of https://leetcode.com/problems/two-sum/
public class PairSum {

  public static void main(String[] args) {

    int[] array = CommonUtils.generateRandomArray(20);
    CommonUtils.printArray(array);
    int k = array[ThreadLocalRandom.current().nextInt(0, array.length - 1)]
        + array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];
    System.out.println(" K :" + k);

    printPairSum(array, k);
  }

  private static void printPairSum(int[] array, int k) {

    Map<Integer, Set<Integer>> map = new HashMap<>();

    for (int i = 0; i < array.length; i++) {
      if (!map.containsKey(array[i])) {
        Set<Integer> set = new HashSet<>();
        map.put(array[i], set);
      }
      map.get(array[i]).add(i);
    }
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey((k - array[i]))) {
        System.out.println("(" + array[i] + " , " + (k - array[i]) + ")");
      }
    }
  }

}
