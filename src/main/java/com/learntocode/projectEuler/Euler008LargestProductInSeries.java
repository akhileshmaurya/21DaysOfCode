package com.learntocode.projectEuler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler008
public class Euler008LargestProductInSeries {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      int n = in.nextInt();
      int k = in.nextInt();
      String num = in.next();
      long res = maximumProductInCoscutive(num, k, n);
      System.out.println(res);

    }
  }

  private static long maximumProductInCoscutive(String num, int k, int size) {
    long product = 0;
    if (size >= k) {
      char[] arr = num.toCharArray();
      for (int i = 0; i < k; i++) {

      }
      product = Integer.parseInt(String.valueOf(arr[0]));
      for (int i = 5; i < size; i++) {

      }
    }
    return product;
  }
}
