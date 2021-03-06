package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.IntegrityInfoExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IntegrityInfoExample extends AbstractExample<IntegrityInfoExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table integrityinfo
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public IntegrityInfoExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table integrityinfo
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public IntegrityInfoExample(IntegrityInfoExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table integrityinfo
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table integrityinfo
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public static class Criteria extends AbstractExample.Criteria {

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

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

        public Criteria andIntegritytitleIsNull() {
            addCriterion("integrityTitle is null");
            return this;
        }

        public Criteria andIntegritytitleIsNotNull() {
            addCriterion("integrityTitle is not null");
            return this;
        }

        public Criteria andIntegritytitleEqualTo(String value) {
            addCriterion("integrityTitle =", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleNotEqualTo(String value) {
            addCriterion("integrityTitle <>", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleGreaterThan(String value) {
            addCriterion("integrityTitle >", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleGreaterThanOrEqualTo(String value) {
            addCriterion("integrityTitle >=", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleLessThan(String value) {
            addCriterion("integrityTitle <", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleLessThanOrEqualTo(String value) {
            addCriterion("integrityTitle <=", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleLike(String value) {
            addCriterion("integrityTitle like", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleNotLike(String value) {
            addCriterion("integrityTitle not like", value, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleIn(List<String> values) {
            addCriterion("integrityTitle in", values, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleNotIn(List<String> values) {
            addCriterion("integrityTitle not in", values, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleBetween(String value1, String value2) {
            addCriterion("integrityTitle between", value1, value2, "integritytitle");
            return this;
        }

        public Criteria andIntegritytitleNotBetween(String value1, String value2) {
            addCriterion("integrityTitle not between", value1, value2, "integritytitle");
            return this;
        }

        public Criteria andCapturetimeIsNull() {
            addCriterion("captureTime is null");
            return this;
        }

        public Criteria andCapturetimeIsNotNull() {
            addCriterion("captureTime is not null");
            return this;
        }

        public Criteria andCapturetimeEqualTo(Date value) {
            addCriterionForJDBCDate("captureTime =", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("captureTime <>", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("captureTime >", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("captureTime >=", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeLessThan(Date value) {
            addCriterionForJDBCDate("captureTime <", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("captureTime <=", value, "capturetime");
            return this;
        }

        public Criteria andCapturetimeIn(List<Date> values) {
            addCriterionForJDBCDate("captureTime in", values, "capturetime");
            return this;
        }

        public Criteria andCapturetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("captureTime not in", values, "capturetime");
            return this;
        }

        public Criteria andCapturetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("captureTime between", value1, value2, "capturetime");
            return this;
        }

        public Criteria andCapturetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("captureTime not between", value1, value2, "capturetime");
            return this;
        }

        public Criteria andEnterpriseidIsNull() {
            addCriterion("enterpriseid is null");
            return this;
        }

        public Criteria andEnterpriseidIsNotNull() {
            addCriterion("enterpriseid is not null");
            return this;
        }

        public Criteria andEnterpriseidEqualTo(String value) {
            addCriterion("enterpriseid =", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotEqualTo(String value) {
            addCriterion("enterpriseid <>", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidGreaterThan(String value) {
            addCriterion("enterpriseid >", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidGreaterThanOrEqualTo(String value) {
            addCriterion("enterpriseid >=", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLessThan(String value) {
            addCriterion("enterpriseid <", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLessThanOrEqualTo(String value) {
            addCriterion("enterpriseid <=", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidLike(String value) {
            addCriterion("enterpriseid like", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotLike(String value) {
            addCriterion("enterpriseid not like", value, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidIn(List<String> values) {
            addCriterion("enterpriseid in", values, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotIn(List<String> values) {
            addCriterion("enterpriseid not in", values, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidBetween(String value1, String value2) {
            addCriterion("enterpriseid between", value1, value2, "enterpriseid");
            return this;
        }

        public Criteria andEnterpriseidNotBetween(String value1, String value2) {
            addCriterion("enterpriseid not between", value1, value2, "enterpriseid");
            return this;
        }
    }
}