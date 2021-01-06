package com.lethanh98.java.learn.oca8.chap4.Constructors;

public class OrderInitialization {
    public static void main(String[] args) {
        C b = new C();
    }
    static class A {
        public static int A = 1;
        static {
            System.out.println("static Initialization class A: " + A);

        }
        {
            System.out.println("Initialization class A");
        }
        public A() {
            System.out.println("class A");
        }
    }

    static class B extends A {
        public static int B = 1;
        static {
            System.out.println("static Initialization class B " + B);

        }
        {
            System.out.println("Initialization class B");
        }
        public B() {
            System.out.println("class B");
        }
    }
    static class C extends B {
        public static int C = 1;
        static {
            System.out.println("static Initialization class C " + C);
        }
        {
            System.out.println("Initialization class C");
        }
        public C() {
            System.out.println("class C");
        }
    }
}
