package com.sqadmin.base.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sqadmin.base.entity.BaseEntity;
import com.sqadmin.base.mapper.BaseMapper;

public abstract class BaseDao<T extends BaseEntity> extends SqlSessionDaoSupport{
	public abstract BaseMapper<T> getBaseMapper();
	
	public T findById(Integer id) {
		return this.getBaseMapper().findById(id);
	}
	
	public T findById(String id) {
		return this.getBaseMapper().findById(id);
	}
	
}
