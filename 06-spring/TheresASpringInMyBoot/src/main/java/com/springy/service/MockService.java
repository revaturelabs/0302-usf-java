package com.springy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springy.dao.MockDao;
import com.springy.model.User;


/**
 * 
 * @author Revature
 *
 *	Stereotypes are annotations that tell spring that the class
 *		that they are above will be a spring bean, there is a 
 *		hierarchy to stereotypes.
 *	@Component is the grandfather of all stereotypes
 *		the various children are:
 *			@Service		denotes a service class
 *			@Controller		denotes a controller class
 *			@Repository		denotes a dao class
 *			@Configuration	denotes a configuration class
 *			@RestController	the same as controller, but denotes that
 *								it is for a RESTful api
 *
 *
 */
@Service("service")
@Scope("prototype")
public class MockService {

//	@Autowired
	MockDao md;
	
	public List<User> getAll(){
		return md.getAllUsers();
	}

	public MockDao getMd() {
		return md;
	}
	
	@Autowired
	public void setMd(MockDao md) {
		this.md=md;
		System.out.println("inside the setter");
	}
	
	public MockService() {
		super();
		System.out.println("mock service is being instantiated");
	}
	
//	@Autowired
	public MockService(MockDao md) {
		super();
		this.md=md;
		System.out.println("all args constructor called");
	}
}
