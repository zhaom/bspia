package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.Post;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class PostAction extends BaseAction<Post, Cookie> implements Preparable, ModelDriven<Post>{

	private Post model;
	
	@Override
	public Post getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if(getRequestId()==null || getRequestId().isEmpty()){
			model = new Post();
		}else{
			Result result = ao.doGet(getRequestId());
			model = (Post)result.getDefaultModel();
		}
	}
	
	public String list(){
		setRequestId(getCookie().getLoginId());
		return super.list();
	}
}
