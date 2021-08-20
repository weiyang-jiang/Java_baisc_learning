package day12.多线程操作map;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:27:56
 */

public class demo {
    public static void main(String[] args) {
        new Mythread().start();
        new Mythread().start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Mythread.map.size());
    }
}
