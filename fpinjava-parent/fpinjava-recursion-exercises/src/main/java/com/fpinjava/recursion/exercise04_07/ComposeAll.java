  package com.fpinjava.recursion.exercise04_07;

import java.util.List;

import com.fpinjava.common.CollectionUtilities;
import com.fpinjava.common.Function;

import static com.fpinjava.common.CollectionUtilities.foldLeft;
import static com.fpinjava.common.CollectionUtilities.foldRight;

  public class ComposeAll {

  public static <T> Function<T, T> composeAll(List<Function<T, T>> list) {
    return t -> {
      T t1 = t;
      for (Function<T, T> f : list) {
        t1 = f.apply(t1);
      }
      return t1;
    };
  }
  public static <T> Function<T, T> composeAllViaFoldLeft(List<Function<T, T>> list) {
    return t -> foldLeft(list, t, t1 -> f -> f.apply(t1));
  }

  public static <T> Function<T, T> composeAllViaFoldRight(List<Function<T, T>> list) {
    return t -> foldRight(list, t, f -> t1 -> f.apply(t1));
  }
}
