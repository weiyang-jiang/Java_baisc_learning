package day12.多线程操作set;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 12:20:35
 */

public class Demo1 {
    public static void main(String[] args) {
        new Mythread1().start();
        new Mythread1().start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Mythread1.set.size());

    }
}
