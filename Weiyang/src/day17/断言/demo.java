package day17.断言;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:13:01
 */

import org.junit.Assert;
import org.junit.Test;

public class demo {
    public static void main(String[] args) {

    }

    @Test
    public void method1(){
        int sum = getsum(10,20);
        Assert.assertEquals(30, sum);
        // 可以用来测试此功能是不是成功实现了
    }

    public int getsum(int a, int b){
        return a+b;
    }
}
