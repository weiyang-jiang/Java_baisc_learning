package day12.线程池练习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 16:05:46
 */

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }



}
