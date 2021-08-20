package day11.可变参数;

public class Demo1 {
    // 如果定义一个方法需要多个参数， 并且多个参数的类型一致，可以使用可变参数进行简化
    /*
    一个方法只能有一个可变参数，
    如果方法中有多个可变参数，可变参数要放到最后面
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5};
        method1(arr1);
        method1(1, 2, 4);
    }
    // 可以接受多个int参数, 也可以接收数组
    public static void method1(int... nums){
        System.out.println(nums[2]);
    }
}
