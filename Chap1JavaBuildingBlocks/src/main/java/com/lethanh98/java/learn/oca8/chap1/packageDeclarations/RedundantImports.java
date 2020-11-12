package com.lethanh98.java.learn.oca8.chap1.packageDeclarations;

import java.lang.reflect.AnnotatedElement;
import java.nio.file.Paths;
import java.util.Random;

public class RedundantImports {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
        AnnotatedElement annotatedElement;
        Paths.get("name");
    }
}
