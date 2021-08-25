package day17.注解.基本注解;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 22:29:16
 */

public class demo {
//    @SuppressWarnings("all") // 压制、忽略警告
    public static void main(String[] args) {
//        @SuppressWarnings("all")
        int num = 10;
        method1();

    }

    @Deprecated // 标记这个方法已经过时了
    public static void method1(){
        System.out.println("method....");
    }
}

