package day12.线程池练习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 15:13:41
 */

import java.util.concurrent.*;

public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        MyCallable mr = new MyCallable(101);
        Future<Integer> result = es.submit(mr);
        Integer sum = result.get();
        System.out.println(sum);
        es.shutdown();
    }
}
