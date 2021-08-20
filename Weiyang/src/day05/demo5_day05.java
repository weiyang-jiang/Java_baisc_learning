package day05;

public class demo5_day05 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55};
        int array_1 = max_array(arr);
        System.out.println(array_1);
    }

    public static int max_array(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
