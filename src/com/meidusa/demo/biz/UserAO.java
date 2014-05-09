package com.meidusa.demo.biz;

import com.meidusa.demo.dal.model.User;
import com.meidusa.demo.dal.model.UserExample;
import com.meidusa.toolkit.biz.common.AbstractAO;

public class UserAO extends AbstractAO<User, UserExample> {

	@Override
	protected UserExample doExample(String foreignKey) {
		UserExample example = new UserExample();
		if (foreignKey != null && !foreignKey.isEmpty()) {
			example.createCriteria().andCreatedbyloginidEqualTo(foreignKey);
		} else {
			example.createCriteria().andIdIsNotNull();
		}
		return example;
	}

	public boolean isLogin(String loginId, String password) {
		UserExample example = new UserExample();
		example.createCriteria().andPasswordEqualTo(password)
				.andLoginidEqualTo(loginId);
		int c = dao.countByExample(example);
		return c > 0 ? true : false;
	}

}
