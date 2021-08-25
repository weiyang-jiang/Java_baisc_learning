package day17.代理.动态代理;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 13:55:32
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class demo {
    // 动态代理并不存在，直接得到一个代理对象，代理对象存在的类直接生成
    // 静态代理是实际存在的
    public static void main(String[] args) {
        NeedProxy Np = new NeedProxy();
        // 这里需要传入被代理类的类加载器和所有类接口， 最后还需要代理的方法
        Happy proxy = (Happy) Proxy.newProxyInstance(NeedProxy.class.getClassLoader(), NeedProxy.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("happy代理");
                method.invoke(Np);
                return null;
            }
        });
        proxy.happy();
    }
}
