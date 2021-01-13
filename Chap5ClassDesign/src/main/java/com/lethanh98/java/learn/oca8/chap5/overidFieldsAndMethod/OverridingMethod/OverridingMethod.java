package com.lethanh98.java.learn.oca8.chap5.overidFieldsAndMethod.OverridingMethod;

public class OverridingMethod {
    public static void main(String[] args) {

    }
}

class A {
    public String getName() {
        return "name";
    }

    public String getName2() throws Exception {
        return "name";
    }

    public String getName3() {
        return "name";
    }

    protected String getName4() {
        return "name";
    }
    protected String getName5() {
        return "name";
    }
}

class B extends A {

    public String getName() {
        return "name";
    }

    @Override
    // class con không cần khai báo  Exception
    public String getName2() {
        return "name";
    }

    //    @Override
//    // class con không cần khai báo  Exception
//    public String getName3() throws Exception {
//        return "name";
    //   }
    @Override
    // Quyền truy cập phải rộng hơn class cha
    protected String getName4() {
        return "name";
    }
    // Quyền truy cập phải rộng hơn class cha
    public String getName5() {
        return "name";
    }
}
