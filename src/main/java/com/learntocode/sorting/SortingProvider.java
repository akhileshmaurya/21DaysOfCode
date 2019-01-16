package com.learntocode.sorting;

public class SortingProvider {

  public static Sorting getSortingAlgo(SortingType type) {
    Sorting sortAlgo = null;
    switch (type) {
      case SELECTION:
        sortAlgo = new SelectionSort();
        break;
      case BUBBLE:
        sortAlgo = new BubbleSort();
        break;
      case INSERTION:
        sortAlgo = new InsertionSort();
        break;
      case REC_BUBBLE:
        sortAlgo = new BubbleSortRecursive();
        break;
      default:
        break;
    }
    return sortAlgo;
  }


}
