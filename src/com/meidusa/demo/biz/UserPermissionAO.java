package com.meidusa.demo.biz;

import java.util.List;

import com.meidusa.demo.dal.model.UserPermission;
import com.meidusa.demo.dal.model.UserPermissionExample;
import com.meidusa.toolkit.biz.common.AbstractAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import com.meidusa.toolkit.web.page.Paging;

public class UserPermissionAO extends
		AbstractAO<UserPermission, UserPermissionExample> {

	@Override
	protected UserPermissionExample doExample(String paramString) {
		UserPermissionExample example = new UserPermissionExample();
		if (paramString != null && !paramString.isEmpty()) {
			example.createCriteria().andUseridEqualTo(paramString);
		}
		else{
			example.createCriteria().andIdIsNotNull();
		}
		return example;
	}
	

}
