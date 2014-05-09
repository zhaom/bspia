package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Project;
import com.meidusa.demo.dal.model.ProjectExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class ProjectAO extends AbstractUploadAO<Project, ProjectExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ProjectExample doExample(String arg0) {
		ProjectExample example = new ProjectExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		}else{
			example.createCriteria().andNameLike("%"+arg0+"%");
		}
		return example;
	}

	@Override
	protected ProjectExample doQueryExample(Project model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Project model) {
		// TODO Auto-generated method stub
		return null;
	}

}
