package day19.多例设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 09:32:00
 */

public class demo {
    public static void main(String[] args) {
        PersonMany p1 = PersonMany.getInstance();
        PersonMany p2 = PersonMany.getInstance();
        PersonMany p3 = PersonMany.getInstance();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
