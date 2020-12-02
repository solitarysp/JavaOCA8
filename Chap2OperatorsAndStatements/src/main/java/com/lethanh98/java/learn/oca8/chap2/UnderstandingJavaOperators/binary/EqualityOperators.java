package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class EqualityOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new EqualityOperators();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
        exampleError();
    }

    private void exampleError() {
      //  boolean a = 1 == true;
    }

    private void example2() {
        log.info("===================example2===================");
        String a = "a";
        String b = new String("a");
        if(a == b ){
            log.info("a == b");
        }
        if(true == true ){
            log.info("true == true");
        }
    }

    private void example1() {
        if (5 == 5.000000000001f) {
            System.out.println("Yes");
        }
        if (5 == 5.0001f) {
            System.out.println("yes");
        }
        if (5 == 5.1) {
            System.out.println("yes");
        }
    }


}
