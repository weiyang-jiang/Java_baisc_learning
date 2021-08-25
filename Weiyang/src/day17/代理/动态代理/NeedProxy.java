package day17.代理.动态代理;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 14:28:54
 */

public class NeedProxy implements Happy{
    @Override
    public void happy() {
        System.out.println("happy自己");
    }
}
