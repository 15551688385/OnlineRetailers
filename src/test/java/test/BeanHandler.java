package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BeanHandler extends DefaultHandler{
	private String eleName;
	private List<Map<String,Object>>list=new ArrayList();
	private Map<String,Object>map;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		eleName=qName;
		if(eleName.equals("employee")){
			map=new HashMap();
		}
		super.startElement(uri, localName, qName, attributes);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		if("name".equals(eleName));
		String name=new String(ch,start,length);
		map.put("name", name);
		if("age".equals(eleName));
		String age=new String(ch,start,length);
		map.put("age", age);
	}
	
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(eleName.equals("employee")){
			list.add(map);
		}
		
	}
	public List<Map<String,Object>>mylist(){
		return list;
	}
}
