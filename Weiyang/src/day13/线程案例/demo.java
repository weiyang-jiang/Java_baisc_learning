package day13.线程案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 18:48:43
 */

public class demo {
    // 生产者消费者模型

    public static void main(String[] args) {

        BaoZi bz = new BaoZi(0);

        create_thread producer = new create_thread(bz);
        eat_thread consumer = new eat_thread(bz);

        producer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}
