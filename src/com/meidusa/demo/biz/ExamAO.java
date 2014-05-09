package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Examination;
import com.meidusa.demo.dal.model.ExaminationExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class ExamAO extends AbstractUploadAO<Examination, ExaminationExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ExaminationExample doExample(String arg0) {
		ExaminationExample example = new ExaminationExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
			example.setOrderByClause("lastupdatetimestamp desc");
		} else {
			example.createCriteria().andExamnameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected ExaminationExample doQueryExample(Examination model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Examination model) {
		// TODO Auto-generated method stub
		return null;
	}

}
