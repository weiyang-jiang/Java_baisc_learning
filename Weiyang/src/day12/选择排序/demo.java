package day12.选择排序;

import java.util.Arrays;

public class demo {
    // 在数组中依次选择一个值与数组中其他值做比较，放在合适的位置上替换一个数值
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 10};
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                System.out.println(Arrays.toString(arr));
            }

        }

        for (int i = 0; i < arr.length - 1 ; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] < arr[j]){
                    min = j;

                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
