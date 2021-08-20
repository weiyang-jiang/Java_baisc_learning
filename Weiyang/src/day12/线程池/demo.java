package day12.线程池;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 14:10:25
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        1. 创建线程池
        2. 提交任务，并且执行任务
        3. 销毁线程池（一般不操作）
         */
        ExecutorService es = Executors.newFixedThreadPool(3);

//        MyRunnable mr = new MyRunnable();

//        es.submit(mr);
//        es.submit(mr);
//        es.submit(mr);
//        es.submit(mr);
//        es.submit(mr);
        MyCallable mc = new MyCallable();
        Future<String> future = es.submit(mc);
        es.submit(mc);
        es.submit(mc);
        es.submit(mc);
        es.submit(mc);
        System.out.println(future.get());
        es.shutdown();

    }
}
