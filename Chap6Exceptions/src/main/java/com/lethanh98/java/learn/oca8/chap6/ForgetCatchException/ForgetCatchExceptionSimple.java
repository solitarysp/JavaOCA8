package com.lethanh98.java.learn.oca8.chap6.ForgetCatchException;

public class ForgetCatchExceptionSimple {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Nếu có Exception trong finally  thì Exception trong catch sẽ được bỏ qua.
     * @throws Exception
     */
    private static void test() throws Exception {
        try {
            throw new RuntimeException("Error in try");
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in catch");

        } finally {
            throw new Exception("Error in finally");
        }
    }
}
