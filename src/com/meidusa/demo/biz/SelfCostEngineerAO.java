package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.SelfCostEngineer;
import com.meidusa.demo.dal.model.SelfCostEngineerExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class SelfCostEngineerAO extends AbstractUploadAO<SelfCostEngineer,SelfCostEngineerExample>{

	@Override
	public Result doStatistic(SelfCostEngineer model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected SelfCostEngineerExample doQueryExample(SelfCostEngineer model) {
		log.debug("do query with complex conds");
		SelfCostEngineerExample example = new SelfCostEngineerExample();
		SelfCostEngineerExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getEnterprisename() != null && !model.getEnterprisename().isEmpty()){
				criteria.andEnterprisenameLike("%" + model.getEnterprisename() +"%");
			}
			if(model.getBusinesstype() != null && !model.getBusinesstype().isEmpty()){
				criteria.andBusinesstypeEqualTo(model.getBusinesstype());
			}
			if(model.getPersonname() != null && !model.getPersonname().isEmpty()){
				criteria.andPersonnameLike("%" + model.getPersonname() + "%");
			}
		}
		return example;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		log.info("do save or update,call doMultiSaveFromList");
		
		List<SelfCostEngineer> list = new ArrayList<SelfCostEngineer>();
		
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 11) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					SelfCostEngineer selfCostEngineer = new SelfCostEngineer();
					selfCostEngineer.setEnterprisename(item.get(0));
					selfCostEngineer.setBusinesstype(item.get(1));
					selfCostEngineer.setPersonname(item.get(2));
					SelfCostEngineerExample example = doQueryExample(selfCostEngineer);
					List<SelfCostEngineer> oldData = dao.selectByExampleWithoutBLOBs(example);
					if(oldData == null || oldData.isEmpty()){
						log.debug("new self tech person");
					}else {
						log.debug("self tech person exists already");
						selfCostEngineer = oldData.get(0);
					}
					selfCostEngineer.setPersonsex(item.get(3));
					selfCostEngineer.setPosition(item.get(4));
					selfCostEngineer.setTechnicaltitle(item.get(5));
					selfCostEngineer.setBirthdate(item.get(6));
					selfCostEngineer.setCostengineercer(item.get(7));
					selfCostEngineer.setIdcardno(item.get(8));
					selfCostEngineer.setSecurityno(item.get(9));
					selfCostEngineer.setRemark(item.get(10));
					if(selfCostEngineer.getId() == null || selfCostEngineer.getId().isEmpty()){
						selfCostEngineer.setId(GuidTool.generateGUID());
						dao.insert(selfCostEngineer);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(selfCostEngineer);
						log.debug("update success");
					}
					list.add(selfCostEngineer);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected SelfCostEngineerExample doExample(String arg0) {
		SelfCostEngineerExample example = new SelfCostEngineerExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		}else {
			example.createCriteria().andEnterprisenameLike("%" + arg0 + "%");
		}
		return example;
	}

}
