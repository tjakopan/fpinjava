package com.fpinjava.makingjavafunctional.exercise03_04;

import java.util.*;


public class CollectionUtilities {

  public static <T> List<T > list() {
    return Collections.emptyList();
  }

  public static <T> List<T > list(T t) {
    return Collections.singletonList(t);
  }

  public static <T> List<T > list(List<T> ts) {
    return Collections.unmodifiableList(new ArrayList<>(ts));
  }

  @SafeVarargs
  public static <T> List<T > list(T... t) {
    return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
  }

  public static <T> T head(List<T> list) {
    if (list.size() == 0) {
      throw new IllegalStateException("list must not be empty");
    }
    return list.get(0);
  }

  private static <T> List<T > copy(List<T> ts) {
    return list(ts);
  }

  public static <T> List<T> tail(List<T> list) {
    if (list.size() == 0) {
      throw new IllegalStateException("list must not be empty");
    }
    List<T> newList = new ArrayList<>(list);
    newList.remove(0);
    return list(newList);
  }
}
