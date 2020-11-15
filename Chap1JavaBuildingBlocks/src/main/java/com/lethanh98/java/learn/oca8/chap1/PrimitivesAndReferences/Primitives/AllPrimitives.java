package com.lethanh98.java.learn.oca8.chap1.PrimitivesAndReferences.Primitives;

import lombok.ToString;

@ToString
public class AllPrimitives {
    public final float PIE = (float) 3.14;
    public final float PIE2 = 3.14f;
    boolean isTrue = true; //1bit. định nghĩa đúng sai
    byte numberByte = 127; //8bit. số từ -128 -> 127
    short numberShort = 3276; //16bit. số từ -32768 -> 32767
    int numberInt = 2147483647; //32bit. số từ -2.147.483.648 -> 2.147.483.647
    long numberLong = 9223372_____________036854775807L; //64bit. số từ -9.223.372.036.854.775.808 -> 9.223.372.036.854.775.807
    float numberFloat = 92233720___3685477580_7.9223372036_8547758_07777f; //64bit. số từ -9.223.372.036.854.775.808 -> 9.223.372.036.854.775.807
    double numberDouble = 9223372036854775807L; //64bit. số từ -9.223.372.036.854.775.808 -> 9.223.372.036.854.775.807

    public static void main(String[] args) {
        AllPrimitives allPrimitives = new AllPrimitives();
        System.out.println(allPrimitives.toString());
    }

}
