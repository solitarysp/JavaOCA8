package com.lethanh98.java.learn.oca8.chap5.UnderstandingCompilerEnhancements;

public class UnderstandingCompilerEnhancements {
    public static void main(String[] args) {
        B b=new B();
    }
}

class A {
    public A() {
        super();
        System.out.println("a");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}
