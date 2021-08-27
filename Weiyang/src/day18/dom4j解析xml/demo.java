package day18.dom4j解析xml;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 10:36:09
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class demo {
    public static void main(String[] args) throws DocumentException {
        // 创建解析器对象
        SAXReader sr = new SAXReader();
        // 读取文件方法
        Document doc = sr.read("Weiyang/src/day18/dom4j解析xml/books.xml");
        // 获取根元素
        Element rootElement = doc.getRootElement();
        String name = rootElement.getName(); // 获取根元素的名字
        List<Element> elements = rootElement.elements(); // 获取根元素对应的子元素
        for (Element e : elements) {
            System.out.println(e.getName());
            System.out.println(e.attributeValue("id"));
            System.out.println(e.elementText("author"));
            for (Object e1 : e.elements()) {
                Element e2 = (Element) e1;
                System.out.println(e2.getName());

            }
            System.out.println("===========================");
        }

    }
}
