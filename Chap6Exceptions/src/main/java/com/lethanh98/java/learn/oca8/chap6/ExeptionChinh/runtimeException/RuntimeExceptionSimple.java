package com.lethanh98.java.learn.oca8.chap6.ExeptionChinh.runtimeException;

public class RuntimeExceptionSimple {

    public static void main(String[] args) {
        RuntimeExceptionSimple simple=new RuntimeExceptionSimple();
        simple.testRuntimeException2();
    }

    /**
     * Với RuntimeException, java sẽ không bắt buộc chúng ta phải handling.
     * Nếu chúng ta vẫn throws một Runtime để mong muốn người gọi xử lý, nhưng nếu người gọi không xử lý thì cũng không sao cả
     * @throws RuntimeException
     */
    public void testRuntimeException() throws RuntimeException {
        throw new RuntimeException();
    }

    public void testRuntimeException2() {
        testRuntimeException();
    }

}
