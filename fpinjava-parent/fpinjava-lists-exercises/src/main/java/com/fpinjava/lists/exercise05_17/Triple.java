package com.fpinjava.lists.exercise05_17;

import com.fpinjava.lists.exercise05_16.List;

import static com.fpinjava.lists.exercise05_16.List.list;

public class Triple {

  public static List<Integer> triple(List<Integer> list) {
    return List.foldRight(list, list(), i -> l -> l.cons(i * 3));
  }
}
