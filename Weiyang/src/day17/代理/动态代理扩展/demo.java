package day17.代理.动态代理扩展;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-25 16:22:25
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("bac");
        list.add("acb");

        System.out.println(list);

        List<String> proxy = (List<String>) Proxy.newProxyInstance(ArrayList.class.getClassLoader(), ArrayList.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = method.invoke(list, args);
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    if (next.equals(args[0])) {
                        iterator.remove();
                    }
                }
                return res;
            }
        });
        proxy.remove("abc");
        /*
        这里面的执行顺序是：
        1. 首先调用代理去执行任务，代理会调用invoke方法。
        2. 给代理传入了需要使用的方法remove，还有参数args=“abc”
        3. method.invoke(list, args)会去执行一次这个方法
        4. 接下来写的是增强的代码，增加一个迭代器，让整个数组遍历看看哪一个字符串含有abc，就删除哪一个。

         */
        System.out.println(list);
    }
}
