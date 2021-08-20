package day12.多线程;

public class run_able implements Runnable{
    private String name;

    public run_able(String name) {
        this.name = name;
    }

    public run_able() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run_able子线程："+this.name+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
