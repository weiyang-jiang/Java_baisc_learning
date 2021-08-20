package day12.多线程;

public class thread_learn extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("thread_learn子线程" + i);
        }
    }
}
