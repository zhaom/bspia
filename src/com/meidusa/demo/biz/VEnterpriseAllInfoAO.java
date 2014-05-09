package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.VEnterpriseAllInfo;
import com.meidusa.demo.dal.model.VEnterpriseAllInfoExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class VEnterpriseAllInfoAO extends AbstractUploadAO<VEnterpriseAllInfo, VEnterpriseAllInfoExample> {

	@Override
	public Result doStatistic(VEnterpriseAllInfo model) {
		return null;
	}

	@Override
	protected VEnterpriseAllInfoExample doQueryExample(VEnterpriseAllInfo model) {
		log.debug("do query with complex conds");
		VEnterpriseAllInfoExample example = new VEnterpriseAllInfoExample();
		VEnterpriseAllInfoExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getName() != null && !model.getName().isEmpty()){
				criteria.andNameLike("%" + model.getName() + "%");
			}
			if(model.getBusinesstype() != null && !model.getBusinesstype().isEmpty()) {
				criteria.andBusinesstypeEqualTo(model.getBusinesstype());
			}
			if(model.getRequestlevel() != null && !model.getRequestlevel().isEmpty()){
				criteria.andRequestlevelEqualTo(model.getRequestlevel());
			}
		}
		
		return example;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		return null;
	}

	@Override
	protected VEnterpriseAllInfoExample doExample(String arg0) {
		log.debug("do query with simple conds-->" + arg0);
		VEnterpriseAllInfoExample example = new VEnterpriseAllInfoExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andNameLike("%"+ arg0 +"%");
		}
		return example;
	}

}
