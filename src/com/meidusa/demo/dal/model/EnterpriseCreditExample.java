package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.EnterpriseCreditExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import java.util.List;

public class EnterpriseCreditExample extends AbstractExample<EnterpriseCreditExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterprisecredit
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public EnterpriseCreditExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterprisecredit
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public EnterpriseCreditExample(EnterpriseCreditExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table enterprisecredit
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table enterprisecredit
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

        public Criteria andCreditduringIsNull() {
            addCriterion("creditDuring is null");
            return this;
        }

        public Criteria andCreditduringIsNotNull() {
            addCriterion("creditDuring is not null");
            return this;
        }

        public Criteria andCreditduringEqualTo(String value) {
            addCriterion("creditDuring =", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringNotEqualTo(String value) {
            addCriterion("creditDuring <>", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringGreaterThan(String value) {
            addCriterion("creditDuring >", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringGreaterThanOrEqualTo(String value) {
            addCriterion("creditDuring >=", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringLessThan(String value) {
            addCriterion("creditDuring <", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringLessThanOrEqualTo(String value) {
            addCriterion("creditDuring <=", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringLike(String value) {
            addCriterion("creditDuring like", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringNotLike(String value) {
            addCriterion("creditDuring not like", value, "creditduring");
            return this;
        }

        public Criteria andCreditduringIn(List<String> values) {
            addCriterion("creditDuring in", values, "creditduring");
            return this;
        }

        public Criteria andCreditduringNotIn(List<String> values) {
            addCriterion("creditDuring not in", values, "creditduring");
            return this;
        }

        public Criteria andCreditduringBetween(String value1, String value2) {
            addCriterion("creditDuring between", value1, value2, "creditduring");
            return this;
        }

        public Criteria andCreditduringNotBetween(String value1, String value2) {
            addCriterion("creditDuring not between", value1, value2, "creditduring");
            return this;
        }

        public Criteria andCredittnfoIsNull() {
            addCriterion("creditTnfo is null");
            return this;
        }

        public Criteria andCredittnfoIsNotNull() {
            addCriterion("creditTnfo is not null");
            return this;
        }

        public Criteria andCredittnfoEqualTo(String value) {
            addCriterion("creditTnfo =", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoNotEqualTo(String value) {
            addCriterion("creditTnfo <>", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoGreaterThan(String value) {
            addCriterion("creditTnfo >", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoGreaterThanOrEqualTo(String value) {
            addCriterion("creditTnfo >=", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoLessThan(String value) {
            addCriterion("creditTnfo <", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoLessThanOrEqualTo(String value) {
            addCriterion("creditTnfo <=", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoLike(String value) {
            addCriterion("creditTnfo like", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoNotLike(String value) {
            addCriterion("creditTnfo not like", value, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoIn(List<String> values) {
            addCriterion("creditTnfo in", values, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoNotIn(List<String> values) {
            addCriterion("creditTnfo not in", values, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoBetween(String value1, String value2) {
            addCriterion("creditTnfo between", value1, value2, "credittnfo");
            return this;
        }

        public Criteria andCredittnfoNotBetween(String value1, String value2) {
            addCriterion("creditTnfo not between", value1, value2, "credittnfo");
            return this;
        }
    }
}