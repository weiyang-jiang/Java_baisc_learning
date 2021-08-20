package day12.二分查找;

public class demo {

    public static void main(String[] args) {
        int[] arr = {23, 37, 45, 50, 52, 56};

        int index = method1(56, arr);
        System.out.println(index);


    }
    public static int method1(int num, int [] arr){

        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;
        int index = 0;
        outer:
        while (true){

            if (num < arr[mid]){
                mid = (start + mid)/2;
                end = mid;

            }else if (num > arr[mid]){
                mid = (mid + end)/2;
                start = mid;

            }else {
                index = mid;
                break outer;
            }
            if (end <= start){
                index = mid;
                break outer;
            }
        }
        return index;
    }

}

