package com.lethanh98.java.learn.oca8.chap1.packageDeclarations;
/**
 * Có thể sử dụng * để import tất cả class trong một package, tuy nhiên các sub package sẽ không đc đi theo chúng ta cần cần import chúng
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Wildcards {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        Arrays.asList("c");
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        System.out.println("d");
    }
}
