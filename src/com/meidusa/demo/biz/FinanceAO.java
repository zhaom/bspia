package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Finance;
import com.meidusa.demo.dal.model.FinanceExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class FinanceAO extends AbstractUploadAO<Finance, FinanceExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected FinanceExample doExample(String arg0) {
		FinanceExample example = new FinanceExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected FinanceExample doQueryExample(Finance model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Finance model) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
