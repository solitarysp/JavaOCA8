package com.lethanh98.java.learn.oca8.chap1.CreatingObject;

import lombok.Data;

@Data
public class User {
    String name;
    Integer age = 18;// khởi tạo field trực tiếp  với giá trị default

    public User() { // là một constructor
        System.out.println("constructor user run");
    }

    public User(String name) { // là một constructor có tham số
        System.out.println("constructor user có tham số run");
        this.name = name; // khởi tạo field trong constructor
    }

    public void User() { // là một method của class
        System.out.println("is method");
    }
}
