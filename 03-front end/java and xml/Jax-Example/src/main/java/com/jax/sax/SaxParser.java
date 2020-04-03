package com.jax.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/**
 * 
 * @author Revature
 *
 *	sax stands for simple api for xml
 *		It will treat the xml as a stream of characters and
 *			react to the events associated with it. For this,
 *			it needs an event handler.
 */
public class SaxParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();
		XMLReader xr = sp.getXMLReader();
		xr.setContentHandler(new MyEventHandler());
		xr.parse("src/main/xml/cats.xml");
	}
	
}
