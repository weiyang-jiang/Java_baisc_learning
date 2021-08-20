package day04;

import java.util.Scanner;

public class demo3_day04 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数据：");
        int num = sc.nextInt();
        int signal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("这是第" + (i+1) + "个数字");
                signal++;
                break;
            }
        }
        if (signal==0){
            System.out.println("不存在这个数字");
        }
    }


}
