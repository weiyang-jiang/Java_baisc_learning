package day12.多线程;

public class demo2 {
    public static void main(String[] args) {
        run_able r = new run_able("d");
        new Thread(r, "dd").start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
