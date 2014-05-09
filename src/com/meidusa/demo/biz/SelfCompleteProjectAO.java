package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.SelfCompleteProject;
import com.meidusa.demo.dal.model.SelfCompleteProjectExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class SelfCompleteProjectAO extends AbstractUploadAO<SelfCompleteProject, SelfCompleteProjectExample> {

	@Override
	public Result doStatistic(SelfCompleteProject model) {
		return null;
	}

	@Override
	protected SelfCompleteProjectExample doQueryExample(
			SelfCompleteProject model) {
		log.debug("do query with complex conds");
		SelfCompleteProjectExample example = new SelfCompleteProjectExample();
		SelfCompleteProjectExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getEnterprisename() != null && !model.getEnterprisename().isEmpty()){
				criteria.andEnterprisenameLike("%" + model.getEnterprisename() +"%");
			}
			if(model.getBusinesstype() != null && !model.getBusinesstype().isEmpty()){
				criteria.andBusinesstypeEqualTo(model.getBusinesstype());
			}
			if(model.getProjectname() != null && !model.getProjectname().isEmpty()){
				criteria.andProjectnameLike("%" + model.getProjectname() + "%");
			}
			if(model.getAcceptancecheckmethod() != null && !model.getAcceptancecheckmethod().isEmpty()){
				criteria.andAcceptancecheckmethodEqualTo(model.getAcceptancecheckmethod());
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
		
		List<SelfCompleteProject> list = new ArrayList<SelfCompleteProject>();
		
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 9) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					SelfCompleteProject selfCompleteProject = new SelfCompleteProject();
					selfCompleteProject.setEnterprisename(item.get(0));
					selfCompleteProject.setBusinesstype(item.get(1));
					selfCompleteProject.setProjectname(item.get(2));
					SelfCompleteProjectExample example = doQueryExample(selfCompleteProject);
					List<SelfCompleteProject> oldData = dao.selectByExampleWithoutBLOBs(example);
					if(oldData == null || oldData.isEmpty()){
						log.debug("new self complete proj");
					}else {
						log.debug("self complete proj exists already");
						selfCompleteProject = oldData.get(0);
					}
					selfCompleteProject.setContractno(item.get(3));
					selfCompleteProject.setProjectamount(item.get(4));
					selfCompleteProject.setProjectsize(item.get(5));
					selfCompleteProject.setCompletetime(item.get(6));
					selfCompleteProject.setAcceptancecheckmethod(item.get(7));
					selfCompleteProject.setProjectdata(item.get(8));
					if(selfCompleteProject.getId() == null || selfCompleteProject.getId().isEmpty()){
						selfCompleteProject.setId(GuidTool.generateGUID());
						dao.insert(selfCompleteProject);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(selfCompleteProject);
						log.debug("update success");
					}
					list.add(selfCompleteProject);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected SelfCompleteProjectExample doExample(String arg0) {
		log.debug("do list with simple condition--->requestid:="+arg0);
		SelfCompleteProjectExample example = new SelfCompleteProjectExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		}else {
			example.createCriteria().andEnterprisenameLike("%" + arg0 + "%");
		}
		return example;
	}

}
