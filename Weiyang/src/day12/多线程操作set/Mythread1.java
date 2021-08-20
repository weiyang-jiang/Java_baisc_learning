package day12.多线程操作set;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:20:57
 */

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Mythread1 extends Thread{
    public static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            set.add(i);

        }
        System.out.println("结束");
    }
}
