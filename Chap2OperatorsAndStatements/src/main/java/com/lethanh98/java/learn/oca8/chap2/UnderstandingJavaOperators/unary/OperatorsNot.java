package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

import com.lethanh98.java.learn.oca8.chap2.Operators;

/**
 * Toán tử ‘NOT’ Operator(!) được sử dụng để đạo ngược lại giá trị true hoặc flase. Nếu giá trị là true thì sẽ đảo ngược là false, Nêu là false thì sẽ là true
 * !(operand)
 * Chỉ có tác dụng với boolean
 */
public class OperatorsNot implements Operators {
    public static void main(String[] args) {
        Operators operators = new OperatorsNot();
        operators.run();
    }

    @Override
    public void run() {
        boolean isOk = true;
        System.out.println(!isOk);

        boolean isOk2 = !false;
        System.out.println(isOk2);

    }
}
