package com.learntocode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.learntocode.utils.CommonUtils;

// https://leetcode.com/problems/3sum/
public class TriplateSum {

  public static void main(String[] args) {

    int[] array = CommonUtils.generateRandomArray(20);
    CommonUtils.printArray(array);
    int k = 50;
    System.out.println("K :" + k);
    List<List<Integer>> res = printTriplateSum(array, k);
    for (List<Integer> pair : res) {
      System.out.println(pair);
    }
  }

  private static List<List<Integer>> printTriplateSum(int[] array, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(array);

    for (int i = 0; i < array.length - 2; i++) {
      if (i == 0 || (i > 0 && array[i] != array[i + 1])) {
        int start = i + 1, end = array.length - 1, partialSum = sum - array[i];
        while (start < end) {
          if (array[start] + array[end] == partialSum) {
            res.add(Arrays.asList(array[i], array[start], array[end]));
            while (start < end && array[start] == array[start + 1])
              start++;
            while (start < end && array[end] == array[end - 1])
              end--;

            start++;
            end--;
          } else if (array[start] + array[end] < partialSum) {
            start++;
          } else {
            end--;
          }
        }
      }
    }
    return res;
  }

}
