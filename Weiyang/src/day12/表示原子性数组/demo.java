package day12.表示原子性数组;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        // 多线程操作数组
        for (int i = 0; i < 10000; i++) {
            new Mythread1().start();
        }
        // 实际中数组的数字不是一样的，不都是10000

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < Mythread1.arr.length(); i++) {
            System.out.println(Mythread1.arr.get(i));
        }
    }
}
