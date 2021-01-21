package com.lethanh98.java.learn.oca8.chap5.polymorphism;

interface IA {
    boolean iATest();
}

class ClassA {
    boolean classATest() {
        return true;
    }
}

public class SimplePolymorphism extends ClassA implements IA {
    public static void main(String[] args) {
        SimplePolymorphism simplePolymorphism = new SimplePolymorphism();
        // tham chiếu SimplePolymorphism có quyền truy cập iATest và classATest()
        System.out.println(simplePolymorphism.iATest());
        // ClassA chỉ có quyền truy cập vào classATest không thể truy cập iATest
        ClassA classA = simplePolymorphism;
        System.out.println(classA.classATest());
        // tham chiếu IA chỉ có thể truy cập iATest và không thể truy cậpclassATest
        IA ia = simplePolymorphism;
        System.out.println(ia.iATest());

        // Vì Ia và ClassA không có mối quan hệ thứ bậc hoặc là cha của ClassA nên sẽ cần cast rõ ràng
        // Vì class của object gốc impl IA nên việc cast vẫn sẽ ok
        IA ia2 = (IA) classA;
        System.out.println(ia2.iATest());
    }

    @Override
    public boolean iATest() {
        return true;
    }
}