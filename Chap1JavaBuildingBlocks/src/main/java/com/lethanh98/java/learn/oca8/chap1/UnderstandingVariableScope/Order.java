package com.lethanh98.java.learn.oca8.chap1.UnderstandingVariableScope;

public class Order {
    public void pay(int number) {
        int basePrice = 1;
    }

    public void autoPay(boolean isAuto) {
        if (isAuto) {// mở đầu 1 block
            int maxNumberAutoPay = 1; // Biến local của block
            System.out.println(maxNumberAutoPay); // biến nằm trong block nên có thể truy cập
        }// kết thúc một block
     //   System.out.println(maxNumberAutoPay);// Lỗi compiler vì biến ở trong block
    }
    public void autoPayVip(boolean isAuto) {
        if (isAuto) {// mở đầu 1 block
            int maxNumberAutoPay = 1; // Biến local của block

            {
                System.out.println(maxNumberAutoPay); // biến nằm trong block nên có thể truy cập
            }

            if(maxNumberAutoPay<5) {
                System.out.println("thanh toan "+ maxNumberAutoPay); // Block thấp hơn có thể truy cập vào block cao hơn
            }
        }// kết thúc một block
     //   System.out.println(maxNumberAutoPay);// Lỗi compiler vì biến ở trong block
    }
}
