package day12.死锁;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 16:14:36
 */

public class demo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁A"){
                    System.out.println("线程A:获取到了A锁，等待获取B锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized ("锁B"){
                        System.out.println("线程B:获取到A，B，开始执行内部代码");
                    }
                }
            }
        }, "线程A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁B"){
                    System.out.println("线程B:获取到了B锁，等待获取A锁");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized ("锁A"){
                        System.out.println("线程B:获取到A，B，开始执行内部代码");
                    }
                }
            }
        }, "线程A").start();
    }
}
