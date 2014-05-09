package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.bcel.generic.ARRAYLENGTH;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.SelfEnterprise;
import com.meidusa.demo.dal.model.SelfEnterpriseExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class SelfEnterpriseAO extends AbstractUploadAO<SelfEnterprise, SelfEnterpriseExample> {

	@Override
	public Result doStatistic(SelfEnterprise model) {
		return null;
	}

	@Override
	protected SelfEnterpriseExample doQueryExample(SelfEnterprise model) {
		log.info("enter SelfEnterpriseAO.doQueryExample");
		SelfEnterpriseExample example = new SelfEnterpriseExample();
		SelfEnterpriseExample.Criteria criteria = example.createCriteria().andIdIsNotNull();
		if(model != null && model.getName() != null && !model.getName().isEmpty()){
			criteria.andNameLike("%" + model.getName() + "%");
		}
		if(model != null && model.getBusinesstype() != null && !model.getBusinesstype().isEmpty()){
			criteria.andBusinesstypeEqualTo(model.getBusinesstype());
		}
		return example;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		log.info("do save or update,call doMultiSaveFromList");
		List<SelfEnterprise> list = new ArrayList<SelfEnterprise>();
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 28) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					SelfEnterprise selfEnterprise = new SelfEnterprise();
					selfEnterprise.setBusinesstype(item.get(1));
					selfEnterprise.setName(item.get(2));
					SelfEnterpriseExample selfEnterpriseExample = doQueryExample(selfEnterprise);
					List<SelfEnterprise> oldData = dao.selectByExampleWithoutBLOBs(selfEnterpriseExample);
					if(oldData == null || oldData.isEmpty()){
						log.debug("new selfenterprise,so create new obj");
					}else {
						log.debug("has same name enterprise so just update");
						selfEnterprise = oldData.get(0);
					}
					selfEnterprise.setProvince(item.get(3));
					selfEnterprise.setCity(item.get(4));
					selfEnterprise.setRegaddr(item.get(5));
					selfEnterprise.setRegzipcode(item.get(6));
					selfEnterprise.setLinkaddr(item.get(7));
					selfEnterprise.setLinkzipcode(item.get(8));
					selfEnterprise.setMailbox(item.get(9));
					selfEnterprise.setRegtime(item.get(10));
					selfEnterprise.setLegalperson(item.get(11));
					selfEnterprise.setLegalpersoncardtypeenumid(item.get(12));
					selfEnterprise.setLegalpersoncardno(item.get(13));
					selfEnterprise.setLegalpersonposition(item.get(14));
					selfEnterprise.setContact(item.get(15));
					selfEnterprise.setContactcardno(item.get(16));
					selfEnterprise.setContactposition(item.get(17));
					selfEnterprise.setLinktel(item.get(18));
					selfEnterprise.setLinkfax(item.get(19));
					selfEnterprise.setLinkemail(item.get(20));
					selfEnterprise.setLinkwebsite(item.get(21));
					selfEnterprise.setBusinesslicense(item.get(22));
					selfEnterprise.setOrgcode(item.get(23));
					selfEnterprise.setRequestlevel(item.get(24));
					selfEnterprise.setRequestcode(item.get(25));
					selfEnterprise.setRequesttime(item.get(26));
					selfEnterprise.setEnterprisedesc(item.get(27));
					selfEnterprise.setLastupdatetime(new Date());
					if(selfEnterprise.getId() == null || selfEnterprise.getId().isEmpty()){
						selfEnterprise.setId(GuidTool.generateGUID());
						dao.insert(selfEnterprise);
						log.info("insert seccess");
					}else {
						dao.updateByPrimaryKeySelective(selfEnterprise);
						log.debug("update success");
					}
					list.add(selfEnterprise);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected SelfEnterpriseExample doExample(String arg0) {
		SelfEnterpriseExample example = new SelfEnterpriseExample();
		if(arg0 == null || arg0.isEmpty()){
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andNameLike("%" + arg0 + "%");
		}
		
		return example;
	}

}
