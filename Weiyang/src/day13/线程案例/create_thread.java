package day13.线程案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 18:50:02
 */

import java.util.Scanner;

public class create_thread extends Thread{
    BaoZi bz;

    public create_thread(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            synchronized (bz) {
                if (bz.flag == true){
                    System.out.println("制作过程sdfs：包子已经做好了，请开始食用");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (true){
                    if (bz.flag == false) {
                        System.out.println("制作过程：请输入你要做的包子数量");
                        int create_num = sc.nextInt();
                        bz.state += create_num;
                        if (bz.state > 10){
                            bz.flag = true;
                        }
                        System.out.println("制作线程：现在包子总共" + bz.state + "个");
                    }else {
                        System.out.println("制作过程：包子已经做好了，请开始食用");
                        bz.notify();
                        break;
                    }
                }
            }
        }
    }
}

