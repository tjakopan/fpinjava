package com.fpinjava.recursion.exercise04_09;

import com.fpinjava.common.CollectionUtilities;
import com.fpinjava.common.TailCall;

import java.math.BigInteger;
import java.util.List;

import static com.fpinjava.common.CollectionUtilities.*;
import static com.fpinjava.common.TailCall.ret;
import static com.fpinjava.common.TailCall.sus;


public class Memoization {

  public static String fibo(int number) {
    return makeString(fibo_(list(BigInteger.ZERO), BigInteger.ONE, BigInteger.ZERO, number).eval(), ", ");
  }

  private static TailCall<List<BigInteger>> fibo_(List<BigInteger> acc, BigInteger acc1, BigInteger acc2, int x) {
    if (x == 0) {
      return ret(acc);
    } else if (x == 1) {
      return ret(append(acc, acc1.add(acc2)));
    } else {
      return sus(() -> fibo_(append(acc, acc1.add(acc2)), acc2, acc1.add(acc2), x - 1));
    }
  }

  public static <T> String makeString(List<T> list, String separator) {
    return list.isEmpty()
            ? ""
            : tail(list).isEmpty()
            ? head(list).toString()
            : head(list).toString() + foldLeft(tail(list), new StringBuilder(), sb -> t -> sb.append(separator).append(t)).toString();

  }
}
