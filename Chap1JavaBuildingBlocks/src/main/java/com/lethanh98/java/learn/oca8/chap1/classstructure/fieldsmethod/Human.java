package com.lethanh98.java.learn.oca8.chap1.classstructure.fieldsmethod;

/**
 * Một class java cơ bản.
 */
public class Human {// Khai báo 1 class Human với mức độ truy cập là public để cho phép gọi từ bên ngoài
    private String name;

    public String getName() { // Khai báo 1 method getName với thao tác với name và cho phép gọi tư bên ngoài
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
