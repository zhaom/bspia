package com.meidusa.demo.web.action;

import com.meidusa.demo.dal.model.Product;
import com.meidusa.demo.web.support.BaseUploadAction;
import com.meidusa.demo.web.support.Cookie;
import com.meidusa.toolkit.biz.common.result.Result;
import com.meidusa.toolkit.web.common.action.Constants;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProductAction extends BaseUploadAction<Product, Cookie> implements
		Preparable, ModelDriven<Product> {

	private Product model;

	@Override
	public Product getModel() {
		return model;
	}

	public void prepare() throws Exception {
		if (this.requestId == null || this.requestId.isEmpty()) {
			model = new Product();
		} else {
			Result r = ao.doGet(getRequestId());
			model = (Product) r.getDefaultModel();
		}

	}

	
}
