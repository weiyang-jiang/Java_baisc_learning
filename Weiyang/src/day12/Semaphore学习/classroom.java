package day12.Semaphore学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:47:50
 */

import java.util.concurrent.Semaphore;

public class classroom {
    // 每一次只能保证队列中有两个线程在运行。
    Semaphore sp = new Semaphore(2);

    public void into(){
        try {
            sp.acquire(); // 获取到两个线程的许可
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"进入教室");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"离开教室");
        sp.release(); // 释放两个线程的许可，让其他线程进入
    }
}
