package com.lethanh98.java.learn.oca8.chap5.ImplementingInterfaces.MultipleInheritance;

public class MultipleInheritanceSimple {
}

interface iA {
    void test();
}

interface iB {
    void test(String a);
}

interface iC extends iA, iB {
}

class Impl1 implements iA,iB{


    @Override
    public void test() {

    }
    @Override
    public void test(String a) {

    }
}