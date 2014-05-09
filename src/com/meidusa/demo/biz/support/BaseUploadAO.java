package com.meidusa.demo.biz.support;

import java.io.InputStream;

import com.meidusa.toolkit.biz.common.BaseAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.page.Paging;

public interface BaseUploadAO<T> extends BaseAO<T> {

	public abstract Result uploadByExcel(InputStream inputStream,
			String paramString);

	public abstract Result doQuery(T model, Paging paging);

	public abstract Result doStatistic(T model);
}
