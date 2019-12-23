package com.fpinjava.lists.exercise05_12;

import com.fpinjava.lists.exercise05_10.List;

public class Reverse {

  public static <A> List<A> reverseViaFoldLeft(List<A> list) {
    return list.foldLeft(List.list(), l -> a -> l.cons(a));
  }
}
