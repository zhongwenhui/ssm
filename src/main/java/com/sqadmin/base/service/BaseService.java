package com.sqadmin.base.service;

public interface BaseService<T> {
	public T findById(Integer id);
	public T findById(String id);
}
