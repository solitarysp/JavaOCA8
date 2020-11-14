package com.lethanh98.java.learn.oca8.chap1.CreatingObject.OrderInitializtion;

public class OIUser extends OIBase {
    Integer age;

    {
        age = 18;
        System.out.println(age);
    }

    {
        System.out.println("tuổi là"+age);
    }
   static  {
        System.out.println("staic 1");
    }
    static  {
        System.out.println("staic 2");

    }

    public OIUser() {
    }

    String name;

    public OIUser(String name) {
        System.out.println("khởi tạo name");
        this.name = name;
    }

}
