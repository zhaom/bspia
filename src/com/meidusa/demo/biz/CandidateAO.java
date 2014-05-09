package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.CandidatesExample;
import com.meidusa.demo.dal.model.CandidatesWithBLOBs;
import com.meidusa.toolkit.biz.common.result.Result;

public class CandidateAO extends
		AbstractUploadAO<CandidatesWithBLOBs, CandidatesExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected CandidatesExample doExample(String arg0) {
		CandidatesExample example = new CandidatesExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andNameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected CandidatesExample doQueryExample(CandidatesWithBLOBs model) {
		CandidatesExample example = new CandidatesExample();
		CandidatesExample.Criteria c = example.createCriteria().andIdIsNotNull();
		if(model != null && model.getWorkplace() != null && !model.getWorkplace().isEmpty()){
			c.andWorkplaceLike("%"+model.getWorkplace()+"%");
		}
		return example;
	}

	public Result doStatistic(CandidatesWithBLOBs model) {
		// TODO Auto-generated method stub
		return null;
	}

}
