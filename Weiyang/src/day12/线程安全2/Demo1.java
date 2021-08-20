package day12.线程安全2;

public class Demo1 {
    public static void main(String[] args) {
        Mythread mt = new Mythread();

        mt.start();

        for (int i = 0; i < 100000; i++) {
            Mythread.a++;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
        System.out.println(Mythread.a);
    }
}
