package com.fpinjava.makingjavafunctional.exercise03_14;

import com.fpinjava.common.CollectionUtilities;

import java.util.ArrayList;
import java.util.List;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
    if (start < end) {
      return CollectionUtilities.append(range(start, end - 1), end - 1);
    } else {
      return CollectionUtilities.list();
    }
  }
}
