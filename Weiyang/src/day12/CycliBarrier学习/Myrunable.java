package day12.CycliBarrier学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:34:02
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Myrunable implements Runnable{
    CyclicBarrier cb;

    public Myrunable(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"到达会议室");
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"离开会议室");
    }
}
