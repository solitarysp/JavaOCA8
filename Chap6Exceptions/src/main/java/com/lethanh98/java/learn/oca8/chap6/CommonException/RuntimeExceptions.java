package com.lethanh98.java.learn.oca8.chap6.CommonException;

import com.lethanh98.java.learn.oca8.chap6.BaseInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RuntimeExceptions implements BaseInterface {
    public static void main(String[] args) throws Exception {
        BaseInterface baseInterface = new RuntimeExceptions();
        baseInterface.run();
    }

    @Override
    public void run() throws Exception {
        demoArithmeticException();
        ArrayIndexOutOfBoundsExceptionSimple();
        ClassCastExceptionSimple();
        IllegalArgumentExceptionSimple(-1);
        NullPointerExceptionSimple();
        NumberFormatExceptionSimple();
    }

    private void NumberFormatExceptionSimple() {
        log.info(BASE_LOG, "NumberFormatExceptionSimple");
        try {
        Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void NullPointerExceptionSimple() {
        log.info(BASE_LOG, "NullPointerExceptionSimple");
        try {
            String str = null;
            str.indexOf("!");
        } catch (NullPointerException e) {
            log.error(e.getMessage(), e);
        }
        log.info(BASE_LOG, "NullPointerExceptionSimple2");
        try {
            String str = null;
            if (str == null) {
                throw new NullPointerException("str cannot null");
            }
        } catch (NullPointerException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void IllegalArgumentExceptionSimple(int numberEggs) {
        log.info(BASE_LOG, "IllegalArgumentExceptionSimple");
        try {
            if (numberEggs < 0)
                throw new IllegalArgumentException("# eggs must not be negative");
            log.info("NumberEgg {}", numberEggs);
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void ClassCastExceptionSimple() {
        log.info(BASE_LOG, "ClassCastExceptionSimple");
        try {
            String type = "moose";
            Object obj = type;
            // không thể case vì class gốc không liên quan gì đến Integer
            Integer number = (Integer) obj;
        } catch (ClassCastException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void ArrayIndexOutOfBoundsExceptionSimple() {
        log.info(BASE_LOG, "ArrayIndexOutOfBoundsExceptionSimple");
        try {
            int[] countsOfMoose = new int[3];
            log.info("{}", countsOfMoose[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void demoArithmeticException() {
        log.info(BASE_LOG, "demoArithmeticException");
        try {
            int answer = 11 / 0;
        } catch (ArithmeticException e) {
            log.error(e.getMessage(), e);
        }
    }
}
