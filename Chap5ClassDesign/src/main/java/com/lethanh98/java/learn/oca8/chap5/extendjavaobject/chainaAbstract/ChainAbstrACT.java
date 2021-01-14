package com.lethanh98.java.learn.oca8.chap5.extendjavaobject.chainaAbstract;

public class ChainAbstrACT {
}

abstract class Abstract1 {
    public abstract void method1();
    public abstract void method2();
}

abstract class Abstract2 extends Abstract1 {
    public abstract void method3();
    @Override
    public void method1() {
    }
}

class AbstractImpl1 extends Abstract2 {
    // method 1 not require nữa vì đã có 1 impl trước đó r
    @Override
    public void method2() { //require
    }

    @Override
    public void method3() {

    }
}

class AbstractImpl2 extends AbstractImpl1 {
    // Muốn Override, nó không require
    @Override
    public void method1() {
    }
}