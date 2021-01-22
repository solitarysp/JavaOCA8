package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.overidFieldsAndMethod;

public class HideMethod2 {
    public static void main(String[] args) {
        Class1 class1 = new Class2();
        // không thể truy cập với data type reference Class 1 vì showName ở đây không export ra ngoài để truy cập
        // class1.showName();
    }
}

class Class1 {
    public static void main(String[] args) {
        Class1 class1 = new Class2();
        // vì class 2 method không có quyền nhìn thấy method 1, vì vậy ShowName ở Class2 không phải là Override
        // Vì main static đang ở trong nội bội của class nên sẽ có quyền truy cập method này.
        // Vì vậy tùy theo data type refernce mà chúng showName sẽ được gọi ở object khác nhau
        class1.showName();
        ((Class2) class1).showName();
    }

    private void showName() {
        System.out.println("showname class1");
    }
}

class Class2 extends Class1 {
    public void showName() {
        System.out.println("showname class2");
    }
}