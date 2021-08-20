package day12.Exchanger学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:59:52
 */

import java.util.concurrent.Exchanger;

public class MythreadA extends Thread{
    Exchanger<String> ex;

    public MythreadA(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public String toString() {
        return "MythreadA{" +
                "ex=" + ex +
                '}';
    }

    @Override
    public void run() {
        System.out.println("A to B");

        try {
            String messageB = ex.exchange("数据A");
            System.out.println("A:"+messageB);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
