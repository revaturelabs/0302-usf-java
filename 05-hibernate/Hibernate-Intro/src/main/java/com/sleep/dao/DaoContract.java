package com.sleep.dao;

public interface DaoContract<T> {

	T getById(int id);
	T save(T t);
	T findByName(String name);
}
