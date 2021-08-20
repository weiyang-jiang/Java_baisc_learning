package day12.线程池;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 15:04:06
 */

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("实现runnable接口的任务");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
        return "weiyang";
    }
}
