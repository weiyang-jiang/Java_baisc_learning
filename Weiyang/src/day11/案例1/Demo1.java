package day11.案例1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c, 1);
            }
        }

        System.out.println(map);



    }
}
