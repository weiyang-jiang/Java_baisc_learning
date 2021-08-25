package day17.注解.Mytest案例;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 13:24:23
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<demo> demoClass = demo.class;
        demo demo1 = new demo();
        Method[] declaredMethods = demoClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            boolean annotationPresent = declaredMethod.isAnnotationPresent(MyTest.class); // 是否存在MyTest注解。
            if (annotationPresent){
                declaredMethod.invoke(demo1);
            }
        }
    }

    @MyTest
    public void show1(){
        System.out.println("show1");
    }

    @MyTest
    public void show2(){
        System.out.println("show2");
    }

    public void show3(){
        System.out.println("show2");
    }
}
