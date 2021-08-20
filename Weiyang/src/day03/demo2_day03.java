package day03;

import java.util.Scanner;

public class demo2_day03{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几");
        int weekNum = sc.nextInt();
        if (weekNum>3){
            System.out.println("lalal");
        }
//        switch (weekNum) {
//            case 1 -> System.out.println("今天是星期一");
//            case 2 -> System.out.println("今天是星期二");
//            case 3 -> System.out.println("今天是星期三");
//            case 4 -> System.out.println("今天是星期四");
//            case 5 -> System.out.println("今天是星期五");
//            default -> System.out.println("啥也不干");
//        }

    }
}
