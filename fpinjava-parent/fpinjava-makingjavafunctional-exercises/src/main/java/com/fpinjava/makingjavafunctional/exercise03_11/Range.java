package com.fpinjava.makingjavafunctional.exercise03_11;

import java.util.ArrayList;
import java.util.List;


public class Range {

  public static List<Integer> range(int start, int end) {
    List<Integer> list = new ArrayList<>();
    int i = start;
    while (i < end) {
      list.add(i++);
    }
    return list;
  }
}
