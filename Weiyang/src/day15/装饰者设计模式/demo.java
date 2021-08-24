package day15.装饰者设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 09:40:26
 */

public class demo {
    public static void main(String[] args) {
        /*
        装饰模式是指在不改变原类的基础上， 不使用继承得到基础上，动态扩展一个对象的功能.
         */
        Liudehua ldh = new Liudehua();
        ldh.dance();
        ldh.sing();

        Liudehua_plus ldh_plus = new Liudehua_plus(ldh);
        ldh_plus.dance();
        ldh_plus.sing();
    }
}
