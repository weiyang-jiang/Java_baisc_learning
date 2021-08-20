package day11.双列集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        // Map集合的概述：
        /*
        所有双列集合的顶层父接口
        双列集合是按照键值对进行存储的，就像Python的字典
        键不能重复，重复会覆盖
        Map：
        HashMap类：键唯一， 键值对存取无顺序
        LinkedHashMap类：键唯一， 键值对存取有序，由哈希表保证键值对唯一， 由链表保证键值对存取有序
        TreeMap类：可以对键值对进行排序
         */

        Map<String, String> map = new HashMap<>();

        map.put("yyds", "asd");
        map.put("sad", "aasdsd");
        map.put("ww", "asdwe");
        map.put("yygdgds", "asdhh");

        map.remove("ww"); // 删除某个键值对，返回删除键值对的值

        String s = map.get("sad"); // 取值

        map.containsKey("yyds"); // 返回是否含有key
        map.containsValue("yyds"); //返回是否含有value
        map.size(); // map尺寸

        Set<String> s1 = map.keySet(); // 获取map集合中所有的键添加进去

        Collection<String> values = map.values(); // 获取所有的值
        System.out.println(values);

        Set<Map.Entry<String, String>> map1 = map.entrySet(); // 把键值对存到set集合里面
        System.out.println(map1);

        for (Map.Entry<String, String> s2 : map1) {
            System.out.println(s2.getKey());
        }

        for (String s2 : s1) {
            System.out.println(map.get(s2));
        }
    }
}
