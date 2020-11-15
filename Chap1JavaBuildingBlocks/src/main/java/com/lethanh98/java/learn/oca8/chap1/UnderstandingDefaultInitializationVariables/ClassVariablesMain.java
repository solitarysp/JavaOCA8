package com.lethanh98.java.learn.oca8.chap1.UnderstandingDefaultInitializationVariables;

public class ClassVariablesMain {
    public static void main(String[] args) {
        ClassVariables c1 = new ClassVariables();
        ClassVariables c2 = new ClassVariables();
        System.out.println("=====Lan 1=====");
        System.out.println(c1.getClassName());
        System.out.println(c2.getClassName());
        System.out.println(ClassVariables.className);

        System.out.println("c1 thay đổi");
        c1.setClassName("test");

        System.out.println("=====Lan 2=====");
        System.out.println(c1.getClassName());
        System.out.println(c2.getClassName());
        System.out.println(ClassVariables.className);
    }


}
