package day12.多线程;

public class demo1 {
    public static void main(String[] args) {
        // 多线程代码
        /*
        1. 第一步是新建一个多线程类
        2. 第二步是重写run方法
        3. 在main方法中新建一个线程类
        4. 调用start方法执行
         */
        thread_learn th = new thread_learn();
        th.start();

        run_able r = new run_able();
        Thread th1 = new Thread(r);
        th1.start();



        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("new_run_able:"+i);
                }
            }
        });
        th2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+i);
        }
    }
}
