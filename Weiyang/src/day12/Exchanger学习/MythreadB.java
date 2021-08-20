package day12.Exchanger学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 14:03:33
 */

import java.util.concurrent.Exchanger;

public class MythreadB extends Thread{
    Exchanger<String> ex;

    public MythreadB(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public String toString() {
        return "MythreadB{" +
                "ex=" + ex +
                '}';
    }

    @Override
    public void run() {
        System.out.println("B to A");

        try {
            String messageA = ex.exchange("B信息");
            System.out.println("B:"+messageA);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
