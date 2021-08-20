package day12.多条线程操作集合arraylist;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:13:38
 */

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Mythread1 extends Thread{

    public static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

    }
}
