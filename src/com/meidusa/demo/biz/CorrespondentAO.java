package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;

import com.meidusa.demo.dal.model.Correspondent;
import com.meidusa.demo.dal.model.CorrespondentExample;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class CorrespondentAO extends
		AbstractUploadAO<Correspondent, CorrespondentExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<Correspondent> list = new ArrayList<Correspondent>();
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
				if (item == null || item.size() != 22) {
					log
							.info("doMultiSaveFromList has values, but invalid value:"
									+ item.size());
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
					return result;
				} else {
					Correspondent eItem = new Correspondent();
					log.info("doMultiSaveFromList has values, valid value:"
							+ item);
					EnumerationExample eExample = new EnumerationExample();
					eExample.createCriteria().andEnumidIsNotNull();
					List<Enumeration> listEnum = this.getEnumerationDAO()
							.selectByExampleWithoutBLOBs(eExample);
					log.info("doMultiSaveFromList get enums:" + listEnum);


					eItem.setName(item.get(0));


					eItem.setGenderenumid("GENDER_TYPE_01");
					eItem.setPoliticalenumid("POLITIC_TYPE_01");
					eItem.setEducationenumid("EXPERT_EDU_03");
					eItem.setCardtypeenumid("EXPERT_CARDTYPE_01");
					eItem.setPublishenumid("NONE");
					eItem.setExcellentenumid("NONE");
					eItem.setExcellentyear("62");
					for (Enumeration e : listEnum) {
						if (e.getDescription().equals(item.get(1))) {
							eItem.setGenderenumid(e.getEnumid());
							eItem.setGenderdesc(e.getDescription());
						}
						if (e.getDescription().equals(item.get(6))) {
							eItem.setPoliticalenumid(e.getEnumid());
							eItem.setPoliticaldesc(e.getDescription());
						}
						if (e.getDescription().equals(item.get(4))) {
							eItem.setEducationenumid(e.getEnumid());
							eItem.setEducationdesc(e.getDescription());
						}
						if (e.getDescription().equals(item.get(19))) {
							eItem.setExcellentenumid(e.getEnumid());
							eItem.setExcellentdesc(e.getDescription());
						}
						if (e.getDescription().equals(item.get(20))) {
							eItem.setExcellentyear(e.getEnumid());
							eItem.setExcellentyeardesc(e.getDescription());
						}
						if (e.getDescription().equals(item.get(21))) {
							eItem.setPublishenumid(e.getEnumid());
							eItem.setPublishenumdesc(e.getDescription());
						}
					}
					eItem.setCardno(item.get(2));
					eItem.setNation(item.get(3));
					eItem.setMajor(item.get(5));
					eItem.setWorkplace(item.get(7));
					eItem.setPosition(item.get(8));
					eItem.setTitle(item.get(9));
					eItem.setWorkduring(item.get(10));
					eItem.setMobilephone(item.get(11));
					eItem.setTele(item.get(12));
					eItem.setEmail(item.get(13));
					eItem.setAddress(item.get(14));
					eItem.setZipcode(item.get(15));
					eItem.setResume(item.get(16));
					eItem.setPublishdesc(item.get(17));
					eItem.setRemark(item.get(18));
					
					CorrespondentExample example = new CorrespondentExample();
					example.createCriteria()
							.andCardnoEqualTo(eItem.getCardno());
					List<Correspondent> listCorrespondentOld = this.dao
							.selectByExampleWithBLOBs(example);

					if (listCorrespondentOld == null || listCorrespondentOld.size() < 1) {
						log.info("doMultiSaveFromList insert" + eItem);
						eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						this.dao.insert(eItem);
					} else {
						Correspondent oldExpert = listCorrespondentOld.get(0);
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
	protected CorrespondentExample doExample(String arg0) {
		CorrespondentExample example = new CorrespondentExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andNameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected CorrespondentExample doQueryExample(Correspondent model) {
		CorrespondentExample example = new CorrespondentExample();
		CorrespondentExample.Criteria c = example.createCriteria().andIdIsNotNull();
		if(model.getName() != null && !model.getName().isEmpty()){
			log.info("doQueryExample name:" + model.getName());
			c.andNameLike("%" + model.getName() + "%");
		}
		if(model.getWorkplace() != null && !model.getWorkplace().isEmpty()){
			log.info("doQueryExample Workplace:" + model.getWorkplace());
			c.andWorkplaceLike("%" + model.getWorkplace() + "%");
		}
		if(model.getExcellentenumid() != null && !model.getExcellentenumid().isEmpty()){
			log.info("doQueryExample Excellentenumid:" + model.getExcellentenumid());
			c.andExcellentenumidEqualTo(model.getExcellentenumid());
		}
		if(model.getExcellentyear() != null && !model.getExcellentyear().isEmpty()) {
			log.info("doQueryExample Excellentyear:" + model.getExcellentyear());
			c.andExcellentyearEqualTo(model.getExcellentyear());
		}
		if(model.getPublishenumid() != null && !model.getPublishenumid().isEmpty()){
			log.info("doQueryExample Publishenumid:" + model.getPublishenumid());
			c.andPublishenumidEqualTo(model.getPublishenumid());
		}
		return example;
	}

	public Result doStatistic(Correspondent model) {
		// TODO Auto-generated method stub
		return null;
	}

}
