package com.fpinjava.recursion.exercise04_06;

import java.util.List;

import com.fpinjava.common.CollectionUtilities;
import com.fpinjava.common.Function;
import com.fpinjava.common.TailCall;

import static com.fpinjava.common.CollectionUtilities.head;
import static com.fpinjava.common.CollectionUtilities.tail;


public class ComposeAll {

  static <T> Function<T, T> composeAll(List<Function<T, T>> list) {
    return composeAll_(Function.identity(), list).eval();
  }

  private static <T> TailCall<Function<T, T>> composeAll_(Function<T, T> acc, List<Function<T, T>> list) {
    return list.isEmpty()
            ? TailCall.ret(acc)
            : TailCall.sus(() -> composeAll_(acc.compose(head(list)), tail(list)));
  }
}
