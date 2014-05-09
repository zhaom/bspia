package com.meidusa.demo.web.action;

import java.util.Map;

import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.web.common.components.CheckCodeSession;
import com.meidusa.toolkit.web.common.components.CheckCodeSessionAware;
import com.meidusa.toolkit.web.cookie.ClientCookieAware;
import com.meidusa.toolkit.web.cookie.ClientCookieNotCare;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements
		ClientCookieAware<Cookie>, ClientCookieNotCare, CheckCodeSessionAware {

	private static final long serialVersionUID = -7238142655828508371L;

	private Cookie cookie;
	private CheckCodeSession checkCodeSession;
	
	public Cookie getCookie() {
		return cookie;
	}

	public void setClientCookie(Cookie cookie) {
		this.cookie = cookie;
	}
	
	public CheckCodeSession getCheckCodeSession() {
		return checkCodeSession;
	}

	public void setCheckCodeSession(CheckCodeSession checkCodeSession) {
		this.checkCodeSession = checkCodeSession;
	}

	
	public String execute() throws Exception {

		if (cookie != null) {
			cookie.clear();
			Map session = ActionContext.getContext().getSession();
			session.clear();
		}
		return INPUT;
	}
	
}
