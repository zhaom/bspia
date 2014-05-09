package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.Notification;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class NotificationAction extends BaseAction<Notification, Cookie>
		implements Preparable, ModelDriven<Notification> {

	private static final long serialVersionUID = -3111319649269901404L;

	private Notification model;

	public void prepare() throws Exception {
		if (this.getRequestId() == null || this.getRequestId().isEmpty()) {
			System.out.println("enter prepare new");
			model = new Notification();
		} else {
			System.out.println("enter prepare else,requestId:"
					+ this.getRequestId());
			Result r = ao.doGet(getRequestId());
			model = (Notification) r.getDefaultModel();
		}
	}

	@Override
	public Notification getModel() {
		return model;
	}

	public String save(){
		System.out.println("enter notification save,model.getForeignKey():"+model.getForeignKey());
		return super.save();
	}
	
	public String getForeignKey() {
		System.out.println("enter super.getForeignKey():"
				+ super.getForeignKey());
		return  "1";
	}
	
	public String list(){
		this.setRequestId("1");
		return super.list();
	}

}
