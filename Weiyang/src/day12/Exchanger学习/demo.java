package day12.Exchanger学习;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-19 13:56:03
 */

import java.util.concurrent.Exchanger;

public class demo {
    public static void main(String[] args) {
        // 主要用于线程之间的数据交换
        Exchanger<String> ex = new Exchanger<>();

        new MythreadA(ex).start();
        new MythreadB(ex).start();
    }
}
