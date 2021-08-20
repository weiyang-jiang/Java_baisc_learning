package day12.count_down_latch;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:03:02
 */

import java.util.concurrent.CountDownLatch;

public class Mythread3 extends Thread{
    CountDownLatch cdl;

    public Mythread3(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("D");

        cdl.countDown();
    }
}
