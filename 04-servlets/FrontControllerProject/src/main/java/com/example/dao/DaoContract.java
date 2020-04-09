package com.example.dao;

import java.util.List;

public interface DaoContract <T, I>{

	List<T> findAll();
	T findById(I i);
	T findByString(String s);
}
