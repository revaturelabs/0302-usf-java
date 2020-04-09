package com.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.example.model.Clown;
import com.example.service.ClownService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.util.Pool.Unmarshaller;

public class ClownController {

	private ClownService cs;

	public ClownController() {
		cs = new ClownService();
	}

	public void getById(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("clownId"));
		Clown c = cs.findById(id);
		// this is how to take an object and turn it into json
//		try {
//			
//			res.getWriter()
//				.write(
//						new ObjectMapper()
//							.writeValueAsString(c));
//			
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// this is how to take an object and turn it into xml

		try {

			JAXBContext jbc = JAXBContext.newInstance(Clown.class);
			Marshaller marsh = jbc.createMarshaller();
			marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marsh.marshal(c, res.getWriter());

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//this is how to take the json out of the body of the request and make it into an object
//		try {
//			Clown c1 = new ObjectMapper().readValue(req.getReader(), Clown.class);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
