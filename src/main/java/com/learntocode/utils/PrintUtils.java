package com.learntocode.utils;

public class PrintUtils {


  private static void println() {
    System.out.println();
  }

  private static void print(String val) {
    System.out.print(val);
  }

  public static void print(Object[] objArray) {
    for (Object object : objArray) {
      print(object.toString() + " ");
    }
    println();
  }

  public static void print(Object[][] objMatrix) {
    for (Object[] object : objMatrix) {
      print(object);
    }
    println();
  }

  public static void print(int[] intArray) {
    for (int ch : intArray) {
      print(ch + " ");
    }
    println();
  }

  public static void print(int[][] intMatrix) {
    for (int[] intArr : intMatrix) {
      print(intArr);
    }
    println();
  }
}
