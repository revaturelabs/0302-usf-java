package com.webby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webby.model.Glue;
import com.webby.service.GlueService;

@Controller
public class GlueController {

	@Autowired
	private GlueService gs;
	
	@RequestMapping(method = RequestMethod.GET, value = "/all.app")
	public ResponseEntity<List<Glue>> findAll(){
		return new ResponseEntity<List<Glue>>(gs.getAll(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/glue.app")
	public ResponseEntity<Glue> save(@RequestBody Glue g){
		return new ResponseEntity<Glue>(gs.save(g), HttpStatus.OK);
	}
}
