package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Business;
import com.meidusa.demo.dal.model.BusinessExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class BusinessAO extends AbstractUploadAO<Business, BusinessExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BusinessExample doExample(String arg0) {
		BusinessExample example = new BusinessExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected BusinessExample doQueryExample(Business model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Business model) {
		// TODO Auto-generated method stub
		return null;
	}

}
