package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.HighQualityProject;
import com.meidusa.demo.dal.model.HighQualityProjectExample;
import com.meidusa.demo.dal.model.ProjectStand;
import com.meidusa.demo.dal.model.ProjectStandExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class HighQualityProjectAO extends AbstractUploadAO<HighQualityProject, HighQualityProjectExample> {

	@Override
	public Result doStatistic(HighQualityProject model) {
		return null;
	}

	@Override
	protected HighQualityProjectExample doQueryExample(HighQualityProject model) {
		HighQualityProjectExample example = new HighQualityProjectExample();
		HighQualityProjectExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getEnterprisename() != null && !model.getEnterprisename().isEmpty()){
				criteria.andEnterprisenameLike("%"+model.getEnterprisename()+"%");
			}
			if(model.getProjectname() != null && !model.getProjectname().isEmpty()){
				criteria.andProjectnameLike("%"+model.getProjectname()+"%");
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
		
		List<HighQualityProject> list = new ArrayList<HighQualityProject>();
		
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 8) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					
					HighQualityProject highQualityProject = new HighQualityProject();
					highQualityProject.setEnterprisename(item.get(0));
					highQualityProject.setProjectname(item.get(4));
					
					HighQualityProjectExample example = doQueryExample(highQualityProject);
					
					List<HighQualityProject> oldData = dao.selectByExampleWithBLOBs(example);
					if(oldData == null || oldData.size() < 1){
						log.debug("new high Quality Project");	
					}else {
						log.debug("high Quality Project already exists");
						highQualityProject = oldData.get(0);
					}
					
					highQualityProject.setEnterprisename(item.get(0));
					highQualityProject.setProjectname(item.get(4));
					highQualityProject.setLinkman(item.get(1));
					highQualityProject.setLinktel(item.get(2));
					highQualityProject.setGettitleyear(item.get(3));
					highQualityProject.setConstructorg(item.get(5));
					highQualityProject.setProjectamount(item.get(6));
					highQualityProject.setRisklevel(item.get(7));

					
					if(highQualityProject.getId() == null || highQualityProject.getId().isEmpty()){
						highQualityProject.setId(GuidTool.generateGUID());
						dao.insert(highQualityProject);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(highQualityProject);
						log.debug("update success");
					}
					list.add(highQualityProject);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected HighQualityProjectExample doExample(String arg0) {
		HighQualityProjectExample highQualityProjectExample = new HighQualityProjectExample();
		if(arg0 != null && !arg0.isEmpty()){
			highQualityProjectExample.createCriteria().andProjectnameLike("%"+arg0+"%");
		}else {
			highQualityProjectExample.createCriteria().andIdIsNotNull();
		}
		return highQualityProjectExample;
	}

}
