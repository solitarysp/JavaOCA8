package com.lethanh98.java.learn.oca8.chap6.callingMethodsThatThrowExceptions;

public class Tesst {
    public static void main(String[] args) {

    }

    /**
     * Nếu trong try khong có mehthod nào throw một checked Exception  không phải Exception  thì compiler sẽ báo lỗi
     * Lý do đơn giản là Exception  đó sẽ không bao giờ throw ra
     */
    public void bad() {
//        try {
//            eatCarrot();
//        } catch (NoMoreCarrotsException e) {
//
//        }
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    private static void eatCarrot() {
    }
}

class NoMoreCarrotsException extends Exception {

}

