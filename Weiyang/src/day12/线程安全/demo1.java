package day12.线程安全;

public class demo1 {
    public static void main(String[] args) {
        LockRunnable mr = new LockRunnable();

        // 创建4条线程,并启动
        // 因为多线程是抢占式，所以就不确定哪一条线程先执行。
        new Thread(mr, "窗口3").start();
        new Thread(mr, "窗口2").start();
        new Thread(mr, "窗口1").start();
        new Thread(mr, "窗口4").start();
    }
}
