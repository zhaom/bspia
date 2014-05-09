package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.User;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class User2Action extends BaseAction<User, Cookie> implements Preparable,
		ModelDriven<User> {
	private User model;

	@Override
	public User getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new User();
		} else {
			Result r = ao.doGet(this.getRequestId());
			model = (User) r.getDefaultModel();
		}

	}
	public String initPassword() {
		System.out.println("enter userAction.initPassword(),model:"+model.getId()+":"+model.getLoginid()+":"+model.getCreatedbyloginid());
		model.setPassword(model.getLoginid());
		Result result = this.ao.doSave(model, model.getCreatedbyloginid());
		if (result.isSuccess()) {
			System.out.println("success");
			return Constants.BROWSE;
		}
		System.out.println("error");
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}
}
