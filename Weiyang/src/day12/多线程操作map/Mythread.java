package day12.多线程操作map;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:28:05
 */

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
// 让map的线程安全
public class Mythread extends Thread{
    public static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            map.put(i, i);
        }
    }
}
