package day12.解决可见性问题;

public class Mythread extends Thread{

    // 当变量别修饰为volatile时， 会迫使线程每次使用这个变量都会去主内存中获取，保证其可见性
    volatile static boolean flag = false; // 共享变量

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag的值改为了true");
    }
}
