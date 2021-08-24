package day15.装饰者设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 09:51:19
 */

public class Liudehua_plus implements Star{
    Liudehua ldh;

    public Liudehua_plus(Liudehua ldh) {
        this.ldh = ldh;
    }

    @Override
    public void sing() {
        // 增强
        System.out.println("刘德华在鸟巢");
    }

    @Override
    public void dance() {
        ldh.dance();
    }
}
