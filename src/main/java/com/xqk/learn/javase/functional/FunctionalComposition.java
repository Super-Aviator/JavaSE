package com.xqk.learn.javase.functional;

import java.util.function.Function;

/**
 * FunctionalComposition 函数组合
 * <p>
 * 某些函数接口中有一些用于聚合的方法，可以将多个函数聚合成一个函数。
 * A.compose(B)表示B在A之前运行，A.andThen(B)，表示B紧接着A执行。
 *
 * @author 熊乾坤
 */
public class FunctionalComposition {

    public static void main(String[] args) {
        Function<String, String>
                f1 = origin -> origin.substring(3),
                f2 = origin -> origin.replace("A", "XQK"),
                f3 = String::toUpperCase,
                f4 = f1.compose(f2).andThen(f3);

        System.out.println(f4.apply("ABDef"));
    }
}

/* output:
BDEF */