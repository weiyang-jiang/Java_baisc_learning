package day12.表示原子性数组;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Mythread1 extends Thread{

//    public static int[] arr = new int[1000];
    public static AtomicIntegerArray arr = new AtomicIntegerArray(1000);
    @Override
    public void run() {
        for (int i = 0; i < arr.length(); i++) {
            arr.getAndAdd(i, 1); //给每个元素加一
        }

    }
}
