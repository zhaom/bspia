package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.CandidateTrainsDAO;
import com.meidusa.demo.dal.CandidatesDAO;
import com.meidusa.demo.dal.ExamEnrollsDAO;
import com.meidusa.demo.dal.ExaminationDAO;
import com.meidusa.demo.dal.model.CandidateTrains;
import com.meidusa.demo.dal.model.CandidatesExample;
import com.meidusa.demo.dal.model.CandidatesWithBLOBs;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.demo.dal.model.ExamEnrolls;
import com.meidusa.demo.dal.model.ExamEnrollsExample;
import com.meidusa.demo.dal.model.Examination;
import com.meidusa.demo.dal.model.ExaminationExample;
import com.meidusa.demo.dal.model.Expert;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class ExamEnrollsAO extends
		AbstractUploadAO<ExamEnrolls, ExamEnrollsExample> {
	
	
	private ExaminationDAO examDAO;
	private CandidatesDAO candidateDAO;

	public ExaminationDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExaminationDAO examDAO) {
		this.examDAO = examDAO;
	}

	public CandidatesDAO getCandidateDAO() {
		return candidateDAO;
	}

	public void setCandidateDAO(CandidatesDAO candidateDAO) {
		this.candidateDAO = candidateDAO;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<CandidatesWithBLOBs> list = new ArrayList<CandidatesWithBLOBs>();
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
					ExamEnrolls eItem = new ExamEnrolls();
					CandidatesWithBLOBs cItem = new CandidatesWithBLOBs();
					log.info("doMultiSaveFromList has values, valid value:"
							+ item);
					EnumerationExample eExample = new EnumerationExample();
					eExample.createCriteria().andEnumidIsNotNull();
					List<Enumeration> listEnum = this.getEnumerationDAO()
							.selectByExampleWithoutBLOBs(eExample);
					log.info("doMultiSaveFromList get enums:" + listEnum);

					ExaminationExample example = new ExaminationExample();
					example.createCriteria().andExamnameEqualTo(item.get(0));
							
					List<Examination> listExaminationOld = this.examDAO
							.selectByExampleWithBLOBs(example);
					if(listExaminationOld == null || listExaminationOld.size()<1){
						result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
						return result;
					}else{
						eItem.setExamid(listExaminationOld.get(0).getId());
					}
					
					cItem.setName(item.get(3));
					cItem.setGenderenumid("GENDER_TYPE_01");
					cItem.setEducationenumid("EXPERT_EDU_03");
					cItem.setCardtypeenumid("EXPERT_CARDTYPE_01");
					for (Enumeration e : listEnum) {
						if (e.getDescription().equals(item.get(4))) {
							cItem.setGenderenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(12))) {
							cItem.setEducationenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(10))) {
							cItem.setCardtypeenumid(e.getEnumid());
						}
					}
					//cItem.setPoliticalenumid(item.get(7));
					cItem.setCardno(item.get(11));
					cItem.setNationalityenumid(item.get(5));
					cItem.setTitle(item.get(13));
					cItem.setPosition(item.get(17));
					cItem.setWorkplace(item.get(14)+" "+item.get(7));
					cItem.setTele(item.get(8));
					cItem.setMobilephone(item.get(9));
					cItem.setAddress(item.get(15));
					cItem.setZipcode(item.get(16));
					cItem.setSecuritybelong(item.get(6));
					cItem.setStudayexperience(item.get(18));
					cItem.setWorkexprience(item.get(19));
					
					eItem.setExamcertno(item.get(1));
					eItem.setScore(item.get(20));
					eItem.setCertificatename(item.get(2));
					eItem.setCertificateno(item.get(21));

					CandidatesExample cexample = new CandidatesExample();
					cexample.createCriteria()
							.andCardnoEqualTo(cItem.getCardno());
					List<CandidatesWithBLOBs> listCandidatesOld = this.candidateDAO
							.selectByExampleWithBLOBs(cexample);

					if (listCandidatesOld == null || listCandidatesOld.size() < 1) {
						log.info("doMultiSaveFromList insert" + cItem);
						cItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						eItem.setCandidateid(cItem.getId());
						eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						this.candidateDAO.insert(cItem);
						this.dao.insert(eItem);
						
					} else {
						CandidatesWithBLOBs oldExpert = listCandidatesOld.get(0);
						cItem.setId(oldExpert.getId());
						log.info("doMultiSaveFromList update" + cItem.getId());
						this.candidateDAO.updateByPrimaryKeySelective(cItem);
						
						eItem.setCandidateid(cItem.getId());
						ExamEnrollsExample eeExample = new ExamEnrollsExample();
						eeExample.createCriteria().andCandidateidEqualTo(eItem.getCandidateid()).andExamidEqualTo(eItem.getExamid());
						List<ExamEnrolls> listExamEnrollsOld = this.dao.selectByExampleWithBLOBs(eeExample);
						if(listExamEnrollsOld == null || listExamEnrollsOld.size() < 1){
							log.info("doMultiSaveFromList insert relation" + cItem.getId());
							eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
							this.dao.insert(eItem);
						}else{
							log.info("doMultiSaveFromList update relation" + cItem.getId());
							eItem.setId(listExamEnrollsOld.get(0).getId());
							this.dao.updateByPrimaryKeySelective(eItem);
						}
						
					}
					list.add(cItem);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected ExamEnrollsExample doExample(String arg0) {
		ExamEnrollsExample example = new ExamEnrollsExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andCandidateidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected ExamEnrollsExample doQueryExample(ExamEnrolls model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(ExamEnrolls model) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<ExamEnrolls> list = null;
		list = ((ExamEnrollsDAO) this.dao).statisticByAll(new ExamEnrolls());
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

}
