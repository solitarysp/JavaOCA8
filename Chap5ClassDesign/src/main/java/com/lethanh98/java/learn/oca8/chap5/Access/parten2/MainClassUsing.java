package com.lethanh98.java.learn.oca8.chap5.Access.parten2;

import com.lethanh98.java.learn.oca8.chap5.Access.parten1.Parten1Public;

public class MainClassUsing extends Parten1Public {
    public static void main(String[] args) {
        // Public thì thoải mái sử dụng class này ở bất kỳ đâu
        Parten1Public parten1Public = new Parten1Public();

        // Không thể sử dụng class vì không có quyền truy cập class luôn vì đang khác package
        //  Parten1Default parten1Default=new Parten1Default();

        Parten1InnerProtected parten1InnerProtected = parten1Public.getParten1InnerProtected();
        System.out.println(parten1InnerProtected.getName());

//        Parten1InnerDefault parten1InnerDefault = parten1Public.getParten1InnerDefault();
//
//        System.out.println(parten1InnerDefault.getName());
    }
}
