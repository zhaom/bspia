package com.meidusa.demo.web.support;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.meidusa.demo.biz.support.BaseUploadAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.web.common.action.BaseAction;
import com.meidusa.toolkit.web.common.action.Constants;
import com.meidusa.toolkit.web.cookie.ClientCookie;

public abstract class BaseUploadAction<T, K extends ClientCookie> extends
		BaseAction<T, K> {

	public static Logger log = Logger.getLogger(BaseUploadAction.class);

	private File file;
	private String fileName;
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private String contentType;

	// protected BaseUploadAO<T> ao;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void setFileContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public String uploadByExcel() throws Exception {

		log.info("enter BaseUploadAtion.uploadByExcel(),file" + getFile());
		log.info("Objects,ao:" + this.ao + ",file" + getFile() + ",class:"
				+ this.ao.getClass().getName());

		Result result = ((BaseUploadAO<T>) this.ao).uploadByExcel(
				new FileInputStream(getFile()), this.ao.getClass().getName());
		if (result.isSuccess()) {
			this.list = ((List) result.getDefaultModel());
			return Constants.LIST;
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}


	@SkipValidation
	public String query() {
		log.info("enter BaseUploadAtion.query()");
		Result result = ((BaseUploadAO<T>) this.ao).doQuery(this.getModel(),
				this.paging);
		if (result.isSuccess()) {
			this.list = ((List) result.getDefaultModel());
			return "queryList";
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}
	
	@SkipValidation
	public String statistic() {
		log.info("enter BaseUploadAtion.statistic()");
		Result result = ((BaseUploadAO<T>) this.ao).doStatistic(this.getModel());
		if (result.isSuccess()) {
			this.list = ((List) result.getDefaultModel());
			return this.requestId;
		}
		ResultCode resultCode = result.getResultCode();
		addActionError(resultCode.getMessage().getMessage());
		return "error";
	}

}