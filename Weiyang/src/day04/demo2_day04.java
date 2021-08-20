package day04;
import java.util.Scanner;
public class demo2_day04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数字");
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
