package test;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

public class SaxXml {
public static void main(String[] args)throws Exception {
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
	SAXParserFactory spf=SAXParserFactory.newInstance();
	SAXParser sp=spf.newSAXParser();
	XMLReader xr=sp.getXMLReader();
	BeanHandler bh=new BeanHandler();
	xr.setContentHandler(bh);
	StringReader sr=new StringReader(xml);
	InputSource input=new InputSource(sr);
	xr.parse(input);
	List<Map<String,Object>>mylist=bh.mylist();
	System.out.println(mylist);
}
}
