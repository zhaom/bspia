package com.meidusa.demo.biz.support;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.meidusa.demo.dal.EnumerationDAO;
import com.meidusa.toolkit.biz.common.AbstractAO;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import com.meidusa.toolkit.dal.ibator.AbstractModel;
import com.meidusa.toolkit.web.page.Paging;

public abstract class AbstractUploadAO<T extends AbstractModel, K extends AbstractExample<? extends AbstractExample.Criteria>>
		extends AbstractAO<T, K> implements BaseUploadAO<T> {

	public static Logger log = Logger.getLogger(AbstractUploadAO.class);

	private EnumerationDAO enumerationDAO;

	public EnumerationDAO getEnumerationDAO() {
		return enumerationDAO;
	}

	public void setEnumerationDAO(EnumerationDAO enumerationDAO) {
		this.enumerationDAO = enumerationDAO;
	}

	public Result uploadByExcel(InputStream inputStream, String paramString) {
		log.info("enter AbstractUploadAO.uploadByExcel(),paramString:"
				+ paramString);
		Result result = new ResultSupport();
		result.setSuccess(false);
		Map<String, List<String>> excelData = null;
		try {
			excelData = ExcelParser.parse(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
			return result;
		}

		if (excelData != null) {
			Collection<List<String>> valueCollection = excelData.values();
			return doMultiSaveFromList(valueCollection, paramString);

		}
		result.setSuccess(true);
		return result;
	}

	@SuppressWarnings("unchecked")
	public Result doQuery(T model, Paging paging) {
		log.info("enter AbstractUploadAO.doQuery(),model:" + model);

		Result result = new ResultSupport();
		result.setSuccess(false);

		AbstractExample example = doQueryExample(model);

		if (paging.getRows() != 0) {
			example.setOffset(paging.getOffset());
			example.setRows(paging.getRows());
		}
		List list = this.dao.selectByExampleWithBLOBs((K) example);
		log.info("in AbstractUploadAO.doQuery(),after call dao method selectByExampleWithoutBLOBs list:" + list);
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	protected abstract K doQueryExample(T model);

	protected abstract Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString);

}
