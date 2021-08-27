package day18.正则表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 15:59:46
 */

public class demo_逻辑运算符 {
    public static void main(String[] args) {
        String str = "Nad";
        // 必须同时满足&&, |是或者的意思
        boolean matches1 = str.matches("[a-z&&[^aeiou]]ad");
        System.out.println(matches1);

    }
}
