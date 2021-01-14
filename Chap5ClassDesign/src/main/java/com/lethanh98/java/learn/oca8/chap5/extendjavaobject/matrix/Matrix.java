package com.lethanh98.java.learn.oca8.chap5.extendjavaobject.matrix;

public class Matrix {
}

class NotAbs1 {

}

abstract class Abs1 extends NotAbs1 {
    public abstract void absMethod1();
}

class NotAbs2 extends Abs1 {
    @Override
    public void absMethod1() {

    }
}

abstract class Abs2 extends NotAbs2 {
    public abstract void absMethod2();
}
class NotAbs3 extends Abs2 {
    @Override
    public void absMethod2() {

    }
}