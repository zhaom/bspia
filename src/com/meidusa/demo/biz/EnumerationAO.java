package com.meidusa.demo.biz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Enumeration;
import com.meidusa.demo.dal.model.EnumerationExample;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.biz.common.result.ResultCode;
import com.meidusa.toolkit.biz.common.result.ResultSupport;
import com.meidusa.toolkit.dal.ibator.AbstractModel;

public class EnumerationAO extends
		AbstractUploadAO<Enumeration, EnumerationExample> {

	@Override
	protected EnumerationExample doExample(String arg0) {
		EnumerationExample example = new EnumerationExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andEnumidIsNotNull();
		} else {
			example.createCriteria().andEnumtypeidEqualTo(arg0);
		}
		return example;
	}

	public Result doSave(Enumeration model, String foreignKey) {
		Result result = new ResultSupport();
		result.setSuccess(false);

		if ((model.getPrimaryKey() == null)
				|| (model.getPrimaryKey().isEmpty())) {
			result.setResultCode(ResultCode.ACCESS_VIOLATION);
			return result;
		} else {
			AbstractModel oldmodel = (AbstractModel) this.dao
					.selectByPrimaryKey(model.getPrimaryKey());
			if (oldmodel == null) {
				this.dao.insert(model);
			} else {
				this.dao.updateByPrimaryKeySelective(model);
			}
		}

		result.setDefaultModel("requestId", model.getPrimaryKey());
		result.setSuccess(true);
		return result;
	}

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		Result result = new ResultSupport();
		result.setSuccess(false);
		List<Enumeration> list = new ArrayList<Enumeration>();
		if (values == null || values.size() < 1) {
			result.setResultCode(ResultCode.MODEL_OBJECT_NOT_EXIST);
			return result;
		} else {
			Iterator<List<String>> it = (Iterator<List<String>>) values
					.iterator();
			while (it.hasNext()) {
				List<String> item = (List<String>) it.next();
				if (item == null || item.size() != 4) {
					result.setResultCode(ResultCode.ILLEGAL_COMMAND_PARAMETERS);
					return result;
				} else {
					Enumeration enumItem = new Enumeration();
					enumItem.setEnumid(item.get(0));
					enumItem.setEnumtypeid(item.get(1));
					enumItem.setEnumcode(item.get(2));
					enumItem.setDescription(item.get(3));
					AbstractModel oldmodel = (AbstractModel) this.dao
							.selectByPrimaryKey(enumItem.getPrimaryKey());
					if (oldmodel == null) {
						this.dao.insert(enumItem);
					} else {
						this.dao.updateByPrimaryKeySelective(enumItem);
					}
					list.add(enumItem);
				}
			}
		}
		result.setDefaultModel(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	protected EnumerationExample doQueryExample(Enumeration model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Enumeration model) {
		// TODO Auto-generated method stub
		return null;
	}
}
