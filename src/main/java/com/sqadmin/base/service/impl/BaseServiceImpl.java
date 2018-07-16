package com.sqadmin.base.service.impl;

import com.sqadmin.base.entity.BaseEntity;
import com.sqadmin.base.service.BaseService;

public class BaseServiceImpl implements BaseService<BaseEntity>{


	@Override
	public BaseEntity findById(Integer id) {
		BaseEntity entity = new BaseEntity();
		entity.setCreator("Integer");
		return entity;
	}

	@Override
	public BaseEntity findById(String id) {
		BaseEntity entity = new BaseEntity();
		entity.setCreator("String");
		return entity;
	}

}
