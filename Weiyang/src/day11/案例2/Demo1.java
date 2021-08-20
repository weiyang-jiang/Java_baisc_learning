package day11.案例2;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        // 1. 组装54张扑克牌
                /*
        1. 造牌
        2. 洗牌
        3. 发牌
         */
        TreeMap<Integer, String> poker_map = new TreeMap<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"红桃","黑桃","梅花", "方片");
        ArrayList<String> nums = new ArrayList<>();
        Collections.addAll(nums ,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int id = 0;
        poker_map.put(id++, "大王");
        poker_map.put(id++, "小王");
        for (String num : nums) {
            for (String color : colors) {
                poker_map.put(id++, color + num);
            }

        }
        System.out.println(poker_map);


        ArrayList<Integer> integer = new ArrayList<>();
        integer.addAll(poker_map.keySet());
        Collections.shuffle(integer);

        TreeMap<Integer, String> gamer1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        TreeMap<Integer, String> gamer2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        TreeMap<Integer, String> gamer3 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });


        for (int i = 0; i < integer.size(); i++) {
            if (i % 3 == 0){
                gamer1.put(integer.get(i), poker_map.get(integer.get(i)));
            }else if (i % 3 == 1){
                gamer2.put(integer.get(i), poker_map.get(integer.get(i)));
            }else {
                gamer3.put(integer.get(i), poker_map.get(integer.get(i)));
            }

        }

        System.out.println(gamer1.values());
        System.out.println(gamer2.values());
        System.out.println(gamer3.values());

    }
}
