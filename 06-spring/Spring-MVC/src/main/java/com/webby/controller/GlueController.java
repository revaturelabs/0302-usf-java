package com.webby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webby.model.Glue;
import com.webby.service.GlueService;

@Controller
public class GlueController {

	@Autowired
	private GlueService gs;

	//request mapping will tell spring mvc what methods and urls are mapped to the method
	//	you can also put it above the class to have a unique url go to the entire class before
	//	going to the methods.
	@RequestMapping(method = RequestMethod.GET, value = "/all.app")
	//response entity is a type that lets you build an entire http response
	public ResponseEntity<List<Glue>> findAll() {
		return new ResponseEntity<List<Glue>>(gs.getAll(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/glue.app")
	public ResponseEntity<Glue> save(@RequestBody Glue g) {
		return new ResponseEntity<Glue>(gs.save(g), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value="/update.app")
	public ResponseEntity<Glue> update(@RequestBody Glue g) {
		return new ResponseEntity<Glue>(gs.update(g), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}/delete.app")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		gs.deleteById(id);
		return new ResponseEntity<String>("good job, now deleted",HttpStatus.OK);
	}
	
	//instead of request mapping annotation, we have individual request mapping annotations,
	//	GetMapping, PostMapping, etc.
	@GetMapping("/{id}/findid.app")
	//instead of having to build an entire response entity, we can use the response
	//	body annotation to just put the json inside the body of the response.
	public @ResponseBody Glue findById(@PathVariable("id") int id) {
		return gs.findById(id);
	}
	
}
