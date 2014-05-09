package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Litigation;
import com.meidusa.demo.dal.model.LitigationExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class LitigationAO extends
		AbstractUploadAO<Litigation, LitigationExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected LitigationExample doExample(String arg0) {
		LitigationExample example = new LitigationExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected LitigationExample doQueryExample(Litigation model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Litigation model) {
		// TODO Auto-generated method stub
		return null;
	}

}
