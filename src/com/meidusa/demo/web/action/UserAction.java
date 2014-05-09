package com.meidusa.demo.web.action;

import java.util.Map;

import com.meidusa.demo.dal.model.User;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UserAction extends BaseAction<User, Cookie> implements Preparable,
		ModelDriven<User> {
	
	private String newPassword;
	private String confirmPassword;
	private String oldPassword;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
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


	
	
	public String resetPassword() {
		if (newPassword.equals(confirmPassword)) {
			Map session = ActionContext.getContext().getSession();
			User model = (User) session.get("loginUser");
			if (model.getPassword().equals(oldPassword)) {
				model.setPassword(newPassword);
				this.ao.doSave(model, model.getCreatedbyloginid());
				session.put("loginUser", model);
				this.setRequestId(model.getId());
				return Constants.SHOW;
			}
		}
		return "error";
	}
	
	public String list() {
		this.setRequestId(null);
		return super.list();
	}

}
