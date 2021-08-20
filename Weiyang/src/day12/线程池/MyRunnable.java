package day12.线程池;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 14:57:37
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("实现callable接口的任务");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
