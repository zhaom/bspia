package com.meidusa.demo.web.action;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.meidusa.demo.biz.UserAO;
import com.meidusa.demo.biz.UserPermissionAO;
import com.meidusa.demo.dal.model.User;
import com.meidusa.demo.dal.model.UserPermission;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.Constants;
import com.meidusa.toolkit.web.common.components.CheckCodeSession;
import com.meidusa.toolkit.web.common.components.CheckCodeSessionAware;
import com.meidusa.toolkit.web.cookie.ClientCookieAware;
import com.meidusa.toolkit.web.cookie.ClientCookieNotCare;
import com.meidusa.toolkit.web.page.Paging;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements
		ClientCookieAware<Cookie>, ClientCookieNotCare, CheckCodeSessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5937079003000559886L;

	Logger log = Logger.getLogger(LoginAction.class);

	private Cookie cookie;
	private String loginId;
	private String password;
	private CheckCodeSession checkCodeSession;
	private String checkcode;



	protected UserAO ao;
	protected UserPermissionAO pao;
	

	public UserAO getAo() {
		return ao;
	}

	public void setAo(UserAO ao) {
		this.ao = ao;
	}

	public UserPermissionAO getPao() {
		return pao;
	}

	public void setPao(UserPermissionAO pao) {
		this.pao = pao;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Cookie getCookie() {
		return cookie;
	}

	public void setClientCookie(Cookie cookie) {
		this.cookie = cookie;
	}


	
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {

		if (ao.isLogin(loginId, password)) {
			//cookie.setLoginId(loginId);
			//cookie.save();
			List ul = (List) ao.doList(null, new Paging()).getDefaultModel();
			if (ul != null && ul.size() > 0) {
				for (int i = 0, j = ul.size(); i < j; i++) {
					if (loginId.equals(((User) ul.get(i)).getLoginid())) {
						Map session = ActionContext.getContext().getSession();
						session.put("loginUser", ul.get(i));
						
						List upl = (List) pao.doList(loginId, new Paging()).getDefaultModel();
						
						if (upl != null && upl.size() > 0) {
							
							for(int k = 0,l = upl.size(); k < l;k++){
								UserPermission up = (UserPermission)upl.get(k);
								session.put(up.getPermissionid(),up.getRemark());
							}
						}
						break;
					}
				}
			}
			return SUCCESS;
		}
		return INPUT;

	}
	

	

	public CheckCodeSession getCheckCodeSession() {
		return checkCodeSession;
	}

	public void setCheckCodeSession(CheckCodeSession checkCodeSession) {
		this.checkCodeSession = checkCodeSession;
	}
}
