package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.ProductExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample extends AbstractExample<ProductExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public ProductExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public ProductExample(ProductExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table product
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table product
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return this;
        }

        public Criteria andCategoryidEqualTo(String value) {
            addCriterion("categoryId =", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidNotEqualTo(String value) {
            addCriterion("categoryId <>", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidGreaterThan(String value) {
            addCriterion("categoryId >", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("categoryId >=", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidLessThan(String value) {
            addCriterion("categoryId <", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(String value) {
            addCriterion("categoryId <=", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidLike(String value) {
            addCriterion("categoryId like", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidNotLike(String value) {
            addCriterion("categoryId not like", value, "categoryid");
            return this;
        }

        public Criteria andCategoryidIn(List<String> values) {
            addCriterion("categoryId in", values, "categoryid");
            return this;
        }

        public Criteria andCategoryidNotIn(List<String> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return this;
        }

        public Criteria andCategoryidBetween(String value1, String value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return this;
        }

        public Criteria andCategoryidNotBetween(String value1, String value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return this;
        }

        public Criteria andManufacturercontactIsNull() {
            addCriterion("manufacturerContact is null");
            return this;
        }

        public Criteria andManufacturercontactIsNotNull() {
            addCriterion("manufacturerContact is not null");
            return this;
        }

        public Criteria andManufacturercontactEqualTo(String value) {
            addCriterion("manufacturerContact =", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactNotEqualTo(String value) {
            addCriterion("manufacturerContact <>", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactGreaterThan(String value) {
            addCriterion("manufacturerContact >", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturerContact >=", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactLessThan(String value) {
            addCriterion("manufacturerContact <", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactLessThanOrEqualTo(String value) {
            addCriterion("manufacturerContact <=", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactLike(String value) {
            addCriterion("manufacturerContact like", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactNotLike(String value) {
            addCriterion("manufacturerContact not like", value, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactIn(List<String> values) {
            addCriterion("manufacturerContact in", values, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactNotIn(List<String> values) {
            addCriterion("manufacturerContact not in", values, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactBetween(String value1, String value2) {
            addCriterion("manufacturerContact between", value1, value2, "manufacturercontact");
            return this;
        }

        public Criteria andManufacturercontactNotBetween(String value1, String value2) {
            addCriterion("manufacturerContact not between", value1, value2, "manufacturercontact");
            return this;
        }

        public Criteria andVendorIsNull() {
            addCriterion("vendor is null");
            return this;
        }

        public Criteria andVendorIsNotNull() {
            addCriterion("vendor is not null");
            return this;
        }

        public Criteria andVendorEqualTo(String value) {
            addCriterion("vendor =", value, "vendor");
            return this;
        }

        public Criteria andVendorNotEqualTo(String value) {
            addCriterion("vendor <>", value, "vendor");
            return this;
        }

        public Criteria andVendorGreaterThan(String value) {
            addCriterion("vendor >", value, "vendor");
            return this;
        }

        public Criteria andVendorGreaterThanOrEqualTo(String value) {
            addCriterion("vendor >=", value, "vendor");
            return this;
        }

        public Criteria andVendorLessThan(String value) {
            addCriterion("vendor <", value, "vendor");
            return this;
        }

        public Criteria andVendorLessThanOrEqualTo(String value) {
            addCriterion("vendor <=", value, "vendor");
            return this;
        }

        public Criteria andVendorLike(String value) {
            addCriterion("vendor like", value, "vendor");
            return this;
        }

        public Criteria andVendorNotLike(String value) {
            addCriterion("vendor not like", value, "vendor");
            return this;
        }

        public Criteria andVendorIn(List<String> values) {
            addCriterion("vendor in", values, "vendor");
            return this;
        }

        public Criteria andVendorNotIn(List<String> values) {
            addCriterion("vendor not in", values, "vendor");
            return this;
        }

        public Criteria andVendorBetween(String value1, String value2) {
            addCriterion("vendor between", value1, value2, "vendor");
            return this;
        }

        public Criteria andVendorNotBetween(String value1, String value2) {
            addCriterion("vendor not between", value1, value2, "vendor");
            return this;
        }

        public Criteria andVendorcontactIsNull() {
            addCriterion("vendorContact is null");
            return this;
        }

        public Criteria andVendorcontactIsNotNull() {
            addCriterion("vendorContact is not null");
            return this;
        }

        public Criteria andVendorcontactEqualTo(String value) {
            addCriterion("vendorContact =", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactNotEqualTo(String value) {
            addCriterion("vendorContact <>", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactGreaterThan(String value) {
            addCriterion("vendorContact >", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactGreaterThanOrEqualTo(String value) {
            addCriterion("vendorContact >=", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactLessThan(String value) {
            addCriterion("vendorContact <", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactLessThanOrEqualTo(String value) {
            addCriterion("vendorContact <=", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactLike(String value) {
            addCriterion("vendorContact like", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactNotLike(String value) {
            addCriterion("vendorContact not like", value, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactIn(List<String> values) {
            addCriterion("vendorContact in", values, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactNotIn(List<String> values) {
            addCriterion("vendorContact not in", values, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactBetween(String value1, String value2) {
            addCriterion("vendorContact between", value1, value2, "vendorcontact");
            return this;
        }

        public Criteria andVendorcontactNotBetween(String value1, String value2) {
            addCriterion("vendorContact not between", value1, value2, "vendorcontact");
            return this;
        }

        public Criteria andVendorchanelIsNull() {
            addCriterion("vendorChanel is null");
            return this;
        }

        public Criteria andVendorchanelIsNotNull() {
            addCriterion("vendorChanel is not null");
            return this;
        }

        public Criteria andVendorchanelEqualTo(String value) {
            addCriterion("vendorChanel =", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelNotEqualTo(String value) {
            addCriterion("vendorChanel <>", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelGreaterThan(String value) {
            addCriterion("vendorChanel >", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelGreaterThanOrEqualTo(String value) {
            addCriterion("vendorChanel >=", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelLessThan(String value) {
            addCriterion("vendorChanel <", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelLessThanOrEqualTo(String value) {
            addCriterion("vendorChanel <=", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelLike(String value) {
            addCriterion("vendorChanel like", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelNotLike(String value) {
            addCriterion("vendorChanel not like", value, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelIn(List<String> values) {
            addCriterion("vendorChanel in", values, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelNotIn(List<String> values) {
            addCriterion("vendorChanel not in", values, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelBetween(String value1, String value2) {
            addCriterion("vendorChanel between", value1, value2, "vendorchanel");
            return this;
        }

        public Criteria andVendorchanelNotBetween(String value1, String value2) {
            addCriterion("vendorChanel not between", value1, value2, "vendorchanel");
            return this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime =", value, "checktime");
            return this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime <>", value, "checktime");
            return this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("checkTime >", value, "checktime");
            return this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime >=", value, "checktime");
            return this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterionForJDBCDate("checkTime <", value, "checktime");
            return this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime <=", value, "checktime");
            return this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterionForJDBCDate("checkTime in", values, "checktime");
            return this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkTime not in", values, "checktime");
            return this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkTime between", value1, value2, "checktime");
            return this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkTime not between", value1, value2, "checktime");
            return this;
        }

        public Criteria andCertificationrimeIsNull() {
            addCriterion("certificationRime is null");
            return this;
        }

        public Criteria andCertificationrimeIsNotNull() {
            addCriterion("certificationRime is not null");
            return this;
        }

        public Criteria andCertificationrimeEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRime =", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRime <>", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeGreaterThan(Date value) {
            addCriterionForJDBCDate("certificationRime >", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRime >=", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeLessThan(Date value) {
            addCriterionForJDBCDate("certificationRime <", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRime <=", value, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeIn(List<Date> values) {
            addCriterionForJDBCDate("certificationRime in", values, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("certificationRime not in", values, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certificationRime between", value1, value2, "certificationrime");
            return this;
        }

        public Criteria andCertificationrimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certificationRime not between", value1, value2, "certificationrime");
            return this;
        }

        public Criteria andCertificationralidityIsNull() {
            addCriterion("certificationRalidity is null");
            return this;
        }

        public Criteria andCertificationralidityIsNotNull() {
            addCriterion("certificationRalidity is not null");
            return this;
        }

        public Criteria andCertificationralidityEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRalidity =", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRalidity <>", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityGreaterThan(Date value) {
            addCriterionForJDBCDate("certificationRalidity >", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRalidity >=", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityLessThan(Date value) {
            addCriterionForJDBCDate("certificationRalidity <", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("certificationRalidity <=", value, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityIn(List<Date> values) {
            addCriterionForJDBCDate("certificationRalidity in", values, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("certificationRalidity not in", values, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certificationRalidity between", value1, value2, "certificationralidity");
            return this;
        }

        public Criteria andCertificationralidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("certificationRalidity not between", value1, value2, "certificationralidity");
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