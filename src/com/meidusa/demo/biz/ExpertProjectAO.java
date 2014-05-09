package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.ExpertProjectExample;
import com.meidusa.demo.dal.model.ExpertProjectWithBLOBs;
import com.meidusa.toolkit.biz.common.result.Result;

public class ExpertProjectAO extends
		AbstractUploadAO<ExpertProjectWithBLOBs, ExpertProjectExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ExpertProjectExample doExample(String arg0) {
		ExpertProjectExample example = new ExpertProjectExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterpriseidEqualTo(arg0);
			example.or(example.createCriteria().andNameLike("%"+arg0+"%"));
		}
		return example;
	}

	@Override
	protected ExpertProjectExample doQueryExample(ExpertProjectWithBLOBs model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(ExpertProjectWithBLOBs model) {
		// TODO Auto-generated method stub
		return null;
	}

}
