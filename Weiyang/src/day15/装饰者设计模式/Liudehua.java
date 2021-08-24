package day15.装饰者设计模式;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 09:44:13
 */

public class Liudehua implements Star{
    @Override
    public void sing() {
        System.out.println("忘情水");
    }

    @Override
    public void dance() {
        System.out.println("刘德华在跳舞");
    }
}
