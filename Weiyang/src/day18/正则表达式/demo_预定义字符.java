package day18.正则表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 16:08:27
 */

public class demo_预定义字符 {
    public static void main(String[] args) {
        String str = "456";
        // \d表示【0-9】
        // .可以匹配任意字符
        // \s, 匹配空白字符
        // \w [0-9a-zA-Z]
        boolean matches = str.matches("\\d\\d\\d");

    }
}
