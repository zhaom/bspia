package com.meidusa.demo.biz;

import java.util.Collection;
import java.util.List;

import com.meidusa.demo.biz.support.AbstractUploadAO;
import com.meidusa.demo.dal.model.Product;
import com.meidusa.demo.dal.model.ProductExample;
import com.meidusa.toolkit.biz.common.result.Result;

public class ProductAO extends AbstractUploadAO<Product, ProductExample> {

	@Override
	protected Result doMultiSaveFromList(
			Collection<? extends List<String>> values, String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ProductExample doExample(String arg0) {
		ProductExample example = new ProductExample();
		if (arg0 == null || arg0.isEmpty()) {
			example.createCriteria().andIdIsNotNull();
		} else {
			example.createCriteria().andNameLike("%" + arg0 + "%");
		}
		return example;
	}

	@Override
	protected ProductExample doQueryExample(Product model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result doStatistic(Product model) {
		// TODO Auto-generated method stub
		return null;
	}

}
