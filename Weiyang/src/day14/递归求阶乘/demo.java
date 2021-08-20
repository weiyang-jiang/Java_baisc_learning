package day14.递归求阶乘;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-21 00:20:31
 */

public class demo {
    static int re = 1;
    public static void main(String[] args) {
        System.out.println(method(3));
    }

    public static int method(int n){
        if (n == 1){
            return re;
        }
        re = re * n;
        method(n-1);
        return re;
    }
}
