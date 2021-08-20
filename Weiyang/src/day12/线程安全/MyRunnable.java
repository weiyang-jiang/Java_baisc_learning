package day12.线程安全;

public class MyRunnable implements Runnable{
    // 一定要保证多个窗口使用的是同一个变量(共享变量)
    int tickets = 100;

    @Override
    public void run() {
        // 窗口卖票----线程要执行的任务
        // 循环卖票
        while (true) {
            if (selltickets()) break;
        }
    }

    private synchronized boolean selltickets() {
        // 没票了就结束循环
        if (tickets < 1){
            return true;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
        tickets--;
        return false;
    }


}