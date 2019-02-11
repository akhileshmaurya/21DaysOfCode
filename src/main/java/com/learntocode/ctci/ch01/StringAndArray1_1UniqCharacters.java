package com.learntocode.ctci.ch01;

/*
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures? Hints: #44, #117, #132
 */
public class StringAndArray1_1UniqCharacters {


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

  // If we say that we have only a-z character
  public boolean isUniqCharacterStringWithoutMemory(String input) {
    int checker = 0;
    for (char ch : input.toCharArray()) {
      int chInt = Character.getNumericValue(ch) - Character.getNumericValue('A');
      System.out.println(chInt + "::" + (1 << chInt));
      if ((checker & (1 << chInt)) > 0) {
        return false;
      }
      checker = checker | (1 << chInt);
    }
    return true;
  }

  public static void main(String[] args) {
    StringAndArray1_1UniqCharacters obj = new StringAndArray1_1UniqCharacters();
    System.out.println(obj.isUniqCharacterStringWithoutMemory("abcdefghxyzq121"));
  }

}
