package com.learntocode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
    System.out.println("K :" + k);
    List<List<Integer>> res = printPairSum(array, k);
    for (List<Integer> pair : res) {
      System.out.println(pair);
    }
  }

  private static List<List<Integer>> printPairSum(int[] array, int k) {

    Map<Integer, Set<Integer>> map = new HashMap<>();
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (!map.containsKey(array[i])) {
        Set<Integer> set = new HashSet<>();
        map.put(array[i], set);
      }
      map.get(array[i]).add(i);
    }
    for (int i = 0; i < array.length; i++) {
      if (map.containsKey((k - array[i]))) {
        res.add(Arrays.asList(array[i], (k - array[i])));
      }
    }
    return res;
  }

}
