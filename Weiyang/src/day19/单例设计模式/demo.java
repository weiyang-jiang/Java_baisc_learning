package day19.单例设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-27 08:57:02
 */

public class demo {
    public static void main(String[] args) {
        // 保证一个类只有一个对象
        PersonSingle p1 = PersonSingle.getInstance(); // 这种方法只能访问一个单例
        PersonSingle p2 = PersonSingle.getInstance();
        PersonSingle p3 = PersonSingle.getInstance();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
