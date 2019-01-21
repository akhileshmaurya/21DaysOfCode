package com.learntocode.projectEuler;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler003
public class Euler003LargestPrimeFactor {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      long n = in.nextLong();
      long res = foundMaxPrime(n);
      System.out.println(res);
    }
    in.close();
  }

  private static long foundMaxPrime(long n) {
    long i = 3;
    while (n % 2 == 0) {
      n = n / 2;
    }
    if (n == 1) {
      return 2;
    } else {
      for (i = 3; i <= (long) Math.sqrt(n);) {
        while (n % i == 0) {
          n = n / i;
        }
        i = i + 2;
      }
    }
    if (n > 2) {
      return n;
    } else {
      return i - 2;
    }
  }
}
