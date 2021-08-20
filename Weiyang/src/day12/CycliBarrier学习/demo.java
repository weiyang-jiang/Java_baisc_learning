package day12.CycliBarrier学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:21:14
 */

import java.util.concurrent.CyclicBarrier;

public class demo {
    public static void main(String[] args) {
        // 让所有线程都到达屏障才能执行之后的代码
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("可以开会了。。。。。");
            }
        });
        Myrunable mr = new Myrunable(cb);

        new Thread(mr, "员工1").start();
        new Thread(mr, "员工2").start();
        new Thread(mr, "员工3").start();
        new Thread(mr, "员工4").start();
        new Thread(mr, "员工5").start();
    }
}
