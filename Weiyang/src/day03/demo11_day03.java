package day03;
import java.util.Random;
import java.util.Scanner;
public class demo11_day03 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100);


        while (true){
            System.out.println("请输入你要猜测的数字");
            int guess = sc.nextInt();
            if (guess == num){
                System.out.println("恭喜你猜对了！！！");
                break;
            }else if(guess < num){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }

        }
    }
}
