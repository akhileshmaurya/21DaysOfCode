package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.learntocode.ctci.ch01.StringAndArray1_1UniqCharacters;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */


public class AppTest {


  @Test
  public void testCTCIChapterFirst1_1() {
    StringAndArray1_1UniqCharacters sol = new StringAndArray1_1UniqCharacters();
    assertEquals("True Case", true, sol.isUniqCharacterString("Akhiles"));
    assertEquals("False Case", false, sol.isUniqCharacterString("Akhilesh Kumar Maurya"));
    assertEquals("True Case", true, sol.isUniqCharacterString("1234567890"));
    assertEquals("False Case", false, sol.isUniqCharacterString("Akhil99876482458"));

  }

}