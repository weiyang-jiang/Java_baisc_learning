package day15.Commands_io工具包;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-23 10:00:47
 */

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        /*
        apache开源基金组织
         */
        final FileOutputStream fileOutputStream = new FileOutputStream("Weiyang/src/day15/Commands_io工具包/copy.png");
        final FileInputStream fileInputStream = new FileInputStream("Weiyang/src/day15/Commands_io工具包/1.png");
        IOUtils.copy(fileInputStream, fileOutputStream); //拷贝文件，适合2GB以下的。
        fileOutputStream.close();
        fileInputStream.close();
    }
}
