package com.meidusa.demo.biz;

import com.meidusa.demo.dal.model.Notification;
import com.meidusa.demo.dal.model.NotificationExample;
import com.meidusa.toolkit.biz.common.AbstractAO;

public class NotificationAO extends
		AbstractAO<Notification, NotificationExample> {

	@Override
	protected NotificationExample doExample(String arg0) {
		NotificationExample example = new NotificationExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andStatusEqualTo(arg0);
		}
		return example;
	}

}
