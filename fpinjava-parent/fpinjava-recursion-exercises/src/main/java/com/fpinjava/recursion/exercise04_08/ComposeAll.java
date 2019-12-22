package com.fpinjava.recursion.exercise04_08;

import java.util.List;

import com.fpinjava.common.Function;

import static com.fpinjava.common.CollectionUtilities.*;


public class ComposeAll {

  static <T> Function<T, T> composeAllViaFoldLeft(List<Function<T, T>> list) {
    return t -> foldLeft(reverse(list), t, t1 -> f -> f.apply(t1));
  }

  static <T> Function<T, T> composeAllViaFoldRight(List<Function<T, T>> list) {
    return t -> foldRight(list, t, f -> t1 -> f.apply(t1));
  }

  static <T> Function<T, T> andThenAllViaFoldLeft(List<Function<T, T>> list) {
    return t -> foldLeft(list, t, t1 -> f -> f.apply(t1));
  }

  static <T> Function<T, T> andThenAllViaFoldRight(List<Function<T, T>> list) {
    return t -> foldRight(reverse(list), t, f -> t1 -> f.apply(t1));
  }
}
