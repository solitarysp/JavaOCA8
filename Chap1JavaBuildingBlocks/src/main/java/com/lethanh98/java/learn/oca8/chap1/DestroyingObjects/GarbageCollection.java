package com.lethanh98.java.learn.oca8.chap1.DestroyingObjects;

public class GarbageCollection {
    String name;

    public void setName(String name) {
        if (name == null) {
            String fullName = name + "LeVan";
            System.out.println(fullName);
        }
        // khi đến thời điểm này thì object fullName có thể được GC
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
