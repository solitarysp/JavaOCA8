package com.lethanh98.java.learn.oca8.chap5.polymorphism.PolymorphicParameters;

interface IA {

}

class IaIMPL implements IA {
    public IaIMPL() {
    }
}

public class PolymorphicParametersSimple {
    public static void main(String[] args) {

        PolymorphicParametersSimple.test(new IaIMPL());

    }

    public static void test(IA ia) {

    }
}