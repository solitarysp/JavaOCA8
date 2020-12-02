package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.binary;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LogicalOperators implements Operators {
    public static void main(String[] args) {
        Operators operators = new LogicalOperators();
        operators.run();
    }

    @Override
    public void run() {
        byte x = (byte) 258;
        example1();
        example2();
        example3();
        example4();
    }

    private void example4() {
        String a = null;
        if(a != null & a.indexOf("1") > 0){
            log.info("Yes");
        }
    }

    private void example3() {
        if (true ^ false) {
            System.out.println("yes");
        }

    }

    private void example2() {
        log.info("====================example2====================");
        log.info("====================example1_Method2() | example1_Method1()====================");
        if (example1_Method2() | example1_Method1()) {
            log.info("DOne 1");
        }
        log.info("====================example1_Method2() || example1_Method1()====================");
        if (example1_Method2() || example1_Method1()) {
            log.info("Done 2");

        }
    }

    private void example1() {
        log.info("====================example1====================");
        log.info("====================example1_Method1() & example1_Method2()====================");
        if (example1_Method1() & example1_Method2()) {
            log.info("DOne 1");
        }
        log.info("====================example1_Method1() && example1_Method2()====================");

        if (example1_Method1() && example1_Method2()) {
            log.info("Done 2");
        }
    }

    public boolean example1_Method1() {
        log.info("example1_Method1");
        return false;
    }

    public boolean example1_Method2() {
        log.info("example1_Method2");
        return true;
    }


}
