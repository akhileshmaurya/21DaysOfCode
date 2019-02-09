package com.learntocode.ctci.ch01;

/*
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures? Hints: #44, #7 7 7, #732
 */
public class StringAndArray1_1 {

  
  public boolean isUniqCharacterString(String input) {
    boolean[] status = new boolean[256];
    for (char ch : input.toCharArray()) {
      if (status[(int) ch]) {
        return false;
      } else {
        status[(int) ch] = true;
      }
    }
    return true;
  }

}
