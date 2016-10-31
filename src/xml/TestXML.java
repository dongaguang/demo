package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 解析XML
 * @author Administrator
 *
 */
public class TestXML {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		File f = new File("D:\\haha.xml");
		Document d = db.parse(f);
		Element e = d.getDocumentElement();
		System.out.println(e.getTextContent());
		NodeList sf = e.getChildNodes();
		for(int i = 0; i < sf.getLength(); i++){
			Node s = sf.item(i);
			System.out.println(s.getTextContent());
		}
	}
}
