package com.learntocode.leetcode;

public class LengthOfLastWord {

  public static void main(String[] args) {
    LengthOfLastWord ll = new LengthOfLastWord();
    System.out.println(ll.lengthOfLastWord("Akhilesh Kumar Maurya"));
    System.out.println(ll.lengthOfLastWord("Akhilesh"));
    System.out.println(ll.lengthOfLastWord("Hello World"));

    System.out.println(ll.lengthOfLastWord("a "));

  }

  public int lengthOfLastWord(String s) {
    int l = s.length();
    int i = s.lastIndexOf(" ");
    System.out.println(l + "::" + i);
    if (i == -1) {
      return l;
    } else if (i == (l - 1)) {
      return 1;
    }
    return l - i - 1;
  }

}
