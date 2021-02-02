package com.lethanh98.java.learn.oca8.chap6.ExeptionChinh.Error;

public class ErrorSimple {

}

class Test1 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        throw new Error();
    }
}

class Test2 {
    public static void main(String[] args) {
        test();
    }

    // Error cũng là 1 dạng runtime exeption  (unchekced)
    // Các lỗi error sẽ khong bắt buộc runtime phải hanling
    // Các Error chúng ta cũng không nên hanling
    private static void test() {
        throw new Error();
    }
}

class Test3 {
    public static void main(String[] args) {
        try {
            test();
            // chúng ta vẫn có thể handling error
        } catch (Error error) {
            System.out.printf("Error");
        }
    }

    private static void test() {
        throw new Error();
    }
}