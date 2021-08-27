package day18.xpath解析;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 11:13:01
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class demo1 {
    public static void main(String[] args) throws DocumentException {
        SAXReader sr = new SAXReader();
        Document doc = sr.read("Weiyang/src/day18/xpath解析/tianqi.xml");
        Element e1 = (Element) doc.selectSingleNode("//最低温度");
        /*
        ./表示在当前路径获取
        // 表示全局搜索
        ../ 表示在父路径获取

         */
        System.out.println(e1.getText());
        Node node = doc.selectSingleNode("//最高温度[@level='C'][1]/text()");
        System.out.println(node.getText());
    }
}
