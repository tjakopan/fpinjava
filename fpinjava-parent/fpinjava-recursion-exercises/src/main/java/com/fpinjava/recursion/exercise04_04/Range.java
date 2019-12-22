package com.fpinjava.recursion.exercise04_04;

import com.fpinjava.common.CollectionUtilities;
import com.fpinjava.common.TailCall;

import java.util.List;

import static com.fpinjava.common.CollectionUtilities.*;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
    return range_(list(), start, end).eval();
  }

  private static TailCall<List<Integer>> range_(List<Integer> acc, Integer start, Integer end) {
    return end <= start
            ? TailCall.ret(acc)
            : TailCall.sus(() -> range_(prepend(end - 1, acc), start, end - 1));
  }
}
