package com.lethanh98.java.learn.oca8.chap1.packageDeclarations;

import java.util.Date;

public class NamingConflicts {
    public static void main(String[] args) {
        Date date=new Date();
        java.sql.Date dateSql=new java.sql.Date(1);
    }
}
