package day15.字符缓冲流;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 18:20:26
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Weiyang/src/day15/字符缓冲流/b.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            arr.add(line);
        }
        bufferedReader.close();
        Collections.sort(arr, (a, b)->{return Integer.valueOf(a.split("\\.")[0]).intValue() - Integer.valueOf(b.split("\\.")[0]).intValue();});
        System.out.println(arr);
    }
}
