package day13.线程状态;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 16:48:47
 */

public class demo {
    /*
    新建状态，可运行状态，锁阻塞状态，无限等待状态，计时等待状态，被终止状态
    1. Waiting(无限等待): 一个线程等待另外一个线程执行一个唤醒动作，锁对象调用wait方法
        调用wait方法进入无限等待状态
    2. 计时等待
    3. notify唤醒单个线程
    4. notifyAll唤醒所有等待的线程
     */

    /*
    如果一个线程进行了规定操作后，让其进入无限等待状态，调用notify（）方法唤醒其他线程来执行，
    其他线程执行完后，进入无限等待状态，唤醒等待线程执行，依次循环
     */
    public static Object obj = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("线程1：准备调用wait方法进入无限等待");
                    try {
                        // 调用wait方法
                        obj.wait(); // 这个地方会释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("被唤醒了");
                }

            }
        },"线程1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("线程2执行完任务，准备唤醒线程1");
                    obj.notify();
                }

            }
        },"线程2").start();
    }
}
