package com.lethanh98.java.learn.oca8.chap1.CreatingObject;

public class InstanceInitializerBlocks {
    static {
        System.out.println("Static block of class");
    }

    {
        System.out.println("Block in class but of object");
    }

    {
        System.out.println("Block in class but of object 2");
    }

    public static void main(String[] args) {
        InstanceInitializerBlocks main = new InstanceInitializerBlocks();

        main = new InstanceInitializerBlocks();
    }
}
