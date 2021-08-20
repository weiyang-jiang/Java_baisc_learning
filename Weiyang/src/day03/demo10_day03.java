package day03;
import java.util.Scanner;
public class demo10_day03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        while (true){
            int num = sc.nextInt();
            if (num == 1){
                System.out.println("周一");
                break;
            }else if(num == 2){
                System.out.println("周二");
                break;
            }else if(num == 3){
                System.out.println("周三");
                break;
            }else if(num == 4){
                System.out.println("周四");
                break;
            }else if(num == 5){
                System.out.println("周五");
                break;
            }else{
                System.out.println("输入有误");
                System.out.println("请输入：");
            }
        }
    }
}
