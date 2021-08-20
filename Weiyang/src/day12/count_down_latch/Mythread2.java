package day12.count_down_latch;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:53:19
 */

import java.util.concurrent.CountDownLatch;

public class Mythread2 extends Thread{
    CountDownLatch cdl;

    public Mythread2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("B");

        cdl.countDown();
    }
}
