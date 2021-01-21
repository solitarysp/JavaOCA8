package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.overidFieldsAndMethod;

public class HidingStaticMethods {
    public static void main(String[] args) {
        HSB.show();
    }
}

class HSA {
    public static String name = "B";

    public static void show() {
        System.out.printf("A");
    }

    private static void show2() {
        System.out.printf("A");
    }

    protected static void show4() {
        System.out.printf("A");
    }

    public final static void show5() {
        System.out.printf("show5 ");
    }

    public static Number show6() {
        System.out.printf("show5 ");
        return 1;
    }

    protected void show3() {
        System.out.printf("A");
    }
}

class HSB extends HSA {
    public static String name = "B";

    // OK vì nó đang cùng static, cùng quyền truy cập, cùng tên cùng kiểu trả về
    public static void show() {
        System.out.printf("HSB show");
    }

    // OK vì nó đang cùng static, vì class con có quyền truy cập cao hơn class cha, cùng tên cùng kiểu trả về
    public static void show2() {
        System.out.printf("HSB show2");
    }

    // không được vì class cha không phải static
//    public static void show3() {
//        System.out.printf("A");
//    }
    // không được vì cha là staitc nhưng con không phải static
/*    public void show4() {
        System.out.printf("A");
    }
*/
    public static void show4() {
        System.out.printf("HSBshow4 ");
        show();
    }
    // là final nên không được hidden
/*    public final static void show5() {
        System.out.printf("show5 ");
    }*/

    public static Integer show6() {
        System.out.printf("show6 ");
        return 1;
    }
}
