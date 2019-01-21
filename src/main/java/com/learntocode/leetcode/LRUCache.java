package com.learntocode.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

  private int capacity;
  Map<Integer, Integer> cache = new HashMap<>();
  LinkedList<Integer> linkList = new LinkedList<>();

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  public int get(int key) {
    if (cache.containsKey(key))
      return cache.get(key);
    return -1;
  }

  public void put(int key, int value) {
    cache.put(key, value);
  }

  public static void main(String[] args) {

    LRUCache cache = new LRUCache(2 /* capacity */ );

    cache.put(1, 1);
    cache.put(2, 2);
    System.out.println(cache.get(1)); // returns 1
    cache.put(3, 3); // evicts key 2
    System.out.println(cache.get(2)); // returns -1 (not found)
    cache.put(4, 4); // evicts key 1
    System.out.println(cache.get(1)); // returns -1 (not found)
    System.out.println(cache.get(3)); // returns 3
    System.out.println(cache.get(4)); // returns 4
  }

}
