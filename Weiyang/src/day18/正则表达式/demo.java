package day18.正则表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 15:05:29
 */

public class demo {
    public static void main(String[] args) {

    }

    public static boolean checkQQ(String strQ){
        if (strQ == null){
            return false;
        }
        if (strQ.length() < 5 || strQ.length() > 15){
            return false;
        }

        for (int i = 0; i < strQ.length(); i++) {
            char c = strQ.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }

        if (strQ.startsWith("0")){
            return false;
        }

        return true;
    }
    public static boolean checkQQ2(String strQ){
        strQ.matches("[1-9]\\d{4,14}"); //返回布尔类型，看是否匹配元素

        return true;
    }
}
