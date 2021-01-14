package com.lethanh98.java.learn.oca8.chap5.ClassInheritance.Access.parten1;

import lombok.Data;

@Data
public class Parten1Public {
    Parten1InnerProtected parten1InnerProtected = new Parten1InnerProtected();
    Parten1InnerDefault parten1InnerDefault = new Parten1InnerDefault();

    @Data
    protected static class Parten1InnerProtected {
        private String name = "Parten1InnerProtected";
    }

    @Data
    static class Parten1InnerDefault {
        private String name = "Parten1InnerDefault";
    }
}
class Parten1PublicTest{

}
