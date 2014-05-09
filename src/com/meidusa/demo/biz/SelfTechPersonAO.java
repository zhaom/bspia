package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.SelfTechPerson;
import com.meidusa.demo.dal.model.SelfTechPersonExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class SelfTechPersonAO extends AbstractUploadAO<SelfTechPerson,SelfTechPersonExample>{

	@Override
	public Result doStatistic(SelfTechPerson model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected SelfTechPersonExample doQueryExample(SelfTechPerson model) {
		log.debug("do query with complex conds");
		SelfTechPersonExample example = new SelfTechPersonExample();
		SelfTechPersonExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
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
		
		List<SelfTechPerson> list = new ArrayList<SelfTechPerson>();
		
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
					SelfTechPerson selfTechPerson = new SelfTechPerson();
					selfTechPerson.setEnterprisename(item.get(0));
					selfTechPerson.setBusinesstype(item.get(1));
					selfTechPerson.setPersonname(item.get(2));
					SelfTechPersonExample example = doQueryExample(selfTechPerson);
					List<SelfTechPerson> oldData = dao.selectByExampleWithoutBLOBs(example);
					if(oldData == null || oldData.isEmpty()){
						log.debug("new self tech person");
					}else {
						log.debug("self tech person exists already");
						selfTechPerson = oldData.get(0);
					}
					selfTechPerson.setPersonsex(item.get(3));
					selfTechPerson.setPosition(item.get(4));
					selfTechPerson.setTechnicaltitle(item.get(5));
					selfTechPerson.setBirthdate(item.get(6));
					selfTechPerson.setIdcardno(item.get(7));
					selfTechPerson.setSecurityno(item.get(8));
					selfTechPerson.setTechexamcer(item.get(9));
					selfTechPerson.setRemark(item.get(10));
					if(selfTechPerson.getId() == null || selfTechPerson.getId().isEmpty()){
						selfTechPerson.setId(GuidTool.generateGUID());
						dao.insert(selfTechPerson);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(selfTechPerson);
						log.debug("update success");
					}
					list.add(selfTechPerson);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected SelfTechPersonExample doExample(String arg0) {
		SelfTechPersonExample example = new SelfTechPersonExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		}else {
			example.createCriteria().andEnterprisenameLike("%" + arg0 + "%");
		}
		return example;
	}

}
