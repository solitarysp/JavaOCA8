package com.lethanh98.java.learn.oca8.chap1.classstructure.comment;

public class User {
    private String name; // Khai báo field Name để khai báo tên của User.

    /**
     * Method get Name
     * @return không trả về gì
     */
    public String getName() {
        return name;
    }

    /*
     * Tạo method setName để set name cho User
     * Ví dụ: setName("test");
     */
    public void setName(String name) {
        this.name = name;
    }
}
