package com.xqk.learn.javase.interfaces;

/**
 * AbstractClass
 *
 * 与接口不同，抽象类可以有构造器
 *
 * @author 熊乾坤
 */
public abstract class AbstractClass {

    /**
     * 有参构造器
     */
    public AbstractClass() {
    }

    /**
     * 无参构造器
     */
    public AbstractClass(int i) {
    }

    abstract void f();
}