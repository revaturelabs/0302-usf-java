package com.jax.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author Revature
 *
 *	what does jax stand for?
 *		java api for xml
 *	what does jaxp stand for?
 *		java api for xml processing
 *	there are 2 ways to use jaxp
 *		one is with dom
 *			document object model
 *		the other is with sax
 *			simple api for xml
 */
public class DomParser {
	
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("src/main/xml/cats.xml"));
		NodeList node = doc.getElementsByTagName("cat");
		
		for(int i = 0; i<node.getLength(); i++) {
			Element e = (Element) node.item(i);
			
			System.out.println(e.getChildNodes()
					.item(5).getFirstChild().getNodeValue());
		}
		
		
		
		
		
		
	}

}
