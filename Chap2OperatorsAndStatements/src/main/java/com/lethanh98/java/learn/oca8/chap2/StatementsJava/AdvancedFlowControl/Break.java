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
        exampleUsingLabelBreak();
        exampleWhileLoop();
    }

    private void exampleWhileLoop() {
        log.info("==========================exampleWhileLoop=====================");
        int len = 0;
        while (len < 6) {
            log.info("check len {}",len);
            if (len == 3) {
                break;
            }
            len++;
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
    // Nêu câu lệnh break không có label, bread sẽ làm kết thúc vòng lặp gần nhất
    private void example2() {
        log.info("==========================example2=====================");
        for (int i = 0; i < 5; i++) {
            log.info("i {}", i);
            for (int j = 0; j < 10000; j++) {
                log.info("j {}", j);
                break;
            }
        }
    }
    // Sử dụng label chúng ta có thể kết thúc vòng lặp level cao hơn ví dụ cha, hoặc cha của cha...etc..
    private void exampleUsingLabelBreak() {
        log.info("==========================exampleUsingLabelBreak=====================");
        int idFind = 6;
        int[][] list = {{1, 2, 3}, {4, 5, 6}, {6, 8, 9}};
        int index = -1;

PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            log.info("i= {}", i);
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == idFind) {
                    index = i;
                    break PARENT_LOOP;
                }
            }
        }
        log.info("index {}", index);
    }

}
