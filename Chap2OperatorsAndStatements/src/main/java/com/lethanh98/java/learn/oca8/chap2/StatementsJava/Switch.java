package com.lethanh98.java.learn.oca8.chap2.StatementsJava;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j

public class Switch implements Operators {
    public static void main(String[] args) {
        Operators operators = new Switch();
        operators.run();
    }

    @Override
    public void run() {
        example1(5);
        example2(5);
    }

    private void example1(int number) {
        log.info("==================example1============");
        switch (getData(number)) {
            default: {
                log.info("Default");
            }
            case 1: {
                log.info("1");
                break;
            }

        }
    }

    private void example2(int number) {
        log.info("==================example2============");

        switch (getData(number)) {
            case 1:
                String result="1";
                log.info("1");
                break;
            case 2:
                log.info("2");
                break;

        }
    }

    private void example3(int number) {
        log.info("==================example3============");
        switch (getData(number)) {
            case 1: {
                String result="1";
                log.info("1");
                break;
            }
            case 2: {
                String result="1";
                log.info("2");
                break;
            }

        }
    }
  /*  private void example4(int number) {
        log.info("==================example4============");
        int dataForCase= 1;
        switch (getData(number)) {
            case 1: {
                String result="1";
                log.info("1");
                break;
            }
            case dataForCase: {
                String result="1";
                log.info("2");
                break;
            }

        }
    }*/

    private int getData(int number) {
        return number;
    }


}
