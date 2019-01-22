package com.learntocode.projectEuler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler005
public class Euler005SmallestMultiple {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      long n = in.nextLong();
      long res = smallestMultiple(n);
      System.out.println(res);
    }
    in.close();
  }

  private static long smallestMultiple(long n) {
    long small = n;
    for (long i = 2; i < n; i++) {
      if (small % i != 0) {
        long smallCopy = small;
        // System.out.println("i =" + i + " , small =" + small);
        long j = i;
        for (long k = 2; k <= i / 2 & j > 2; k++) {
          while (small % k == 0 && j % k == 0) {
            j = j / k;
            small = small / k;
          }
        }
        // System.out.println("i =" + i + " , small =" + small + " , j=" + j);

        small = smallCopy * j;
      }
    }
    return small;
  }
}
