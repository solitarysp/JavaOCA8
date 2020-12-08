package com.lethanh98.java.learn.oca8.chap2.StatementsJava.AdvancedFlowControl;

import com.lethanh98.java.learn.oca8.chap2.Operators;
import lombok.extern.slf4j.Slf4j;


@Slf4j
/**
 * Câu lệnh Break để phá vỡ flow control, chuyển quyền kiểm soát ra ngoài và chạy câu lệnh tiếp theo
 */
public class Break implements Operators {
    public static void main(String[] args) {
        Operators operators = new Break();
        operators.run();
    }

    @Override
    public void run() {
        example1();
        example2();
    }
    // Nêu câu lệnh break không có label, bread sẽ làm kết thúc vòng lặp gần nhất
    private void example2() {
        log.info("==========================example2=====================");
        for (int i = 0; i < 5; i++) {
            log.info("i {}", i);
            for (int j = 0; j < 10000; j++) {
                log.info("j {}",j);
                break;
            }
        }
    }

    // Phá vỡ câu lệnh vòng lặp, kết thúc vòng lặp sớm
    private void example1() {
        log.info("==========================example1=====================");
        for (int i = 0; i < 5; i++) {
            log.info("{}", i);
            if (i == 2) {
                break;
            }
        }
    }

}
