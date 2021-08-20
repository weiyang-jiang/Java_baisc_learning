package day05;

public class demo1_day05 {
    public static void main(String[] args) {
        int num = 10;
        method_odd(num);
    }

    public static void method_odd(int num){

        if (num%2 == 0){
            System.out.println("此数字为偶数");
        }else {
            System.out.println("此数字为奇数");
        }

    }
}
