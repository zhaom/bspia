package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.EnterpriseProductsExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import java.util.List;

public class EnterpriseProductsExample extends AbstractExample<EnterpriseProductsExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterpriseproducts
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public EnterpriseProductsExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterpriseproducts
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public EnterpriseProductsExample(EnterpriseProductsExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterpriseproducts
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table enterpriseproducts
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public static class Criteria extends AbstractExample.Criteria {

        public Criteria andForeignKeyEqualTo(String value) {
            addCriterion("null like", value, "null");
            return this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andEnterpriseidIsNull() {
            addCriterion("enterpriseId is null");
            return this;
        }

        public Criteria andEnterpriseidIsNotNull() {
            addCriterion("enterpriseId is not null");
            return this;
        }

        public Criteria andEnterpriseidEqualTo(String value) {
            addCriterion("enterpriseId =", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotEqualTo(String value) {
            addCriterion("enterpriseId <>", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidGreaterThan(String value) {
            addCriterion("enterpriseId >", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidGreaterThanOrEqualTo(String value) {
            addCriterion("enterpriseId >=", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLessThan(String value) {
            addCriterion("enterpriseId <", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLessThanOrEqualTo(String value) {
            addCriterion("enterpriseId <=", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLike(String value) {
            addCriterion("enterpriseId like", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotLike(String value) {
            addCriterion("enterpriseId not like", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidIn(List<String> values) {
            addCriterion("enterpriseId in", values, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotIn(List<String> values) {
            addCriterion("enterpriseId not in", values, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidBetween(String value1, String value2) {
            addCriterion("enterpriseId between", value1, value2, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotBetween(String value1, String value2) {
            addCriterion("enterpriseId not between", value1, value2, "enterpriseid");
            return this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return this;
        }

        public Criteria andMarketstrategyIsNull() {
            addCriterion("marketStrategy is null");
            return this;
        }

        public Criteria andMarketstrategyIsNotNull() {
            addCriterion("marketStrategy is not null");
            return this;
        }

        public Criteria andMarketstrategyEqualTo(String value) {
            addCriterion("marketStrategy =", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyNotEqualTo(String value) {
            addCriterion("marketStrategy <>", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyGreaterThan(String value) {
            addCriterion("marketStrategy >", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyGreaterThanOrEqualTo(String value) {
            addCriterion("marketStrategy >=", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyLessThan(String value) {
            addCriterion("marketStrategy <", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyLessThanOrEqualTo(String value) {
            addCriterion("marketStrategy <=", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyLike(String value) {
            addCriterion("marketStrategy like", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyNotLike(String value) {
            addCriterion("marketStrategy not like", value, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyIn(List<String> values) {
            addCriterion("marketStrategy in", values, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyNotIn(List<String> values) {
            addCriterion("marketStrategy not in", values, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyBetween(String value1, String value2) {
            addCriterion("marketStrategy between", value1, value2, "marketstrategy");
            return this;
        }

        public Criteria andMarketstrategyNotBetween(String value1, String value2) {
            addCriterion("marketStrategy not between", value1, value2, "marketstrategy");
            return this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return this;
        }
    }
}