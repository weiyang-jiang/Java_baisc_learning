package day13.lamada表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 13:48:33
 */

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    // 小括号内参数类型可以省略
    // 如果小括号内有且只有一个参数，那么参数类型和小括号可以一起省略
    // 如果大哭哦中有且只有一行代码，无论是否有返回值，大括号，return和分号都可以省略
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(400);
        nums.add(200);
        nums.add(300);
        System.out.println(nums);
        Collections.sort(nums, (a, b)->b - a);
        System.out.println(nums);

        IA ia = (int a)->{
            System.out.println("num"+a);
        };
        ia.method(10);
    }
}
