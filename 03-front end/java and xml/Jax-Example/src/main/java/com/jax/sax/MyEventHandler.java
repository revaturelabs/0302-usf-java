package com.jax.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyEventHandler extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
		System.out.println("begin document");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Element "+uri+localName+qName+attributes);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("Characters: "+new String(ch)+start+length);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("end element");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("end document");
	}
}
