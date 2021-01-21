package com.lethanh98.java.learn.oca8.chap5.polymorphism.VirtualMethods;

public class SimpleDemo {
    public static void main(String[] args) {
        C c = new C();
        ((A) c).showNotification();
        ((A) c).showNameClass();
    }
}

class A {
    public void showNameClass() {
        System.out.println("A");
    }
    public void showNotification() {
        System.out.println("Class a Show");
        showNameClass();
    }
}

class B extends A {
    public void showNameClass() {
        System.out.println("B");
    }
    public void showNotification() {
        System.out.println("Class B Show");
        showNameClass();
    }
}

class C extends B {
    public void showNameClass() {
        System.out.println("C");
    }
}
