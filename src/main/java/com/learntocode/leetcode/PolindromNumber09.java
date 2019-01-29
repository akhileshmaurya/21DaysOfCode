package com.learntocode.leetcode;

// https://leetcode.com/problems/palindrome-number/
public class PolindromNumber09 {

  public static void main(String[] args) {
    PolindromNumber09 sol = new PolindromNumber09();
    System.out.println(sol.isPalindrome(121));
    System.out.println(sol.isPalindrome(-121));



  }

  public boolean isPalindrome(int x) {
    if (x >= 0) {
      int num = x;
      int rev = 0;
      while (x > 0) {
        rev = rev * 10 + x % 10;
        x = x / 10;
      }
      if (rev == num)
        return true;
    }
    return false;
  }

  public boolean isPalindromeWithString(int x) {
    char[] numbers = String.valueOf(x).toCharArray();
    int i = 0, l = numbers.length - 1;
    boolean isPrime = true;
    while (i < l) {
      if (numbers[i] != numbers[l]) {
        // System.out.println(numbers[i] + ":" + numbers[l]);
        isPrime = false;
      }
      i++;
      l--;
    }

    return isPrime;
  }
}
