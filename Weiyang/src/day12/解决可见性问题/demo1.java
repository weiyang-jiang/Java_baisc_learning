package day12.解决可见性问题;

public class demo1 {
    public static void main(String[] args) {
        Mythread mt = new Mythread();

        mt.start();

        while (true){
            if (Mythread.flag == true){
                System.out.println("结束主线程中的循环");
                break;
            }
        }
    }
}
