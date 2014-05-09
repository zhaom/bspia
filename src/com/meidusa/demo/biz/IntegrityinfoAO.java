package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.IntegrityInfo;
import com.meidusa.demo.dal.model.IntegrityInfoExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class IntegrityinfoAO extends
		AbstractUploadAO<IntegrityInfo, IntegrityInfoExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IntegrityInfoExample doExample(String arg0) {
		IntegrityInfoExample example = new IntegrityInfoExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected IntegrityInfoExample doQueryExample(IntegrityInfo model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(IntegrityInfo model) {
		// TODO Auto-generated method stub
		return null;
	}

}
