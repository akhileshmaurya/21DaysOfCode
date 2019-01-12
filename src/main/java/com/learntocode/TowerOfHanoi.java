package com.learntocode;

public class TowerOfHanoi {
  public static void main(String[] args) {
    towerOfHanoi(4, "A", "B", "C");

  }

  public static void towerOfHanoi(int noOfDisks, String fromRod, String toRod, String tempRod) {

    if (noOfDisks == 1) {
      System.out.println("Move Disk " + noOfDisks + " from " + fromRod + " to " + toRod);
      return;
    }
    towerOfHanoi(noOfDisks - 1, fromRod, tempRod, toRod);
    System.out.println("Move Disk " + noOfDisks + " from " + fromRod + " to " + toRod);
    towerOfHanoi(noOfDisks - 1, tempRod, toRod, fromRod);
  }
}
