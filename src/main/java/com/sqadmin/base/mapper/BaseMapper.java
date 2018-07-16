package com.sqadmin.base.mapper;

import com.sqadmin.base.entity.BaseEntity;

public interface BaseMapper<T extends BaseEntity> {
	public T findById(Integer id);
	public T findById(String id);
	
}
