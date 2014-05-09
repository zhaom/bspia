package com.meidusa.demo.web.support;

import com.meidusa.toolkit.web.cookie.ClientCookie;

public class Cookie extends ClientCookie {

	private String loginId;
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
	@Override
	public String getLoginId() {
		return loginId;
	}

}
