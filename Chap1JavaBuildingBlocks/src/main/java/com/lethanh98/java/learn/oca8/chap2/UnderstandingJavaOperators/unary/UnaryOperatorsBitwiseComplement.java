package com.lethanh98.java.learn.oca8.chap2.UnderstandingJavaOperators.unary;

/**
 * Toán tử Bitwise Complement(~) sẽ đảo ngược lại tấ cả bit của biến. Ví dụ biến a có giá trị là 5 = bit 101
 * Khi sử dụng ~5 thì bit sẽ đảo ngược thành 010 = 2
 */
public class UnaryOperatorsBitwiseComplement implements UnaryOperators {
    public static void main(String[] args) {
        UnaryOperators unaryOperators = new UnaryOperatorsBitwiseComplement();
        unaryOperators.run();
    }

    @Override
    public void run() {
        int a = 5;
        System.out.println(" Binary of  " + a + "  is  : " + String.format("%32s", Integer.toBinaryString(a)).replaceAll(" ", "0"));
        int aa = ~a;
        System.out.println(" Binary of  " + aa + "  is : " + String.format("%32s", Integer.toBinaryString(aa)).replaceAll(" ", "0"));

    }


}
