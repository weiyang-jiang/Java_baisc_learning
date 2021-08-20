package day12.Semaphore学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:41:54
 */

public class demo {
    public static void main(String[] args) {
        classroom cr = new classroom();

        MyRunnable mr = new MyRunnable(cr);

        new Thread(mr, "同学1").start();
        new Thread(mr, "同学2").start();
        new Thread(mr, "同学3").start();
        new Thread(mr, "同学4").start();
        new Thread(mr, "同学5").start();
    }
}
