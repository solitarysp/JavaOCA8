package com.lethanh98.java.learn.oca8.chap1.mainmethod;

/**
 * javac BaseMain.java
 * java com.lethanh98.java.learn.oca8.chap1.mainmethod.BaseMain test
 *
 */
public class BaseMain {
    public static void main(String... args) {
        System.out.println("Base method");
        if(args.length>0){
            System.out.println(args[0]);
        }
    }
}
