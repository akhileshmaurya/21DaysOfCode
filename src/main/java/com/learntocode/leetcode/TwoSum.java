package com.learntocode.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import com.learntocode.utils.CommonUtils;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

  public static void main(String[] args) {

    int[] array = CommonUtils.generateRandomArray(20);
    CommonUtils.printArray(array);
    int k = array[ThreadLocalRandom.current().nextInt(0, array.length - 1)]
        + array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];
    int[] arr = {876, 879, 155, 291, 431, 296};

    System.out.println("K :" + k);
    int[] res = twoSum(arr, 28);
    System.out.println(Arrays.toString(res));
    System.out.println(arr[res[0]] + "::" + arr[res[1]]);

  }

  public static int[] twoSum(int[] nums, int target) {
    int result[] = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], i);
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey((target - nums[i])) && i != map.get((target - nums[i]))) {
        result[0] = i;
        result[1] = map.get((target - nums[i]));
      }
    }
    Arrays.sort(result);
    return result;
  }

}
