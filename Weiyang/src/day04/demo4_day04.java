package day04;

import java.util.Scanner;

public class demo4_day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {

            System.out.println("请输入第" + (i + 1) + "个成绩");
            int score = sc.nextInt();
            if (score >= 0 & score <= 100){
                arr[i] = score;
            }else {
                System.out.println("输入的成绩有误");
                i--;
            }

        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }

        int sum = 0;
        for (int j : arr) {
            sum += j;

        }

        System.out.println("平均数为" + ((sum-max-min) / 4));

    }
}
