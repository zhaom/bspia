package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.CandidateTrainsDAO;
import com.meidusa.demo.dal.CandidatesDAO;
import com.meidusa.demo.dal.EnterpriseInfoDAO;
import com.meidusa.demo.dal.TrainingDAO;
import com.meidusa.demo.dal.model.CandidateTrains;
import com.meidusa.demo.dal.model.CandidateTrainsExample;
import com.meidusa.demo.dal.model.CandidatesExample;
import com.meidusa.demo.dal.model.CandidatesWithBLOBs;
import com.meidusa.demo.dal.model.EnterpriseInfo;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.demo.dal.model.ExamEnrolls;
import com.meidusa.demo.dal.model.ExamEnrollsExample;
import com.meidusa.demo.dal.model.Examination;
import com.meidusa.demo.dal.model.ExaminationExample;
import com.meidusa.demo.dal.model.Training;
import com.meidusa.demo.dal.model.TrainingExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.common.GuidTool;

public class CandidateTrainsAO extends
		AbstractUploadAO<CandidateTrains, CandidateTrainsExample> {

	private TrainingDAO trainDAO;
	private CandidatesDAO candidateDAO;

	public TrainingDAO getTrainDAO() {
		return trainDAO;
	}

	public void setTrainDAO(TrainingDAO trainDAO) {
		this.trainDAO = trainDAO;
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
				if (item == null || item.size() != 20) {
					log
							.info("doMultiSaveFromList has values, but invalid value:"
									+ item.size());
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
					return result;
				} else {
					CandidateTrains eItem = new CandidateTrains();
					CandidatesWithBLOBs cItem = new CandidatesWithBLOBs();
					log.info("doMultiSaveFromList has values, valid value:"
							+ item);
					EnumerationExample eExample = new EnumerationExample();
					eExample.createCriteria().andEnumidIsNotNull();
					List<Enumeration> listEnum = this.getEnumerationDAO()
							.selectByExampleWithoutBLOBs(eExample);
					log.info("doMultiSaveFromList get enums:" + listEnum);

					TrainingExample example = new TrainingExample();
					example.createCriteria().andTrainnameEqualTo(item.get(0));

					List<Training> listTrainingOld = this.trainDAO
							.selectByExampleWithBLOBs(example);
					if (listTrainingOld == null || listTrainingOld.size() < 1) {
						result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
						return result;
					} else {
						eItem.setTrainid(listTrainingOld.get(0).getId());
					}

					cItem.setName(item.get(1));
					cItem.setGenderenumid("GENDER_TYPE_01");
					cItem.setPoliticalenumid("POLITIC_TYPE_01");
					cItem.setEducationenumid("EXPERT_EDU_03");
					cItem.setCardtypeenumid("EXPERT_CARDTYPE_01");
					eItem.setTrainresultenumid("SELECT_RESULT_00");
					for (Enumeration e : listEnum) {
						if (e.getDescription().equals(item.get(2))) {
							cItem.setGenderenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(8))) {
							cItem.setPoliticalenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(6))) {
							cItem.setEducationenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(3))) {
							cItem.setCardtypeenumid(e.getEnumid());
						}
						if (e.getDescription().equals(item.get(19))) {
							eItem.setTrainresultenumid(e.getEnumid());
						}
					}
					cItem.setCardno(item.get(4));
					cItem.setNationalityenumid(item.get(5));
					cItem.setTitle(item.get(7));
					cItem.setPosition(item.get(9));
					cItem.setWorkplace(item.get(10));
					cItem.setTele(item.get(11));
					cItem.setMobilephone(item.get(12));
					cItem.setAddress(item.get(13));
					cItem.setZipcode(item.get(14));
					cItem.setSecuritybelong(item.get(15));
					cItem.setStudayexperience(item.get(16));
					cItem.setWorkexprience(item.get(17));

					eItem.setAttendcertno(item.get(18));

					CandidatesExample cexample = new CandidatesExample();
					cexample.createCriteria().andCardnoEqualTo(
							cItem.getCardno());
					List<CandidatesWithBLOBs> listCandidatesOld = this.candidateDAO
							.selectByExampleWithBLOBs(cexample);

					if (listCandidatesOld == null
							|| listCandidatesOld.size() < 1) {
						log.info("doMultiSaveFromList insert" + cItem);
						cItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						eItem.setCandidateid(cItem.getId());
						eItem.setPrimaryKey(GuidTool.generateFormattedGUID());
						this.candidateDAO.insert(cItem);
						this.dao.insert(eItem);
					} else {
						CandidatesWithBLOBs oldExpert = listCandidatesOld
								.get(0);
						cItem.setId(oldExpert.getId());
						log.info("doMultiSaveFromList update" + cItem.getId());
						this.candidateDAO.updateByPrimaryKeySelective(cItem);

						eItem.setCandidateid(cItem.getId());

						log
								.info("doMultiSaveFromList prepare judge, candidateid:"
										+ eItem.getCandidateid()
										+ " trainid:"
										+ eItem.getTrainid());

						CandidateTrainsExample eeExample = new CandidateTrainsExample();
						eeExample.createCriteria().andCandidateidEqualTo(
								eItem.getCandidateid()).andTrainidEqualTo(eItem.getTrainid());
						List<CandidateTrains> listCandidateTrainsOld = this.dao
								.selectByExampleWithBLOBs(eeExample);

						if (listCandidateTrainsOld == null || listCandidateTrainsOld.size() < 1) {
							log.info("doMultiSaveFromList insert relation"
									+ cItem.getId());
							eItem.setPrimaryKey(GuidTool
									.generateFormattedGUID());
							this.dao.insert(eItem);
						} else {
							log.info("doMultiSaveFromList update relation"
									+ cItem.getId());
							eItem.setId(listCandidateTrainsOld.get(0).getId());
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
	protected CandidateTrainsExample doExample(String arg0) {
		CandidateTrainsExample example = new CandidateTrainsExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andCandidateidEqualTo(arg0);
		}
		return example;
	}

	@Override
	protected CandidateTrainsExample doQueryExample(CandidateTrains model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(CandidateTrains model) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<CandidateTrains> list = null;
		list = ((CandidateTrainsDAO) this.dao).statisticByAll(new CandidateTrains());
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

}
