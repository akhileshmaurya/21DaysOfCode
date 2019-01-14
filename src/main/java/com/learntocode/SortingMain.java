package com.learntocode;

public class SortingMain {

  public static void main(String[] args) {
    InsertionSort sorting = new InsertionSort();
    sorting.sort(sorting.generateRandomArray(20));
  }

}
