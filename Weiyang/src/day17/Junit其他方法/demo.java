package day17.Junit其他方法;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 17:01:38
 */

import org.junit.*;

public class demo {
    public static void main(String[] args) {

    }
    @Test
    public void method1(){
        System.out.println("method1");
    }

    @Before // 这个修饰表示会在测试方法执行之前执行这个方法
    public void b1(){
        System.out.println("b1");
    }

    @After // 这个修饰表示会在测试方法执行之后执行这个方法
    public void A1(){
        System.out.println("A1");
    }

    @BeforeClass // 这个方法修饰静态方法，会最先执行。
    public static void bc(){
        System.out.println("bc");
    }

    @AfterClass // 这个方法修饰静态方法，会最后执行。
    public static void ac(){
        System.out.println("ac");
    }
}
