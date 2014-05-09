package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.EnterpriseInfoDAO;
import com.meidusa.demo.dal.model.EnterpriseInfo;
import com.meidusa.demo.dal.model.EnterpriseInfoExample;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.demo.dal.model.ExcellentSelectionExample;
import com.meidusa.demo.dal.model.ExcellentSelectionWithBLOBs;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class ExcellentSelectAO
		extends
		AbstractUploadAO<ExcellentSelectionWithBLOBs, ExcellentSelectionExample> {

	private EnterpriseInfoDAO enterpriseDAO;

	public EnterpriseInfoDAO getEnterpriseDAO() {
		return enterpriseDAO;
	}

	public void setEnterpriseDAO(EnterpriseInfoDAO enterpriseDAO) {
		this.enterpriseDAO = enterpriseDAO;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<ExcellentSelectionWithBLOBs> list = new ArrayList<ExcellentSelectionWithBLOBs>();
		log.info("do save or update,call doMultiSaveFromList");
		if (values == null || values.size() < 1) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
			return result;
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				log.info("doMultiSaveFromList has values");
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() != 23) {
					log
							.info("doMultiSaveFromList has values, but invalid value:"
									+ item.size());
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
					return result;
				} else {
					ExcellentSelectionWithBLOBs eItem = new ExcellentSelectionWithBLOBs();
					log.info("doMultiSaveFromList has values, valid value:"
							+ item);
					EnumerationExample eExample = new EnumerationExample();
					eExample.createCriteria().andEnumidIsNotNull();
					List<Enumeration> listEnum = this.getEnumerationDAO()
							.selectByExampleWithoutBLOBs(eExample);
					log.info("doMultiSaveFromList get enums:" + listEnum);

					eItem.setEnterprisename(item.get(0));

					EnterpriseInfoExample eiExample = new EnterpriseInfoExample();
					eiExample.createCriteria().andNameEqualTo(item.get(0));
					List<EnterpriseInfo> listEnterpriseInfoOld = this.enterpriseDAO
							.selectByExampleWithBLOBs(eiExample);
					if (listEnterpriseInfoOld == null
							|| listEnterpriseInfoOld.size() < 1) {
						log
								.info("doMultiSaveFromList enterprisename is valid,but now ignore this fault"
										+ item.get(0));
					} else {
						eItem.setEnterpriseid(listEnterpriseInfoOld.get(0)
								.getId());
					}

					eItem.setLegalrepresentative(item.get(1));
					eItem.setAddress(item.get(2));
					eItem.setRequestname(item.get(3));
					eItem.setRequestold(item.get(4));
					eItem.setPosition(item.get(5));
					eItem.setMajortitle(item.get(6));
					eItem.setSpworkduring(item.get(7));
					eItem.setMobilephone(item.get(9));
					eItem.setTele(item.get(10));
					eItem.setIntroduction(item.get(11));
					eItem.setRequestpublish(item.get(12));
					eItem.setWorkintroduction(item.get(13));
					eItem.setEnterpriseremark(item.get(14));
					eItem.setRequestlitigation(item.get(15));
					eItem.setOtherremark(item.get(16));
					eItem.setCheckreport(item.get(18));
					eItem.setScore(item.get(20));
					eItem.setSelectremark(item.get(21));

					eItem.setRequesttypeid("REQUEST_TYPE_01");
					eItem.setSelectresultenumid("SELECT_RESULT_00");
					eItem.setEducationenumid("EXPERT_EDU_03");
					
					Date d = new Date();
					
					eItem.setSelectyear(String.valueOf(d.getYear()));
					
					for (Enumeration e : listEnum) {
						if (e.getDescription().equals(item.get(17))) {
							eItem.setRequesttypeid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(19))) {
							eItem.setSelectresultenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(8))) {
							eItem.setEducationenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(22))) {
							eItem.setSelectyear(e.getEnumid());
						}
					}

					ExcellentSelectionExample example = new ExcellentSelectionExample();
					example.createCriteria().andEnterprisenameEqualTo(
							eItem.getEnterprisename()).andRequestnameEqualTo(
							eItem.getRequestname());
					List<ExcellentSelectionWithBLOBs> listExcellentSelectionOld = this.dao
							.selectByExampleWithBLOBs(example);

					if (listExcellentSelectionOld == null
							|| listExcellentSelectionOld.size() < 1) {
						log.info("doMultiSaveFromList insert" + eItem);
						eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						this.dao.insert(eItem);
					} else {
						ExcellentSelectionWithBLOBs oldExpert = listExcellentSelectionOld
								.get(0);
						eItem.setId(oldExpert.getId());
						log.info("doMultiSaveFromList update" + eItem.getId());
						this.dao.updateByPrimaryKeySelective(eItem);
					}
					list.add(eItem);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected ExcellentSelectionExample doExample(String arg0) {
		ExcellentSelectionExample example = new ExcellentSelectionExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andEnterprisenameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected ExcellentSelectionExample doQueryExample(
			ExcellentSelectionWithBLOBs model) {
		ExcellentSelectionExample example = new ExcellentSelectionExample();
		ExcellentSelectionExample.Criteria c = example.createCriteria().andIdIsNotNull();
		if(model.getSelectyear() != null && !model.getSelectyear().isEmpty()){
			c.andSelectyearEqualTo(model.getSelectyear());
		}
		if(model.getRequesttypeid() != null && !model.getRequesttypeid().isEmpty()){
			c.andRequesttypeidEqualTo(model.getRequesttypeid());
		}
		return example;
	}

	public Result doStatistic(ExcellentSelectionWithBLOBs model) {
		// TODO Auto-generated method stub
		return null;
	}

}
