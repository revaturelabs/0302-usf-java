package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Boot;

/**
 * 
 * @author Revature
 * 
 * This is CrudRepository, apart of Spring Data. It has a lot of
 * 		built in methods, and a naming convention for you to make 
 * 		more methods to fit your app.
 *
 */
public interface BootDaoContract extends CrudRepository<Boot, Integer>{

	Boot findById(int id);
}
