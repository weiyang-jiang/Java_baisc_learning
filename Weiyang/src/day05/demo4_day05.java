package day05;

public class demo4_day05 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        print_arr(arr);
    }

    public static void print_arr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i>=arr.length - 1){
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }


    }
}
