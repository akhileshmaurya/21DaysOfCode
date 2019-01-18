package com.learntocode.sorting;

import java.util.Arrays;
import com.learntocode.utils.CommonUtils;

public class SortingMain {

  public static void main(String[] args) {
    int[] arr = CommonUtils.generateRandomArray(20);
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
}
