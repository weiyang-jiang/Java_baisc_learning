package day03;

public class demo6_day03 {
    public static void main(String[] args){
        int count = 0;
        for (int i = 100; i <= 999; i++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10 % 10;
            double num = Math.pow(a,3) + Math.pow(b,3)+ Math.pow(c,3);

            if (num == i){
                System.out.print(num + " ");
                if (++count % 2 == 0){
                    System.out.println();
                }
            }
        }
    }
}
