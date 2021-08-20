package day12.多条线程操作集合arraylist;

public class Demo1 {
    public static void main(String[] args) {

        new Mythread1().start();
        new Mythread1().start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Mythread1.list.size());
    }
}
