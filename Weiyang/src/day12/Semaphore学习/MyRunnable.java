package day12.Semaphore学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:49:41
 */

public class MyRunnable implements Runnable{
    classroom cr;

    public MyRunnable(classroom cr) {
        this.cr = cr;
    }

    @Override
    public void run() {
        cr.into();
    }
}
