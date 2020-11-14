package com.lethanh98.java.learn.oca8.chap1.CreatingObject.OrderInitializtion;

public class OIBase {
    String nation;
    {
        System.out.println("khoi tao base");
    }
    public OIBase() {
        nation = "VietNam";
    }
}
