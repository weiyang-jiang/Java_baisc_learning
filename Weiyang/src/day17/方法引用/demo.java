package day17.方法引用;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 14:41:33
 */

public class demo {
    public static void method1(){
        System.out.println("Thread2");
    }
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Thread1");
        }).start();

        new Thread(demo::method1).start(); // 使用一对冒号可以替换lambda表达式， 类：：类中的方法
    }
}
