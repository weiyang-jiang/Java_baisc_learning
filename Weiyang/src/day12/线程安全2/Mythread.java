package day12.线程安全2;

public class Mythread extends Thread{

    static int a = 0;

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        System.out.println("子线程结束");
    }
}
