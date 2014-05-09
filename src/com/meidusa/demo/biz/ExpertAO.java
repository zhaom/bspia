package com.meidusa.demo.biz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.demo.dal.model.Expert;
import com.meidusa.demo.dal.model.ExpertExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class ExpertAO extends AbstractUploadAO<Expert, ExpertExample> {

	public static Logger log = Logger.getLogger(ExpertAO.class);

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<Expert> list = new ArrayList<Expert>();
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
				if (item == null || item.size() != 40) {
					log
							.info("doMultiSaveFromList has values, but invalid value:"
									+ item.size());
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
					return result;
				} else {
					Expert eItem = new Expert();
					log.info("doMultiSaveFromList has values, valid value:"
							+ item);
					EnumerationExample eExample = new EnumerationExample();
					eExample.createCriteria().andEnumidIsNotNull();
					List<Enumeration> listEnum = this.getEnumerationDAO()
							.selectByExampleWithoutBLOBs(eExample);
					log.info("doMultiSaveFromList get enums:" + listEnum);

					SimpleDateFormat sdf = new SimpleDateFormat();

					eItem.setName(item.get(0));

					try {
						eItem.setBirthday(sdf.parse(item.get(1)));
					} catch (Exception e) {
						e.printStackTrace();
					}

					eItem.setGenderenumid("GENDER_TYPE_01");
					eItem.setPoliticalenumid("POLITIC_TYPE_01");
					eItem.setEducationenumid("EXPERT_EDU_03");
					eItem.setCardtypeenumid("EXPERT_CARDTYPE_01");
					eItem.setRetirementenumid("EXPERT_RETIRE_01");
					eItem.setMajordirectenumid("MAJOR_DIRECT_01");
					for (Enumeration e : listEnum) {
						if (e.getDescription().equals(item.get(2))) {
							eItem.setGenderenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(3))) {
							eItem.setPoliticalenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(4))) {
							eItem.setEducationenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(12))) {
							eItem.setCardtypeenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(19))) {
							eItem.setRetirementenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(24))) {
							eItem.setMajordirectenumid(e.getEnumid());
						}
					}

					eItem.setMajor(item.get(5));
					eItem.setUniversity(item.get(6));
					eItem.setPosition(item.get(7));
					eItem.setTitle(item.get(8));
					eItem.setMobilephone(item.get(9));
					eItem.setTele(item.get(10));
					eItem.setWorkplace(item.get(11));
					eItem.setCardno(item.get(13));
					eItem.setEmail(item.get(14));
					eItem.setContact(item.get(15));
					eItem.setAddress(item.get(16));
					eItem.setHomeaddress(item.get(17));
					eItem.setZipcode(item.get(18));
					eItem.setProfessionalbound(item.get(20));
					eItem.setResume(item.get(21));
					eItem.setWorkduring(item.get(22));
					eItem.setMajorworkduring(item.get(23));
					eItem.setParttimejob(item.get(25));
					eItem
							.setWorkcaplitystrategy(item.get(26).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitypolicy(item.get(27).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitymarket(item.get(28).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplityconstruct(item.get(29).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplityquality(item.get(30).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitysupervision(item.get(31).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitycost(item.get(32).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplityprojend(item.get(33).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplityprojesta(item.get(34).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitystandard(item.get(35).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitytrademark(item.get(36).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplityrisk(item.get(37).equals("") ? "unchecked"
									: "checked");
					eItem
							.setWorkcaplitydataanalys(item.get(38).equals("") ? "unchecked"
									: "checked");
					eItem.setWorkcaplityothers(item.get(39));

					ExpertExample example = new ExpertExample();
					example.createCriteria()
							.andCardnoEqualTo(eItem.getCardno());
					List<Expert> listExpertOld = this.dao
							.selectByExampleWithBLOBs(example);

					if (listExpertOld == null || listExpertOld.size() < 1) {
						log.info("doMultiSaveFromList insert" + eItem);
						eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						this.dao.insert(eItem);
					} else {
						Expert oldExpert = listExpertOld.get(0);
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
	protected ExpertExample doExample(String arg0) {
		ExpertExample example = new ExpertExample();
		if (arg0 == null || arg0.isEmpty()) {
			log.debug("expert doExample with no params.");
			example.createCriteria().andIdIsNotNull();
		} else {
			log.debug("expert doExample with name");
			example.createCriteria().andNameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected ExpertExample doQueryExample(Expert model) {
		ExpertExample example = new ExpertExample();
		ExpertExample.Criteria c = example.createCriteria().andIdIsNotNull();
		if(model.getMajordirectenumid() != null && !model.getMajordirectenumid().isEmpty()){
			c.andMajordirectenumidEqualTo(model.getMajordirectenumid());
		}
		if(model.getRetirementenumid() != null && !model.getRetirementenumid().isEmpty()){
			c.andRetirementenumidEqualTo(model.getRetirementenumid());
		}
		if(model.getGenderenumid() != null && !model.getGenderenumid().isEmpty()){
			c.andGenderenumidEqualTo(model.getGenderenumid());
		}
		if(model.getWorkduring() != null && !model.getWorkduring().isEmpty()){
			Date now1 = new Date();
			Date now2 = new Date();
			if("OLD_1".equals(model.getWorkduring())){
				now1.setYear(now1.getYear()-41);
				c.andBirthdayGreaterThan(now1);
			}
			if("OLD_2".equals(model.getWorkduring())){
				now1.setYear(now1.getYear()-39);
				now2.setYear(now2.getYear()-51);
				c.andBirthdayBetween(now2, now1);
			}
			if("OLD_3".equals(model.getWorkduring())){
				now1.setYear(now1.getYear()-49);
				now2.setYear(now2.getYear()-61);
				c.andBirthdayBetween(now2, now1);
			}
			if("OLD_4".equals(model.getWorkduring())){
				now1.setYear(now1.getYear()-59);
				c.andBirthdayLessThan(now1);
			}
		}
		return example;
	}

	public Result doStatistic(Expert model) {
		// TODO Auto-generated method stub
		return null;
	}
}
