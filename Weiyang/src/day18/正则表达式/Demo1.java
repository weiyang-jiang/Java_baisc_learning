package day18.正则表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 15:21:56
 */

public class Demo1 {
    public static void main(String[] args) {
        String str = "ead";
        // 验证str是否以h开头，以d结尾，中间是aeiou中某一个字母
        boolean matches1 = str.matches("h[aeiou]d");
        // 验证str是否以h开头，以d结尾，中间不是aeiou中某一个字母
        boolean matches2 = str.matches("h[^aeiou]d");
        // 验证str是否是a-z的任何一个小写字符开头
        boolean matches3 = str.matches("[a-z]ad");
        // 验证str是否以a-d或者m-p之间某个字符开头，后面跟ad。
        boolean matches4 = str.matches("[a-dm-p]ad");



    }
}
