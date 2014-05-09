package com.meidusa.demo.biz;

import com.meidusa.demo.dal.model.Training;
import com.meidusa.demo.dal.model.TrainingExample;
import com.meidusa.toolkit.biz.common.AbstractAO;

public class TrainingAO extends AbstractAO<Training, TrainingExample> {

	@Override
	protected TrainingExample doExample(String arg0) {
		TrainingExample example = new TrainingExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
			example.setOrderByClause("lastupdatetimestamp desc");
		} else {
			example.createCriteria().andTrainnameLike("%" + arg0 + "%");
		}
		return example;
	}

}
