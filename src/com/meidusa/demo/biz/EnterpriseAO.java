package com.meidusa.demo.biz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.regexp.recompile;
import org.apache.xml.utils.StringBufferPool;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.EnterpriseInfoDAO;
import com.meidusa.demo.dal.model.EnterpriseInfo;
import com.meidusa.demo.dal.model.EnterpriseInfoExample;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.common.lang.MessageUtil;
import com.meidusa.toolkit.dal.common.GuidTool;

public class EnterpriseAO extends
		AbstractUploadAO<EnterpriseInfo, EnterpriseInfoExample> {

	public static Logger log = Logger.getLogger(EnterpriseAO.class);

	@Override
	protected EnterpriseInfoExample doExample(String paramString) {
		EnterpriseInfoExample example = new EnterpriseInfoExample();
		if (paramString == null || paramString.isEmpty()) {
			log.debug("enterprise doExample with no prams.----------------");
			example.createCriteria().andIdIsNotNull();
		} else {
			log.debug("enterprise doExample with name prams.----------------");
			example.createCriteria().andNameLike("%" + paramString + "%");
		}
		return example;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		log.info("do save or update,call doMultiSaveFromList");
		List<EnterpriseInfo> list = new ArrayList<EnterpriseInfo>();
		if (values == null || values.isEmpty()) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() < 42) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				} else {
					log.info("valid data:" + item);
					EnterpriseInfo enterprise = null;
					EnterpriseInfoExample example = doExample(item.get(0));
					List<EnterpriseInfo> oldEnterpriseList = this.dao
							.selectByExampleWithBLOBs(example);
					if (oldEnterpriseList == null
							|| oldEnterpriseList.isEmpty()) {
						enterprise = new EnterpriseInfo();
						log.info("insert");
					} else {
						enterprise = oldEnterpriseList.get(0);
						log.info("update");
					}
					enterprise.setName(item.get(0));
					enterprise.setRegisteraddr(item.get(2));
					enterprise.setOfficeaddr(item.get(3));
					//enterprise.setAddress(item.get(1));
					//enterprise.setZip(item.get(3));

					log.info("0--3:" + item.get(0) + ":" + item.get(1) + ":"
							+ item.get(2) + ":" + item.get(3));

					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					try {
						Date d = sdf.parse(item.get(4));
						log.info("#######"+item.get(4)+" parse to date"+d);
						enterprise.setEnrolltime(d);
						log.info("####enrolltime:"+enterprise.getEnrolltime());
						d = sdf.parse(item.get(6));
						enterprise.setRegistertime(d);
						log.info("#####registertime:"+enterprise.getRegistertime());
					} catch (Exception e) {
						e.printStackTrace();
					}
					enterprise.setEmail(item.get(5));
					enterprise.setRegistercapital(Integer.valueOf(item.get(7)));
					
					enterprise.setTotalassets(Double.valueOf(item.get(8)
							.equals("") ? "0" : item.get(8)));
					enterprise.setBusinessincome(Double.valueOf(item.get(9)
							.equals("") ? "0" : item.get(9)));
					enterprise.setNetprofit(Double.valueOf(item.get(10)
							.equals("") ? "0" : item.get(10)));
					
					log.info("4--7:" + item.get(4) + ":" + item.get(5) + ":"
							+ item.get(6) + ":" + item.get(7));

					enterprise.setEmployeetotal(Integer.valueOf(item.get(11)
							.equals("") ? "0" : item.get(11)));
					enterprise.setBachelortotal(Integer.valueOf(item.get(12)
							.equals("") ? "0" : item.get(12)));
					enterprise.setSeniortotal(Integer.valueOf(item.get(13)
							.equals("") ? "0" : item.get(13)));
					enterprise.setMiddletotal(Integer.valueOf(item.get(14)
							.equals("") ? "0" : item.get(14)));
					enterprise.setJuniortotal(Integer.valueOf(item.get(15)
							.equals("") ? "0" : item.get(15)));
					enterprise.setTechnicianstotal(Integer.valueOf(item.get(16)
							.equals("") ? "0" : item.get(16)));
					
					enterprise.setProfessionaltotal(enterprise.getTechnicianstotal());
					
					item.set(17, getIdsFromItemValue(item.get(17)));
					
					
					enterprise.setNatureid(item.get(17).equals("") ? "29"
							: item.get(17));
					//enterprise.setNatureotherdesc(item.get(18));
					enterprise.setLegalrepresentative(item.get(18));
					enterprise.setLegalrepresentativetele(item.get(19));
					enterprise.setLegalrepresentativemobile(item.get(20));
					enterprise.setLinkman(item.get(21));
					enterprise.setPhone(item.get(22));
					enterprise.setMobilephone(item.get(23));
					enterprise.setFax(item.get(24));
					enterprise.setUrl(item.get(25));

					log.info("17--28:" + item.get(17) + ":" + item.get(18)
							+ ":" + item.get(19) + ":" + item.get(20)
							+ item.get(21) + ":" + item.get(22) + ":"
							+ item.get(23) + ":" + item.get(24) + item.get(25)
							+ ":" + item.get(26) + ":" + item.get(27) + ":"
							+ item.get(28));

					item.set(27, getIdsFromItemValue(item.get(27)));
					
					
					
					
					if (item.get(27).indexOf(",9,") != -1) {
						enterprise.setOmprodprod("checked");
					}
					if (item.get(27).indexOf(",10,") != -1) {
						enterprise.setOmprodsale("checked");
					}
					if (item.get(27).indexOf(",11,") != -1) {
						enterprise.setOmprojmaint("checked");
					}
					if (item.get(27).indexOf(",12,") != -1) {
						enterprise.setOmnetalarm("checked");
					}
					if (item.get(27).indexOf(",13,") != -1) {
						enterprise.setOmsptain("checked");
					}
					if (item.get(27).indexOf(",14,") != -1) {
						enterprise.setOmmedia("checked");
					}
					if (item.get(27).indexOf(",15,") != -1) {
						enterprise.setOmprojconstruct("checked");
					}
					if (item.get(27).indexOf(",16,") != -1) {
						enterprise.setOmother("checked");
					}
					item.set(28, getIdsFromItemValue(item.get(28)));
					enterprise.setQualifacationgetfire(item.get(28).equals("") ? "17"
									: item.get(28));
					item.set(29, getIdsFromItemValue(item.get(29)));
					enterprise.setQualifacationgetconf(item.get(29).equals("") ? "26"
									: item.get(29));
					item.set(30, getIdsFromItemValue(item.get(30)));
					enterprise.setQualifacationgetbuildinte(item.get(30)
							.equals("") ? "26" : item.get(30));
					item.set(31, getIdsFromItemValue(item.get(31)));
					enterprise.setQualifacationgetbuildproj(item.get(31)
							.equals("") ? "17" : item.get(31));
					item.set(32, getIdsFromItemValue(item.get(32)));
					enterprise.setQualifacationgetitinte(item.get(32)
							.equals("") ? "21" : item.get(32));
					item.set(33, getIdsFromItemValue(item.get(33)));
					enterprise.setSpqualifacationlevel(item.get(33).equals("") ? "17"
									: item.get(33));

					item.set(34, getIdsFromItemValue(item.get(34)));
					enterprise.setQualitycertifacation(item.get(34).equals("") ? "52"
									: item.get(34));
					
					
					
					//enterprise.setQualitycertifacationotherdesc(item.get(35));
					enterprise.setIndustrybound(item.get(35).equals("") ? "62": item.get(35));
					
					item.set(36, getIdsFromItemValue(item.get(36)));
					enterprise.setMembertypeid(item.get(36).equals("") ? "ENT_MEM_01"
									: item.get(36));
					item.set(37, getIdsFromItemValue(item.get(37)));
					enterprise.setProductbound(item.get(37));
					item.set(38, getIdsFromItemValue(item.get(38)));
					enterprise.setProjectbound(item.get(38));
					
					//enterprise.setTohighapplylevel(item.get(38).equals("") ? "35": item.get(38));
					log.info("29--40:" + item.get(29) + ":" + item.get(30)
							+ ":" + item.get(31) + ":" + item.get(32)
							+ item.get(33) + ":" + item.get(34) + ":"
							+ item.get(35) + ":" + item.get(36) + item.get(37)
							+ ":" + item.get(38) + ":" + item.get(39) + ":"
							+ item.get(40));
					
					
					item.set(37, getIdsFromItemValue(item.get(37)));
					if (item.get(37).indexOf(",39,") != -1) {
						enterprise.setProductboundvideo("checked");
					}
					if (item.get(37).indexOf(",40,") != -1) {
						enterprise.setProductboundbangsec("checked");
					}
					if (item.get(37).indexOf(",41,") != -1) {
						enterprise.setProductboundaroundalarm("checked");
					}
					if (item.get(37).indexOf(",42,") != -1) {
						enterprise.setProductboundtheftalarm("checked");
					}
					if (item.get(37).indexOf(",43,") != -1) {
						enterprise.setProductboundentrancecontrol("checked");
					}
					if (item.get(37).indexOf(",44,") != -1) {
						enterprise.setProductboundbuildvoice("checked");
					}
					if (item.get(37).indexOf(",45,") != -1) {
						enterprise.setProductboundbuildintell("checked");
					}
					if (item.get(37).indexOf(",46,") != -1) {
						enterprise.setProductboundvohilealarm("checked");
					}
					if (item.get(37).indexOf(",47,") != -1) {
						enterprise.setProductboundbodysec("checked");
					}
					if (item.get(37).indexOf(",48,") != -1) {
						enterprise.setProductboundbasesec("checked");
					}
					if (item.get(37).indexOf(",49,") != -1) {
						enterprise.setProductbounddooralarm("checked");
					}
					
					item.set(38, getIdsFromItemValue(item.get(38)));
					if (item.get(38).indexOf(",1,") != -1) {
						enterprise.setIndustryboundfiance("checked");
					}
					if (item.get(38).indexOf(",2,") != -1) {
						enterprise.setIndustryboundculture("checked");
					}
					if (item.get(38).indexOf(",3,") != -1) {
						enterprise.setIndustryboundeducation("checked");
					}
					if (item.get(38).indexOf(",4,") != -1) {
						enterprise.setIndustryboundcommu("checked");
					}
					if (item.get(38).indexOf(",5,") != -1) {
						enterprise.setIndustryboundgov("checked");
					}
					if (item.get(38).indexOf(",6,") != -1) {
						enterprise.setIndustryboundenterprise("checked");
					}
					if (item.get(38).indexOf(",7,") != -1) {
						enterprise.setIndustryboundenerge("checked");
					}
					if (item.get(38).indexOf(",8,") != -1) {
						enterprise.setIndustryboundhome("checked");
					}
					
					//enterprise.setIntroduction(item.get(41));
					
					/**
					try {
						Date d = new java.util.Date();
						d.setYear(Integer
								.parseInt(item.get(42).substring(0, 4)));
						d.setMonth(Integer.parseInt(item.get(42)
								.substring(4, 6)) - 1);
						d.setDate(Integer
								.parseInt(item.get(42).substring(6, 8)));
						enterprise.setCreateddatetime(d);

						d.setYear(Integer
								.parseInt(item.get(43).substring(0, 4)));
						d.setMonth(Integer.parseInt(item.get(43)
								.substring(4, 6)) - 1);
						d.setDate(Integer
								.parseInt(item.get(43).substring(6, 8)));
						enterprise.setLastupdatedatetime(d);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					enterprise.setIndustrybound(item.get(44).equals("") ? "57"
							: item.get(44));
					***/
					// checked_by checked_conclusion checked_time user_id
					// last_nsnj_date approval_level is_delete
					log.info("data prepare end");
					enterprise.setCreatedloginid("admin");
					enterprise.setCreateddatetime(new Date());
					enterprise.setLastupdatedatetime(new Date());
					enterprise.setLastupdateloginid("admin");
					enterprise.setFeepaymentflag("60");
					enterprise.setIpoflag("ENT_IPO_02");
					enterprise.setQualificationsupervision("17");
					enterprise.setQualificationcomputersp("17");
					if (enterprise.getId() == null
							|| enterprise.getId().isEmpty()) {
						enterprise.setPrimaryKey(GuidTool
								.generateFormattedGUID());
						this.dao.insert(enterprise);
						log.info("insert seccess");
					} else {
						this.dao.updateByPrimaryKeySelective(enterprise);
						log.info("update seccss");
					}
					list.add(enterprise);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	private String getIdsFromItemValue(String value) {
		if(value == null || value.isEmpty()){
			return "";
		}
		StringBuffer sbBuffer = new StringBuffer("");
		EnumerationExample eExample = new EnumerationExample();
		eExample.createCriteria().andEnumidIsNotNull();
		List<Enumeration> listEnum = this.getEnumerationDAO()
				.selectByExampleWithoutBLOBs(eExample);
		if(value.indexOf("、") < 0){
			for(Enumeration enumEntry : listEnum){
				if(enumEntry.getDescription().equalsIgnoreCase(value)){
					sbBuffer.append(enumEntry.getEnumid());
					break;
				}
			}
			return sbBuffer.toString();
		}else {
			sbBuffer.append(",");
			String[] descs = value.split("、");
			String mdesc = null;
			for(String desc:descs){
				if(desc.isEmpty()){
					continue;
				}else {
					//special manipulate desc like 工程设计施工、其他(咨询、监理)、
					if(desc.indexOf("(") > 0 && desc.indexOf(")") < 0){
						mdesc = desc;
						continue;
					}
					if(desc.indexOf("(") < 0 && desc.indexOf(")") > 0 && mdesc != null){
						desc = mdesc + desc;
					}
					for(Enumeration enumEntry:listEnum){
						if(enumEntry.getDescription().equalsIgnoreCase(desc)){
							sbBuffer.append(enumEntry.getEnumid()).append(",");
						}
					}
				}
			}
			return sbBuffer.toString();
		}
	}
	

	@Override
	protected EnterpriseInfoExample doQueryExample(EnterpriseInfo model) {
		log.info("enter EnterpriseAO.doQueryExample");
		EnterpriseInfoExample example = new EnterpriseInfoExample();
		EnterpriseInfoExample.Criteria c = example.createCriteria()
				.andIdIsNotNull();
		if (model.getName() != null && !model.getName().isEmpty()) {
			log.info("enter EnterpriseAO.doQueryExample,getName");
			c.andNameLike("%" + model.getName() + "%");
		}
		if (model.getLegalrepresentative() != null
				&& !model.getLegalrepresentative().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getLegalrepresentative");
			c.andLegalrepresentativeLike("%" + model.getLegalrepresentative()
					+ "%");
		}
		if(model.getLinkman() != null && !model.getLinkman().isEmpty()){
			log.info("EnterpriseAO.doQueryExample,getLinkman");
			c.andLinkmanLike("%" + model.getLinkman() + "%");
		}
		if (model.getMembertypeid() != null
				&& !model.getMembertypeid().isEmpty()) {
			log.info("enter EnterpriseAO.doQueryExample,getMembertypeid");
			c.andMembertypeidEqualTo(model.getMembertypeid());
		}
		if (model.getQualifacationgetfire() != null
				&& !model.getQualifacationgetfire().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getQualifacationgetfire");
			c.andQualifacationgetfireEqualTo(model.getQualifacationgetfire());
		}
		if (model.getQualifacationgetconf() != null
				&& !model.getQualifacationgetconf().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getQualifacationgetconf");
			c.andQualifacationgetconfEqualTo(model.getQualifacationgetconf());
		}
		if (model.getQualifacationgetbuildinte() != null
				&& !model.getQualifacationgetbuildinte().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getQualifacationgetbuildinte");
			c.andQualifacationgetbuildinteEqualTo(model
					.getQualifacationgetbuildinte());
		}
		if (model.getQualifacationgetbuildproj() != null
				&& !model.getQualifacationgetbuildproj().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getQualifacationgetbuildproj");
			c.andQualifacationgetbuildprojEqualTo(model
					.getQualifacationgetbuildproj());
		}
		if (model.getQualifacationgetitinte() != null
				&& !model.getQualifacationgetitinte().isEmpty()) {
			log
					.info("enter EnterpriseAO.doQueryExample,getQualifacationgetitinte");
			c.andQualifacationgetitinteEqualTo(model
					.getQualifacationgetitinte());
		}
		if(model.getQualificationsupervision() != null && !model.getQualificationsupervision().isEmpty()){
			log.info("enter EnterpriseAO.doQueryExample,getQualificationsupervision");
			c.andQualificationsupervisionEqualTo(model.getQualificationsupervision());
		}
		if(model.getQualificationcomputersp() != null && !model.getQualificationcomputersp().isEmpty()){
			log.info("enter EnterpriseAO.doQueryExample,getQualificationcomputersp");
			c.andQualificationcomputerspEqualTo(model.getQualificationcomputersp());
		}
		if(model.getProductbound() != null && !model.getProductbound().isEmpty()){
			log.info("enter EnterpriseAO.doQueryExample,getProductbound");
			c.andProductboundEqualTo(model.getProductbound());
		}
		if(model.getTotalassets()!=null && model.getTotalassets()>0.5){
			if(Math.abs(model.getTotalassets()-1)<0.1){
				c.andTotalassetsLessThan(100d);
			}
			if(Math.abs(model.getTotalassets()-2)<0.1){
				c.andTotalassetsBetween(100d, 500d);
			}
			if(Math.abs(model.getTotalassets()-3)<0.1){
				c.andTotalassetsBetween(500d, 5000d);
			}
			if(Math.abs(model.getTotalassets()-4)<0.1){
				c.andTotalassetsGreaterThan(5000d);
			}
		}
		if(model.getBusinessincome()!=null && model.getBusinessincome()>0.5){
			if(Math.abs(model.getBusinessincome()-1)<0.1){
				c.andBusinessincomeLessThan(100d);
			}
			if(Math.abs(model.getBusinessincome()-2)<0.1){
				c.andBusinessincomeBetween(100d, 500d);
			}
			if(Math.abs(model.getBusinessincome()-3)<0.1){
				c.andBusinessincomeBetween(500d, 5000d);
			}
			if(Math.abs(model.getBusinessincome()-4)<0.1){
				c.andBusinessincomeGreaterThan(5000d);
			}
		}
		if(model.getSpqualifacationlevel() != null && !model.getSpqualifacationlevel().isEmpty()){
			c.andSpqualifacationlevelEqualTo(model.getSpqualifacationlevel());
		}
		if(model.getNatureid() != null && !model.getNatureid().isEmpty()){
			c.andNatureidEqualTo(model.getNatureid());
		}
		if(model.getQualitycertifacation() != null && !model.getQualitycertifacation().isEmpty()){
			c.andQualitycertifacationEqualTo(model.getQualitycertifacation());
		}
		if(model.getFeepaymentflag() != null && !model.getFeepaymentflag().isEmpty()){
			c.andFeepaymentflagEqualTo(model.getFeepaymentflag());
		}
		return example;
	}

	public Result doStatistic(EnterpriseInfo model) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<EnterpriseInfo> list = new ArrayList<EnterpriseInfo>();
		if (model != null) {
			if ("all".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic all");
				list = ((EnterpriseInfoDAO) this.dao).statisticByAll(new EnterpriseInfo());
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			} else if ("spqualifacationlevel".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic spqualifacationlevel");
				EnumerationExample eExample = new EnumerationExample();
				eExample.createCriteria().andEnumtypeidEqualTo("QUALIF_LEVEL");
				List<Enumeration> listEnum = this.getEnumerationDAO()
						.selectByExampleWithoutBLOBs(eExample);
				for(Enumeration e : listEnum){
					EnterpriseInfo ei = new EnterpriseInfo();
					EnterpriseInfoExample example = new EnterpriseInfoExample();
					example.createCriteria().andSpqualifacationlevelEqualTo(e.getEnumid());
					int count = this.dao.countByExample(example);
					ei.setProductbound(e.getDescription());
					ei.setEmployeetotal(count);
					list.add(ei);
				}
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			} else if ("membertypeid".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic membertypeid");
				EnumerationExample eExample = new EnumerationExample();
				eExample.createCriteria().andEnumtypeidEqualTo("ENTERP_MEMBER_TYPE");
				List<Enumeration> listEnum = this.getEnumerationDAO()
						.selectByExampleWithoutBLOBs(eExample);
				for(Enumeration e : listEnum){
					EnterpriseInfo ei = new EnterpriseInfo();
					EnterpriseInfoExample example = new EnterpriseInfoExample();
					example.createCriteria().andMembertypeidEqualTo(e.getEnumid());
					int count = this.dao.countByExample(example);
					ei.setProductbound(e.getDescription());
					ei.setEmployeetotal(count);
					list.add(ei);
				}				
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			} else if ("feepaymentflag".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic feepaymentflag");
				EnumerationExample eExample = new EnumerationExample();
				eExample.createCriteria().andEnumtypeidEqualTo("ENTERP_FEE_FLAG");
				List<Enumeration> listEnum = this.getEnumerationDAO()
						.selectByExampleWithoutBLOBs(eExample);
				for(Enumeration e : listEnum){
					EnterpriseInfo ei = new EnterpriseInfo();
					EnterpriseInfoExample example = new EnterpriseInfoExample();
					example.createCriteria().andFeepaymentflagEqualTo(e.getEnumid());
					int count = this.dao.countByExample(example);
					ei.setProductbound(e.getDescription());
					ei.setEmployeetotal(count);
					list.add(ei);
				}				
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			}else if ("natureid".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic natureid");
				EnumerationExample eExample = new EnumerationExample();
				eExample.createCriteria().andEnumtypeidEqualTo("ENTERP_NATURE");
				List<Enumeration> listEnum = this.getEnumerationDAO()
						.selectByExampleWithoutBLOBs(eExample);
				for(Enumeration e : listEnum){
					EnterpriseInfo ei = new EnterpriseInfo();
					EnterpriseInfoExample example = new EnterpriseInfoExample();
					example.createCriteria().andNatureidEqualTo(e.getEnumid());
					int count = this.dao.countByExample(example);
					ei.setProductbound(e.getDescription());
					ei.setEmployeetotal(count);
					list.add(ei);
				}				
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			} else if ("operation".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic operation");
				EnterpriseInfo ei = new EnterpriseInfo();
				EnterpriseInfoExample example = new EnterpriseInfoExample();
				example.createCriteria().andOmmediaEqualTo("checked");
				int count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMProdProd", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmnetalarmEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMNetAlarm", null));
				ei.setEmployeetotal(count);
				list.add(ei);

				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmotherEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMOther", null));
				ei.setEmployeetotal(count);
				list.add(ei);

				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmprodprodEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMProdProd", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmprodsaleEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMProdSale", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmprojconstructEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMProjConstruct", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmprojmaintEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMProjMaint", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				ei = new EnterpriseInfo();
				example = new EnterpriseInfoExample();
				example.createCriteria().andOmsptainEqualTo("checked");
				count = this.dao.countByExample(example);
				ei.setProductbound(MessageUtil.getMessage(ResourceBundle
						.getBundle("bspia"), "enterprise_OMspTain", null));
				ei.setEmployeetotal(count);
				list.add(ei);
				
				log.info("enter EnterpriseAO.doStatistic list:" + list);
			}else if ("integrity".equals(model.getName())) {
				log.info("enter EnterpriseAO.doStatistic integrity");
				EnumerationExample eExample = new EnumerationExample();
				eExample.createCriteria().andEnumtypeidEqualTo("QUALIF_YEAR");
				List<Enumeration> listEnum = this.getEnumerationDAO()
						.selectByExampleWithoutBLOBs(eExample);
				for(Enumeration e : listEnum){
					EnterpriseInfo ei = new EnterpriseInfo();
					EnterpriseInfoExample example = new EnterpriseInfoExample();
					example.createCriteria().andIndustryboundEqualTo(e.getEnumid());
					int count = this.dao.countByExample(example);
					ei.setProductbound(e.getDescription());
					ei.setEmployeetotal(count);
					list.add(ei);
				}				
				log.info("enter EnterpriseAO.doStatistic list:"+list);
			}else {
				log.info("enter EnterpriseAO.doStatistic all");
				result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
				return result;
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

}
