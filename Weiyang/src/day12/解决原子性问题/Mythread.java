package day12.解决原子性问题;

import java.util.concurrent.atomic.AtomicInteger;

public class Mythread extends Thread{
    // volatile解决不了原子性问题
//    volatile static int a = 0;
    /*
    CAS机制，比较并交换。
    每一个线程都会先拷贝共享变量的值
    拿从主内存中拷贝出来的值与当前主内存中的值进行比较
    如果比较不相同的话，会重新获取一遍主内存中的值
    如果相同的话，就会对a进行+1自增操作
    这样可以保证数据的原子性
     */
    static AtomicInteger a = new AtomicInteger(0);
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            a.getAndIncrement(); //自增的代码
        }
        System.out.println("子线程结束");
    }
}
