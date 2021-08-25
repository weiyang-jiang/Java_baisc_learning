package day17.Junit框架包;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 16:20:45
 */

import org.junit.Test;

public class demo {
    public static void main(String[] args) {
        /*
        主要用来做单元测试
         */

    }
    @Test // 里面可以写入测试代码
    public void method(){
        // 测试代码必须是公共的无参数，无返回值的方法。
        System.out.println("method");
    }
}
