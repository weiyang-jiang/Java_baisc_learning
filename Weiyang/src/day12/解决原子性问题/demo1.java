package day12.解决原子性问题;

import day12.解决原子性问题.Mythread;

public class demo1 {
    public static void main(String[] args) {
        Mythread mt = new Mythread();

        mt.start();

        for (int i = 0; i < 100000; i++) {
            Mythread.a.getAndIncrement();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
        System.out.println(Mythread.a);
    }
}
