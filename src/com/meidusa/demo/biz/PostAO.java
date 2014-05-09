package com.meidusa.demo.biz;

import com.meidusa.demo.dal.model.Post;
import com.meidusa.demo.dal.model.PostExample;
import com.meidusa.toolkit.biz.common.AbstractAO;

public class PostAO extends AbstractAO<Post, PostExample> {

	@Override
	protected PostExample doExample(String foreignKey) {
		PostExample example = new PostExample();
		example.createCriteria().andLoginidEqualTo(foreignKey);
		return example;
	}

}
