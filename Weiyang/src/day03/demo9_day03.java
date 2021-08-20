package day03;
import java.util.Scanner;
public class demo9_day03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        while (true){
            int num = sc.nextInt();
            if (num > 100 || num < 0 ){
                System.out.println("请重新输入：");
            }else {
                System.out.println("NICE");
                System.out.println("请输入：");
            }
        }
    }
}
