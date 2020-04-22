package com.webby.dao;

import java.util.List;

public interface DaoContract <T,I>{

	List<T> findAll();
	T findById(I id);
	void save(T t);
	void update(T t);
	void deleteById(I id);
	void delete(T t);
}
