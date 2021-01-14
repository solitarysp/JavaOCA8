package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.overidFieldsAndMethod;

public class HidingVariables {
    public static void main(String[] args) {
        ConEt con1 = new ConEt();
        // gọi ở class cha nên tên vẫn là class cha
        con1.showName();
        // Gọi ở class con nên sẽ sử dụng biến ở class con
        con1.showNameCon();
        // Sử dụng super để truy cập vào biến ở class cha
        con1.showNameCha();
        // quyền truy cập bị Overriding bởi class con nên không thể truy cập
//        System.out.println(cha.name);

        // Chúng ta đang sử dụng data type ref là con nên có thể truy cập age trực tiếp
        System.out.println("Tuổi" + con1.age);
        //address  với data type ref khác nhau thì sẽ gọi đến biến khác nhau
        System.out.println("Addres sử dụng tham chiếu data type con: " + con1.address);
        System.out.println("Addres sử dụng tham chiếu data type cha: " + ((Cha )con1).address);
    }

}

class Cha {
    public String name = "Cha";
    private Integer age = 40;
    public String address = "HaNoi";

    public void showName() {
        System.out.println(name);
    }

}

class ConEt extends Cha {
    // Quyền truy cập sẽ không làm ảnh hưởng đến hide variable
    // bản chất 2 biến thuộc 2 class khác nhau nên nó sẽ có các quyền truy cập khác nhau tuy theo data type ref
    private String name = "con";
    // Cùng tên những khác data type thì vẫn ok
    public String age = "18";
    public String address = "HaNoi 2";

    // OverridingMethod
    public void showNameCon() {
        System.out.println(name);
    }

    // OverridingMethod
    public void showNameCha() {
        System.out.println(super.name);
    }
}
