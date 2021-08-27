package day18.xpath解析;
/*
 * @Author: Weiyang Jiang
 * @Date: 2021-08-26 11:01:36
 */

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class demo {
    public static void main(String[] args) throws DocumentException {
        SAXReader sr = new SAXReader();
        Document doc = sr.read("Weiyang/src/day18/xpath解析/books.xml");
        Element e1 = (Element) doc.selectSingleNode("/books/book/author");
        System.out.println(e1.getText());
        List<Element> l1 = doc.selectNodes("books/book/author");
        for (Element e : l1) {
            System.out.println(e.getText());
        }

        List<Element> l2 = doc.selectNodes("../author");
        for (Element e : l2) {
            System.out.println(e.getText());
        }
    }
}
