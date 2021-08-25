package day17.注解.自定义注解;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-24 22:35:54
 */

import java.lang.reflect.Method;

public class demo {
    @MyAnnotation2 // 此注解没有属性，所以可以直接放上去
    public static void main(String[] args) throws NoSuchMethodException {
        Class<demo> c1 = demo.class;
        Method m1 = c1.getDeclaredMethod("method1");
        MyAnnotation1 a1 = m1.getAnnotation(MyAnnotation1.class); // 方法得到注解里面属性值
        System.out.println(a1.num());
        System.out.println(a1.str());

    }
    // 当注解属性只有一个时，属性名是value，那么给注解赋值得到时候，注解属性名可以省略
    // 当属性类型为一维数组，而且数组得到值只有一个时可以省略
    @MyAnnotation1(str = "name", num = 10) // 有属性就需要赋值
    public void method1(){

    }

     // 元注解： @Retention 定义该注解保留到哪一个代码阶段。


}
