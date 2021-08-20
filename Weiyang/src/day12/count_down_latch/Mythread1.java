package day12.count_down_latch;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:49:58
 */

import java.util.concurrent.CountDownLatch;

public class Mythread1 extends Thread{
    CountDownLatch cdl;

    public Mythread1(CountDownLatch cdl){
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("A");
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
