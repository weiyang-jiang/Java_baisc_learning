package day12.冒泡排序;

import java.util.Arrays;

public class demo1 {
    /*
    将相邻的数据进行两两比较，将比较大的数据放到后面，小的放在前面。
     */
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 3, 2, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
