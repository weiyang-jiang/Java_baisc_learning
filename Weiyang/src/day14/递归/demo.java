package day14.递归;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-20 23:38:56
 */

public class demo {
    static int count = 0;
    static int sum = 0;
    public static void main(String[] args) {
        // 递归一定要有出口， 否则会有栈内存溢出
        // 递归的次数有限制，取决于电脑栈内存大小
        System.out.println(method(10));
    }
    public static int method(int n){
        if (n == 0){
            return sum;
        }
        sum += n;
        n --;
        method(n);
        return sum;
    }
}
