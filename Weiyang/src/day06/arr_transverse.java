package day06;

public class arr_transverse {


    public static <end> void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int start = 0; start < end; start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            System.out.println("--");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        }
    }



