package test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class DomXml {
public static void main(String[] args) throws Exception{
	String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<employees>\n" +
            "<employee email=\"zzzlyr@163.com\">\n" +
            "<name>李明</name>\n" +
            "<sex>女孩子</sex>\n" +
            "<age>30</age>\n" +
            "</employee>\n" +
            "<employee email=\"zzzlyr112@163.com\">\n" +
            "<name>张钊钊</name>\n" +
            "<sex>男</sex>\n" +
            "<age>28</age>\n" +
            "</employee>\n" +
            "</employees>";
	InputStream in=new ByteArrayInputStream(xml.getBytes());
	StringReader sr=new StringReader(xml);
	InputSource is=new InputSource(sr);
	DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
	DocumentBuilder db=dbf.newDocumentBuilder();
	Document d=db.parse(in);
	Element e=d.getDocumentElement();
	NodeList nl=e.getChildNodes();
	//NodeList nl=e.getElementsByTagName("employees");
	for(int i=0;i<nl.getLength();i++){
		Node no=nl.item(i);
		
		System.out.println(no.getAttributes().getNamedItem("name"));
	}
	
}
}
