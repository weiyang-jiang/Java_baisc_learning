package day12.线程安全;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockRunnable implements Runnable{
    int ticket = 100;

    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket < 1){
                lock.unlock();
                break;
            }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + ":正在出售第" + ticket + "张票");
            ticket--;
            lock.unlock();
        }
    }
}
