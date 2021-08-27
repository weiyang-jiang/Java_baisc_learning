package day18.正则表达式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 16:16:31
 */

public class demo_数量词 {
    public static void main(String[] args) {
        /*
        1. X?: 0次或者1次
        2. X*: 0次到多次
        3. X+: 1次或者多次
        4. X{n}：恰好n次
        5. X{n,}至少n次（包含n)
        6. X{n,m} n到m次。
         */
        String str = "258";
        boolean matches1 = str.matches("[0-9]{3}");
        boolean matches2 = str.matches("\\d{3}");
        str.matches("\\d+");
        str.matches("\\d?");
        str.matches("\\d*");
        System.out.println(matches1);
        System.out.println(matches2);

        String str2 = "FJGCP-4DFJD-GJY49-VJBQ0-HYRR2";
        boolean matches = str2.matches("([0-9A-Z]{5}-){4}[0-9A-Z]{5}");
        System.out.println(matches);

        String str3 = "safffe12344ew123ad3";
        String s = str3.replaceAll("\\d+", "*");
        String[] split1 = str3.split("\\d+");
        for (String s1 : split1) {
            System.out.println(s1);
        }
        System.out.println(s);

    }
}
