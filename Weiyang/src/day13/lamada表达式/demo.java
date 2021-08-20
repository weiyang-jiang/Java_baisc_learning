package day13.lamada表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 12:59:57
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo {
    public static void main(String[] args) {
        // lambda表达式用来简化代码(参数类型， 参数名， 参数类型， 参数名)-{代码}
        // 把前面的参数给后面的代码使用
//        Thread t3 = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.println(i);
//            }
//        });
//        t3.start();
//        new Thread(()->{
//            System.out.println("name");
//        }).start();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(400);
        nums.add(200);
        nums.add(300);
        System.out.println(nums);
//        Collections.sort(nums, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        Collections.sort(nums,(Integer o1, Integer o2)->{return o2 - o1;});
        System.out.println(nums);
    }
}
