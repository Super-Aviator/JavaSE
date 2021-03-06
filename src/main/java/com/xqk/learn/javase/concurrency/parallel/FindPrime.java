package com.xqk.learn.javase.concurrency.parallel;

import com.xqk.learn.javase.util.Timer;

import java.util.stream.LongStream;

/**
 * 测试找质数程序的运行时间
 *
 * @author 熊乾坤
 * @since 2019-12-20 13:16
 */
public class FindPrime {
    private static final long FIND_TOTAL = 100_000;

    private static boolean isPrime(long n) {
        return LongStream
                .rangeClosed(2, (long) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        LongStream
                .iterate(2, i -> i + 1)
                //.parallel()
                .filter(FindPrime::isPrime)
                .limit(FIND_TOTAL)
                .sum();
        //.forEach(i -> System.out.format("num: %2d is prime ! %n", i));
        System.out.println("used time " + timer.duration());
    }
}
