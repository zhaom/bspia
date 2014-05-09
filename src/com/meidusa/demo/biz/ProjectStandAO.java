package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.InstallEmployee;
import com.meidusa.demo.dal.model.ProjectStand;
import com.meidusa.demo.dal.model.ProjectStandExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class ProjectStandAO extends AbstractUploadAO<ProjectStand, ProjectStandExample>  {

	@Override
	public Result doStatistic(ProjectStand model) {
		return null;
	}

	@Override
	protected ProjectStandExample doQueryExample(ProjectStand model) {
		ProjectStandExample projectStandExample = new ProjectStandExample();
		ProjectStandExample.Criteria criteria = projectStandExample.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getEnterprisename() != null && !model.getEnterprisename().isEmpty()){
				criteria.andEnterprisenameLike("%"+model.getEnterprisename()+"%");
			}
			if(model.getProjectname() != null && !model.getProjectname().isEmpty()){
				criteria.andProjectnameLike("%"+model.getProjectname()+"%");
			}
		}
		return projectStandExample;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		log.info("do save or update,call doMultiSaveFromList");
		
		List<ProjectStand> list = new ArrayList<ProjectStand>();
		
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
					
					ProjectStand projectStand = new ProjectStand();
					projectStand.setEnterprisename(item.get(0));
					projectStand.setProjectname(item.get(1));
					
					ProjectStandExample example = doQueryExample(projectStand);
					
					List<ProjectStand> oldData = dao.selectByExampleWithBLOBs(example);
					if(oldData == null || oldData.size() < 1){
						log.debug("new project stand");	
					}else {
						log.debug("project stand already exists");
						projectStand = oldData.get(0);
					}
					
					projectStand.setEnterprisename(item.get(0));
					projectStand.setProjectname(item.get(1));
					projectStand.setProjectsize(item.get(2));
					projectStand.setCompletetime(item.get(3));
					projectStand.setContractamount(item.get(4));
					projectStand.setSpamount(item.get(5));
					projectStand.setSystemos(item.get(6));
					projectStand.setApplydomain(item.get(7));
					projectStand.setSppercent(item.get(8));
					projectStand.setRemark(item.get(9));
					projectStand.setCameracount(item.get(10));
					
					if(projectStand.getId() == null || projectStand.getId().isEmpty()){
						projectStand.setId(GuidTool.generateGUID());
						dao.insert(projectStand);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(projectStand);
						log.debug("update success");
					}
					list.add(projectStand);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected ProjectStandExample doExample(String arg0) {
		ProjectStandExample projectStandExample = new ProjectStandExample();
		if(arg0 != null && !arg0.isEmpty()){
			projectStandExample.createCriteria().andEnterprisenameLike("%"+arg0+"%");
		}else {
			projectStandExample.createCriteria().andIdIsNotNull();
		}
		return projectStandExample;
	}

}
