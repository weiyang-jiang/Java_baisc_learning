package day05;

public class demo2_day05 {
    public static void main(String[] args) {
        int n = 20;
        int m = 11;
        odd_print(n, m);
    }



    public static void odd_print(int n, int m) {

        for (int i = Math.min(n,m); i <= Math.max(n,m); i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }


        }
    }
}
