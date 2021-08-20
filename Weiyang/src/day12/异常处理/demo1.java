package day12.异常处理;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            System.out.println("start");
            sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(1/0);
            System.out.println(s);

        }catch (Exception e){

            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }finally {
            sc.close();
            System.out.println("close");
        }
    }
}
