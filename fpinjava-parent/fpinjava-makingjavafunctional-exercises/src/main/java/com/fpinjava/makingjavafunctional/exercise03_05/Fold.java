package com.fpinjava.makingjavafunctional.exercise03_05;

import com.fpinjava.common.Function;

import java.util.List;

public class Fold {

  public static Integer fold(List<Integer> is, Integer identity,
                             Function<Integer, Function<Integer, Integer>> f) {
    int acc = identity;
    for (int i : is) {
      acc = f.apply(acc).apply(i);
    }
    return acc;
  }
}
