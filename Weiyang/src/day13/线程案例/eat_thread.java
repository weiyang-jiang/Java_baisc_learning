package day13.线程案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 18:50:11
 */

import com.sun.media.jfxmedia.logging.Logger;

import java.util.Scanner;
import java.util.TreeMap;

public class eat_thread extends Thread{
    BaoZi bz;

    public eat_thread(BaoZi bz) {
        this.bz = bz;
    }


    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        
        while (true){

            synchronized (bz){
                if (bz.flag == false){
                    System.out.println("消费线程：包子吃光了，请再做点");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (true){
                    if (bz.flag == true){
                        System.out.println("消费线程:请输入你一次性吃掉的包子数量");
                        int eat_num = sc.nextInt();
                        if (eat_num > bz.state){
                            System.out.println("没有这么多的包子，只能吃"+bz.state+"个包子");
                        }
                        bz.state -= eat_num;
                        if (bz.state < 1){
                            bz.flag = false;
                        }
                        if (bz.state < 0){
                            bz.state = 0;
                        }
                        System.out.println("消费线程: 现在还有"+bz.state+"个包子");
                    }else {
                        System.out.println("包子全部吃完了");
                        bz.notify();
                        break;
                    }
                }

            }
        }
    }
}
