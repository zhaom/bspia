package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.InstallEmployee;
import com.meidusa.demo.dal.model.InstallEmployeeExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class InstallEmployeeAO extends AbstractUploadAO<InstallEmployee, InstallEmployeeExample> {

	@Override
	public Result doStatistic(InstallEmployee model) {
		return null;
	}

	@Override
	protected InstallEmployeeExample doQueryExample(InstallEmployee model) {
		log.debug("installEmployee.doQueryExample()");
		InstallEmployeeExample employeeExample = new InstallEmployeeExample();
		InstallEmployeeExample.Criteria criteria = employeeExample.createCriteria().andIdIsNotNull();
		if(model != null){
			if(model.getEnterprisename() != null && !model.getEnterprisename().isEmpty()){
				criteria.andEnterprisenameLike("%"+model.getEnterprisename()+"%");
			}
			if(model.getPersonname() != null && !model.getPersonname().isEmpty()){
				criteria.andPersonnameLike("%"+model.getPersonname()+"%");
			}
			
		}
		return employeeExample;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		log.info("do save or update,call doMultiSaveFromList");
		
		List<InstallEmployee> list = new ArrayList<InstallEmployee>();
		
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 19) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					InstallEmployee installEmployee = new InstallEmployee();
					InstallEmployeeExample example = doExample(item.get(9));
					List<InstallEmployee> oldData = dao.selectByExampleWithoutBLOBs(example);
					if(oldData == null || oldData.isEmpty()){
						log.debug("new install employee");
					}else {
						log.debug("install employee exists already");
						installEmployee = oldData.get(0);
					}
					installEmployee.setTechtitle(item.get(1));
					installEmployee.setTechtitlelevel(item.get(2));
					installEmployee.setPersonname(item.get(3));
					installEmployee.setPersonsex(item.get(4));
					installEmployee.setPersonnation(item.get(6));
					installEmployee.setPersondegree(item.get(7));
					installEmployee.setPolitice(item.get(8));
					installEmployee.setIdcardno(item.get(9));
					installEmployee.setEnterprisename(item.get(10));
					installEmployee.setEnterpriseaddr(item.get(11));
					installEmployee.setEnterprisezipcode(item.get(12));
					installEmployee.setTel(item.get(13));
					installEmployee.setTheoryscore(item.get(14));
					installEmployee.setOperationscore(item.get(15));
					installEmployee.setWholescore(item.get(16));
					installEmployee.setCerno(item.get(17));
					installEmployee.setCergettime(item.get(18));
					
					if(installEmployee.getId() == null || installEmployee.getId().isEmpty()){
						installEmployee.setId(GuidTool.generateGUID());
						dao.insert(installEmployee);
						log.debug("insert success");
					} else {
						dao.updateByPrimaryKeySelective(installEmployee);
						log.debug("update success");
					}
					list.add(installEmployee);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected InstallEmployeeExample doExample(String arg0) {
		log.debug("installEmployee.doExample()");
		InstallEmployeeExample employeeExample = new InstallEmployeeExample();
		if (arg0 == null || arg0.isEmpty()) {
			employeeExample.createCriteria().andIdcardnoIsNotNull();
		}else {
			employeeExample.createCriteria().andIdcardnoEqualTo(arg0);
		}
		return employeeExample;
	}

}
