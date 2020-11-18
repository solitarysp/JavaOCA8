package com.lethanh98.java.learn.oca8.chap1.finalize;

import java.util.ArrayList;
import java.util.List;

public class UserFinalize {
    private static List objects = new ArrayList();

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ron rac");
        objects.add(this);
        System.out.println("Ron rac DONE");
    }
}
