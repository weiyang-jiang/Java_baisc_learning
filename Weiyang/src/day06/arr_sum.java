package day06;

public class arr_sum {
    public static void main(String[] args) {
        int [] arr1 = {11, 22, 33};
        int [] arr2 = {22, 33, 44};
        int [] arr3 = {33, 44, 55};

        int [][] arr = {arr1, arr2, arr3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                sum += arr[i][i1];
            }
        }
        System.out.println(sum);
    }
}
