package day15.properties操作配置文件;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-22 13:33:45
 */

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo {
    public static void main(String[] args) throws IOException {
        /*
        读取配置文件中的数据
        1. 往配置文件中写入数据
        2. 读取配置文件的数据
         */
        Properties pro = new Properties();

        FileReader fileReader = new FileReader("Weiyang/src/day15/properties操作配置文件/a.txt");

        FileWriter fileWriter = new FileWriter("Weiyang/src/day15/properties操作配置文件/b.txt");

        pro.load(fileReader);

        pro.store(fileWriter, "name");

        System.out.println(pro);

    }
}
