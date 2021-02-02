package com.lethanh98.java.learn.oca8.chap6.ExeptionChinh.exception;

public class ExceptionSimple {
    public static void main(String[] args) {

    }

    /**
     * Các Exception và sublcass trừ RUntiimeException thì khi chúng ta throw chúng ta bắt buộc phải handling nó,
     * hoặc báo với người gọi đến là mày hãy handling lỗi này đi khi đó thì method gọi sẽ bắt buộc phải handling hoặc nói vs method gọi method đó han ling
     */
    public void testException() throws Exception {
        throw new Exception();
    }

    public void testException2() throws Exception {
        testException();
    }
}
