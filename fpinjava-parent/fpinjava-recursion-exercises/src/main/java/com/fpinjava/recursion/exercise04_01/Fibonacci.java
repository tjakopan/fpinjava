package com.fpinjava.recursion.exercise04_01;

import com.fpinjava.common.TailCall;

import java.math.BigInteger;

public class Fibonacci {
  
  public static BigInteger fib(int x) {
    return fib_(BigInteger.ZERO, BigInteger.ONE, x).eval();
  }

  private static TailCall<BigInteger> fib_(BigInteger acc1, BigInteger acc2, int x) {
    if (x == 0) {
      return TailCall.ret(acc1);
    } else if (x == 1) {
      return TailCall.ret(acc2);
    } else {
      return TailCall.sus(() -> fib_(acc2, acc1.add(acc2), x - 1));
    }
  }
}
