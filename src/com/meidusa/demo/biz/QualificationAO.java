package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Qualification;
import com.meidusa.demo.dal.model.QualificationExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class QualificationAO extends
		AbstractUploadAO<Qualification, QualificationExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected QualificationExample doExample(String arg0) {
		QualificationExample example = new QualificationExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected QualificationExample doQueryExample(Qualification model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Qualification model) {
		// TODO Auto-generated method stub
		return null;
	}

}
