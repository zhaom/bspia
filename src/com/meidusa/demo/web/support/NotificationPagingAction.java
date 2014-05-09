package com.meidusa.demo.web.support;

import com.meidusa.demo.biz.NotificationAO;
import com.meidusa.toolkit.biz.common.BaseAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.PagingAction;

public class NotificationPagingAction extends PagingAction<Cookie> {

	private BaseAO<?> ao;

	public void setAo(BaseAO<?> ao) {
		this.ao = ao;
	}

	public String execute() {
		Result result = this.ao.doPaging(this.getRows(), "1");
		if (!(result.isSuccess())) {
			ResultCode resultCode = result.getResultCode();
			addActionError(resultCode.getMessage().getMessage());
			return "error";
		}
		this.setTotalPage(((Integer) result.getModels().get("totalPage"))
				.intValue());
		this.setTotalRecord(((Integer) result.getModels().get("totalRecord"))
				.intValue());
		return "success";
	}
}
