package day12.count_down_latch;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:44:46
 */

import java.util.concurrent.CountDownLatch;

public class demo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(2);

        new Mythread1(cdl).start();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        new Mythread2(cdl).start();

        new Mythread3(cdl).start();
    }
}
