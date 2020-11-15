package com.lethanh98.java.learn.oca8.chap1.UnderstandingDefaultInitializationVariables;

public class InstanceVariables {
    String name;// là biến instance. Mỗi lần tạo một instance mới thì instance mới đó sẽ có 1 biến name riêng

    public static void main(String[] args) {
        InstanceVariables a1 = new InstanceVariables();
        a1.name = "a111";
        InstanceVariables a2 = new InstanceVariables();
        a2.name = "A2222";
        System.out.println(a1.name);
        System.out.println(a2.name);
    }
}
