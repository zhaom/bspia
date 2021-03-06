package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.CandidatesExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import java.util.List;

public class CandidatesExample extends AbstractExample<CandidatesExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public CandidatesExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    public CandidatesExample(CandidatesExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table candidates
     *
     * @ibatorgenerated Tue May 04 11:41:32 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table candidates
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

        public Criteria andCardtypeenumidIsNull() {
            addCriterion("cardTypeEnumId is null");
            return this;
        }

        public Criteria andCardtypeenumidIsNotNull() {
            addCriterion("cardTypeEnumId is not null");
            return this;
        }

        public Criteria andCardtypeenumidEqualTo(String value) {
            addCriterion("cardTypeEnumId =", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidNotEqualTo(String value) {
            addCriterion("cardTypeEnumId <>", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidGreaterThan(String value) {
            addCriterion("cardTypeEnumId >", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidGreaterThanOrEqualTo(String value) {
            addCriterion("cardTypeEnumId >=", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidLessThan(String value) {
            addCriterion("cardTypeEnumId <", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidLessThanOrEqualTo(String value) {
            addCriterion("cardTypeEnumId <=", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidLike(String value) {
            addCriterion("cardTypeEnumId like", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidNotLike(String value) {
            addCriterion("cardTypeEnumId not like", value, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidIn(List<String> values) {
            addCriterion("cardTypeEnumId in", values, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidNotIn(List<String> values) {
            addCriterion("cardTypeEnumId not in", values, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidBetween(String value1, String value2) {
            addCriterion("cardTypeEnumId between", value1, value2, "cardtypeenumid");
            return this;
        }

        public Criteria andCardtypeenumidNotBetween(String value1, String value2) {
            addCriterion("cardTypeEnumId not between", value1, value2, "cardtypeenumid");
            return this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("cardNo is null");
            return this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("cardNo is not null");
            return this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("cardNo =", value, "cardno");
            return this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("cardNo <>", value, "cardno");
            return this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("cardNo >", value, "cardno");
            return this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("cardNo >=", value, "cardno");
            return this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("cardNo <", value, "cardno");
            return this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("cardNo <=", value, "cardno");
            return this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("cardNo like", value, "cardno");
            return this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("cardNo not like", value, "cardno");
            return this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("cardNo in", values, "cardno");
            return this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("cardNo not in", values, "cardno");
            return this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("cardNo between", value1, value2, "cardno");
            return this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("cardNo not between", value1, value2, "cardno");
            return this;
        }

        public Criteria andGenderenumidIsNull() {
            addCriterion("genderEnumId is null");
            return this;
        }

        public Criteria andGenderenumidIsNotNull() {
            addCriterion("genderEnumId is not null");
            return this;
        }

        public Criteria andGenderenumidEqualTo(String value) {
            addCriterion("genderEnumId =", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidNotEqualTo(String value) {
            addCriterion("genderEnumId <>", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidGreaterThan(String value) {
            addCriterion("genderEnumId >", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidGreaterThanOrEqualTo(String value) {
            addCriterion("genderEnumId >=", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidLessThan(String value) {
            addCriterion("genderEnumId <", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidLessThanOrEqualTo(String value) {
            addCriterion("genderEnumId <=", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidLike(String value) {
            addCriterion("genderEnumId like", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidNotLike(String value) {
            addCriterion("genderEnumId not like", value, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidIn(List<String> values) {
            addCriterion("genderEnumId in", values, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidNotIn(List<String> values) {
            addCriterion("genderEnumId not in", values, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidBetween(String value1, String value2) {
            addCriterion("genderEnumId between", value1, value2, "genderenumid");
            return this;
        }

        public Criteria andGenderenumidNotBetween(String value1, String value2) {
            addCriterion("genderEnumId not between", value1, value2, "genderenumid");
            return this;
        }

        public Criteria andNationalityenumidIsNull() {
            addCriterion("nationalityEnumId is null");
            return this;
        }

        public Criteria andNationalityenumidIsNotNull() {
            addCriterion("nationalityEnumId is not null");
            return this;
        }

        public Criteria andNationalityenumidEqualTo(String value) {
            addCriterion("nationalityEnumId =", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidNotEqualTo(String value) {
            addCriterion("nationalityEnumId <>", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidGreaterThan(String value) {
            addCriterion("nationalityEnumId >", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidGreaterThanOrEqualTo(String value) {
            addCriterion("nationalityEnumId >=", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidLessThan(String value) {
            addCriterion("nationalityEnumId <", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidLessThanOrEqualTo(String value) {
            addCriterion("nationalityEnumId <=", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidLike(String value) {
            addCriterion("nationalityEnumId like", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidNotLike(String value) {
            addCriterion("nationalityEnumId not like", value, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidIn(List<String> values) {
            addCriterion("nationalityEnumId in", values, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidNotIn(List<String> values) {
            addCriterion("nationalityEnumId not in", values, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidBetween(String value1, String value2) {
            addCriterion("nationalityEnumId between", value1, value2, "nationalityenumid");
            return this;
        }

        public Criteria andNationalityenumidNotBetween(String value1, String value2) {
            addCriterion("nationalityEnumId not between", value1, value2, "nationalityenumid");
            return this;
        }

        public Criteria andEducationenumidIsNull() {
            addCriterion("educationEnumId is null");
            return this;
        }

        public Criteria andEducationenumidIsNotNull() {
            addCriterion("educationEnumId is not null");
            return this;
        }

        public Criteria andEducationenumidEqualTo(String value) {
            addCriterion("educationEnumId =", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidNotEqualTo(String value) {
            addCriterion("educationEnumId <>", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidGreaterThan(String value) {
            addCriterion("educationEnumId >", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidGreaterThanOrEqualTo(String value) {
            addCriterion("educationEnumId >=", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidLessThan(String value) {
            addCriterion("educationEnumId <", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidLessThanOrEqualTo(String value) {
            addCriterion("educationEnumId <=", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidLike(String value) {
            addCriterion("educationEnumId like", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidNotLike(String value) {
            addCriterion("educationEnumId not like", value, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidIn(List<String> values) {
            addCriterion("educationEnumId in", values, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidNotIn(List<String> values) {
            addCriterion("educationEnumId not in", values, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidBetween(String value1, String value2) {
            addCriterion("educationEnumId between", value1, value2, "educationenumid");
            return this;
        }

        public Criteria andEducationenumidNotBetween(String value1, String value2) {
            addCriterion("educationEnumId not between", value1, value2, "educationenumid");
            return this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return this;
        }

        public Criteria andPoliticalenumidIsNull() {
            addCriterion("politicalEnumId is null");
            return this;
        }

        public Criteria andPoliticalenumidIsNotNull() {
            addCriterion("politicalEnumId is not null");
            return this;
        }

        public Criteria andPoliticalenumidEqualTo(String value) {
            addCriterion("politicalEnumId =", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidNotEqualTo(String value) {
            addCriterion("politicalEnumId <>", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidGreaterThan(String value) {
            addCriterion("politicalEnumId >", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidGreaterThanOrEqualTo(String value) {
            addCriterion("politicalEnumId >=", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidLessThan(String value) {
            addCriterion("politicalEnumId <", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidLessThanOrEqualTo(String value) {
            addCriterion("politicalEnumId <=", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidLike(String value) {
            addCriterion("politicalEnumId like", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidNotLike(String value) {
            addCriterion("politicalEnumId not like", value, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidIn(List<String> values) {
            addCriterion("politicalEnumId in", values, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidNotIn(List<String> values) {
            addCriterion("politicalEnumId not in", values, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidBetween(String value1, String value2) {
            addCriterion("politicalEnumId between", value1, value2, "politicalenumid");
            return this;
        }

        public Criteria andPoliticalenumidNotBetween(String value1, String value2) {
            addCriterion("politicalEnumId not between", value1, value2, "politicalenumid");
            return this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return this;
        }

        public Criteria andTeleIsNull() {
            addCriterion("tele is null");
            return this;
        }

        public Criteria andTeleIsNotNull() {
            addCriterion("tele is not null");
            return this;
        }

        public Criteria andTeleEqualTo(String value) {
            addCriterion("tele =", value, "tele");
            return this;
        }

        public Criteria andTeleNotEqualTo(String value) {
            addCriterion("tele <>", value, "tele");
            return this;
        }

        public Criteria andTeleGreaterThan(String value) {
            addCriterion("tele >", value, "tele");
            return this;
        }

        public Criteria andTeleGreaterThanOrEqualTo(String value) {
            addCriterion("tele >=", value, "tele");
            return this;
        }

        public Criteria andTeleLessThan(String value) {
            addCriterion("tele <", value, "tele");
            return this;
        }

        public Criteria andTeleLessThanOrEqualTo(String value) {
            addCriterion("tele <=", value, "tele");
            return this;
        }

        public Criteria andTeleLike(String value) {
            addCriterion("tele like", value, "tele");
            return this;
        }

        public Criteria andTeleNotLike(String value) {
            addCriterion("tele not like", value, "tele");
            return this;
        }

        public Criteria andTeleIn(List<String> values) {
            addCriterion("tele in", values, "tele");
            return this;
        }

        public Criteria andTeleNotIn(List<String> values) {
            addCriterion("tele not in", values, "tele");
            return this;
        }

        public Criteria andTeleBetween(String value1, String value2) {
            addCriterion("tele between", value1, value2, "tele");
            return this;
        }

        public Criteria andTeleNotBetween(String value1, String value2) {
            addCriterion("tele not between", value1, value2, "tele");
            return this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilePhone is null");
            return this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilePhone is not null");
            return this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilePhone =", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilePhone <>", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilePhone >", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilePhone >=", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilePhone <", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilePhone <=", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilePhone like", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilePhone not like", value, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilePhone in", values, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilePhone not in", values, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilePhone between", value1, value2, "mobilephone");
            return this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilePhone not between", value1, value2, "mobilephone");
            return this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("workplace is null");
            return this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("workplace is not null");
            return this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("workplace =", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("workplace <>", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("workplace >", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("workplace >=", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("workplace <", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("workplace <=", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("workplace like", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("workplace not like", value, "workplace");
            return this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("workplace in", values, "workplace");
            return this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("workplace not in", values, "workplace");
            return this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("workplace between", value1, value2, "workplace");
            return this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("workplace not between", value1, value2, "workplace");
            return this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipCode is null");
            return this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipCode is not null");
            return this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipCode =", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipCode <>", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipCode >", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipCode >=", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipCode <", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipCode <=", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipCode like", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipCode not like", value, "zipcode");
            return this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipCode in", values, "zipcode");
            return this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipCode not in", values, "zipcode");
            return this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipCode between", value1, value2, "zipcode");
            return this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipCode not between", value1, value2, "zipcode");
            return this;
        }

        public Criteria andSecuritybelongIsNull() {
            addCriterion("securityBelong is null");
            return this;
        }

        public Criteria andSecuritybelongIsNotNull() {
            addCriterion("securityBelong is not null");
            return this;
        }

        public Criteria andSecuritybelongEqualTo(String value) {
            addCriterion("securityBelong =", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongNotEqualTo(String value) {
            addCriterion("securityBelong <>", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongGreaterThan(String value) {
            addCriterion("securityBelong >", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongGreaterThanOrEqualTo(String value) {
            addCriterion("securityBelong >=", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongLessThan(String value) {
            addCriterion("securityBelong <", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongLessThanOrEqualTo(String value) {
            addCriterion("securityBelong <=", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongLike(String value) {
            addCriterion("securityBelong like", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongNotLike(String value) {
            addCriterion("securityBelong not like", value, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongIn(List<String> values) {
            addCriterion("securityBelong in", values, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongNotIn(List<String> values) {
            addCriterion("securityBelong not in", values, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongBetween(String value1, String value2) {
            addCriterion("securityBelong between", value1, value2, "securitybelong");
            return this;
        }

        public Criteria andSecuritybelongNotBetween(String value1, String value2) {
            addCriterion("securityBelong not between", value1, value2, "securitybelong");
            return this;
        }
    }
}