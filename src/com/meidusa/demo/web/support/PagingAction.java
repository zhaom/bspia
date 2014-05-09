package com.meidusa.demo.web.support;

import com.meidusa.toolkit.biz.common.BaseAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;

public class PagingAction extends
		com.meidusa.toolkit.web.common.action.PagingAction<Cookie> {

	private BaseAO<?> ao;

	private String requestId;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setAo(BaseAO<?> ao) {
		this.ao = ao;
	}

	public String execute() {
		Result result = this.ao.doPaging(this.getRows(), this.getRequestId());
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
