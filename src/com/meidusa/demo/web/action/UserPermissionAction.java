package com.meidusa.demo.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.meidusa.demo.dal.model.UserPermission;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UserPermissionAction extends BaseAction<UserPermission, Cookie>
		implements Preparable, ModelDriven<UserPermission> {

	Logger log = Logger.getLogger(UserPermissionAction.class);
	
	private UserPermission model;

	public void prepare() throws Exception {
		if (this.getRequestId() == null || this.getRequestId().isEmpty()) {
			model = new UserPermission();
		} else {
			Result r = ao.doGet(getRequestId());
			model = (UserPermission) r.getDefaultModel();
		}
	}
	
	
	@Override
	public UserPermission getModel() {
		return model;
	}

	public String getForeignKey() {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (request.getParameter("userId") != null)
			return request.getParameter("userId");

		else
			return super.getForeignKey();
	}
	
}
