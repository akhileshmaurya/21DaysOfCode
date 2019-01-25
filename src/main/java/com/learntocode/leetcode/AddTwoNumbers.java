package com.learntocode.leetcode;

// https://leetcode.com/problems/two-sum/
public class AddTwoNumbers {

  private ListNode addElementInListAndGetLastNode(ListNode l1, int val) {
    ListNode newNode = new ListNode(val);
    if (l1 != null) {
      ListNode tmp = l1;
      while (tmp.next != null) {
        tmp = tmp.next;
      }
      tmp.next = newNode;
    }
    return newNode;
  }

  public static void main(String[] args) {
    AddTwoNumbers main = new AddTwoNumbers();
    ListNode firstNode = new ListNode(1);
    ListNode tm = main.addElementInListAndGetLastNode(firstNode, 8);
    // tm = main.addElementInListAndGetLastNode(tm, 3);
    ListNode secondNode = new ListNode(0);
    // tm = main.addElementInListAndGetLastNode(secondNode, 6);
    // tm = main.addElementInListAndGetLastNode(tm, 4);
    firstNode.printList();
    secondNode.printList();

    ListNode res = main.addTwoNumbers(firstNode, secondNode);
    res.printList();
  }



  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode res = null;
    ListNode lastNode = null;
    int carry = 0, val = 0;
    while (l1 != null && l2 != null) {
      int sum = l1.val + l2.val + carry;
      val = sum % 10;
      carry = sum / 10;
      ListNode nn = new ListNode(val);
      if (res == null) {
        res = nn;
      } else {
        lastNode.next = nn;
      }
      lastNode = nn;

      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null) {
      int sum = l1.val + carry;
      val = sum % 10;
      carry = sum / 10;
      ListNode nn = new ListNode(val);
      if (res == null) {
        res = nn;
      } else {
        lastNode.next = nn;
      }
      lastNode = nn;
      l1 = l1.next;
    }
    while (l2 != null) {
      int sum = l2.val + carry;
      val = sum % 10;
      carry = sum / 10;
      ListNode nn = new ListNode(val);
      if (res == null) {
        res = nn;
      } else {
        lastNode.next = nn;
      }
      lastNode = nn;
      l2 = l2.next;
    }
    if (carry > 0) {
      ListNode nn = new ListNode(carry);
      if (res == null) {
        res = nn;
      } else {
        lastNode.next = nn;
      }
      lastNode = nn;
    }
    return res;

  }

}


class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }

  public void printList() {
    ListNode tmp = this;
    StringBuffer sb = new StringBuffer();
    while (tmp.next != null) {
      sb.append(tmp.val + " -> ");
      tmp = tmp.next;
    }
    sb.append(tmp.val);
    System.out.println("[ " + sb.toString() + " ]");
  }
}

