package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.TrainingExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import java.util.Date;
import java.util.List;

public class TrainingExample extends AbstractExample<TrainingExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public TrainingExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    public TrainingExample(TrainingExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table training
     *
     * @ibatorgenerated Sun Jun 20 22:44:16 CST 2010
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

        public Criteria andTrainnameIsNull() {
            addCriterion("trainName is null");
            return this;
        }

        public Criteria andTrainnameIsNotNull() {
            addCriterion("trainName is not null");
            return this;
        }

        public Criteria andTrainnameEqualTo(String value) {
            addCriterion("trainName =", value, "trainname");
            return this;
        }

        public Criteria andTrainnameNotEqualTo(String value) {
            addCriterion("trainName <>", value, "trainname");
            return this;
        }

        public Criteria andTrainnameGreaterThan(String value) {
            addCriterion("trainName >", value, "trainname");
            return this;
        }

        public Criteria andTrainnameGreaterThanOrEqualTo(String value) {
            addCriterion("trainName >=", value, "trainname");
            return this;
        }

        public Criteria andTrainnameLessThan(String value) {
            addCriterion("trainName <", value, "trainname");
            return this;
        }

        public Criteria andTrainnameLessThanOrEqualTo(String value) {
            addCriterion("trainName <=", value, "trainname");
            return this;
        }

        public Criteria andTrainnameLike(String value) {
            addCriterion("trainName like", value, "trainname");
            return this;
        }

        public Criteria andTrainnameNotLike(String value) {
            addCriterion("trainName not like", value, "trainname");
            return this;
        }

        public Criteria andTrainnameIn(List<String> values) {
            addCriterion("trainName in", values, "trainname");
            return this;
        }

        public Criteria andTrainnameNotIn(List<String> values) {
            addCriterion("trainName not in", values, "trainname");
            return this;
        }

        public Criteria andTrainnameBetween(String value1, String value2) {
            addCriterion("trainName between", value1, value2, "trainname");
            return this;
        }

        public Criteria andTrainnameNotBetween(String value1, String value2) {
            addCriterion("trainName not between", value1, value2, "trainname");
            return this;
        }

        public Criteria andTrainaddrIsNull() {
            addCriterion("trainAddr is null");
            return this;
        }

        public Criteria andTrainaddrIsNotNull() {
            addCriterion("trainAddr is not null");
            return this;
        }

        public Criteria andTrainaddrEqualTo(String value) {
            addCriterion("trainAddr =", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrNotEqualTo(String value) {
            addCriterion("trainAddr <>", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrGreaterThan(String value) {
            addCriterion("trainAddr >", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrGreaterThanOrEqualTo(String value) {
            addCriterion("trainAddr >=", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrLessThan(String value) {
            addCriterion("trainAddr <", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrLessThanOrEqualTo(String value) {
            addCriterion("trainAddr <=", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrLike(String value) {
            addCriterion("trainAddr like", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrNotLike(String value) {
            addCriterion("trainAddr not like", value, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrIn(List<String> values) {
            addCriterion("trainAddr in", values, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrNotIn(List<String> values) {
            addCriterion("trainAddr not in", values, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrBetween(String value1, String value2) {
            addCriterion("trainAddr between", value1, value2, "trainaddr");
            return this;
        }

        public Criteria andTrainaddrNotBetween(String value1, String value2) {
            addCriterion("trainAddr not between", value1, value2, "trainaddr");
            return this;
        }

        public Criteria andTrainduringIsNull() {
            addCriterion("trainDuring is null");
            return this;
        }

        public Criteria andTrainduringIsNotNull() {
            addCriterion("trainDuring is not null");
            return this;
        }

        public Criteria andTrainduringEqualTo(String value) {
            addCriterion("trainDuring =", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringNotEqualTo(String value) {
            addCriterion("trainDuring <>", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringGreaterThan(String value) {
            addCriterion("trainDuring >", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringGreaterThanOrEqualTo(String value) {
            addCriterion("trainDuring >=", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringLessThan(String value) {
            addCriterion("trainDuring <", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringLessThanOrEqualTo(String value) {
            addCriterion("trainDuring <=", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringLike(String value) {
            addCriterion("trainDuring like", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringNotLike(String value) {
            addCriterion("trainDuring not like", value, "trainduring");
            return this;
        }

        public Criteria andTrainduringIn(List<String> values) {
            addCriterion("trainDuring in", values, "trainduring");
            return this;
        }

        public Criteria andTrainduringNotIn(List<String> values) {
            addCriterion("trainDuring not in", values, "trainduring");
            return this;
        }

        public Criteria andTrainduringBetween(String value1, String value2) {
            addCriterion("trainDuring between", value1, value2, "trainduring");
            return this;
        }

        public Criteria andTrainduringNotBetween(String value1, String value2) {
            addCriterion("trainDuring not between", value1, value2, "trainduring");
            return this;
        }

        public Criteria andTraintypeenumidIsNull() {
            addCriterion("trainTypeEnumId is null");
            return this;
        }

        public Criteria andTraintypeenumidIsNotNull() {
            addCriterion("trainTypeEnumId is not null");
            return this;
        }

        public Criteria andTraintypeenumidEqualTo(String value) {
            addCriterion("trainTypeEnumId =", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidNotEqualTo(String value) {
            addCriterion("trainTypeEnumId <>", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidGreaterThan(String value) {
            addCriterion("trainTypeEnumId >", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidGreaterThanOrEqualTo(String value) {
            addCriterion("trainTypeEnumId >=", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidLessThan(String value) {
            addCriterion("trainTypeEnumId <", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidLessThanOrEqualTo(String value) {
            addCriterion("trainTypeEnumId <=", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidLike(String value) {
            addCriterion("trainTypeEnumId like", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidNotLike(String value) {
            addCriterion("trainTypeEnumId not like", value, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidIn(List<String> values) {
            addCriterion("trainTypeEnumId in", values, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidNotIn(List<String> values) {
            addCriterion("trainTypeEnumId not in", values, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidBetween(String value1, String value2) {
            addCriterion("trainTypeEnumId between", value1, value2, "traintypeenumid");
            return this;
        }

        public Criteria andTraintypeenumidNotBetween(String value1, String value2) {
            addCriterion("trainTypeEnumId not between", value1, value2, "traintypeenumid");
            return this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return this;
        }

        public Criteria andFeeEqualTo(Double value) {
            addCriterion("fee =", value, "fee");
            return this;
        }

        public Criteria andFeeNotEqualTo(Double value) {
            addCriterion("fee <>", value, "fee");
            return this;
        }

        public Criteria andFeeGreaterThan(Double value) {
            addCriterion("fee >", value, "fee");
            return this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fee >=", value, "fee");
            return this;
        }

        public Criteria andFeeLessThan(Double value) {
            addCriterion("fee <", value, "fee");
            return this;
        }

        public Criteria andFeeLessThanOrEqualTo(Double value) {
            addCriterion("fee <=", value, "fee");
            return this;
        }

        public Criteria andFeeIn(List<Double> values) {
            addCriterion("fee in", values, "fee");
            return this;
        }

        public Criteria andFeeNotIn(List<Double> values) {
            addCriterion("fee not in", values, "fee");
            return this;
        }

        public Criteria andFeeBetween(Double value1, Double value2) {
            addCriterion("fee between", value1, value2, "fee");
            return this;
        }

        public Criteria andFeeNotBetween(Double value1, Double value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return this;
        }

        public Criteria andPlanamountIsNull() {
            addCriterion("planAmount is null");
            return this;
        }

        public Criteria andPlanamountIsNotNull() {
            addCriterion("planAmount is not null");
            return this;
        }

        public Criteria andPlanamountEqualTo(Integer value) {
            addCriterion("planAmount =", value, "planamount");
            return this;
        }

        public Criteria andPlanamountNotEqualTo(Integer value) {
            addCriterion("planAmount <>", value, "planamount");
            return this;
        }

        public Criteria andPlanamountGreaterThan(Integer value) {
            addCriterion("planAmount >", value, "planamount");
            return this;
        }

        public Criteria andPlanamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("planAmount >=", value, "planamount");
            return this;
        }

        public Criteria andPlanamountLessThan(Integer value) {
            addCriterion("planAmount <", value, "planamount");
            return this;
        }

        public Criteria andPlanamountLessThanOrEqualTo(Integer value) {
            addCriterion("planAmount <=", value, "planamount");
            return this;
        }

        public Criteria andPlanamountIn(List<Integer> values) {
            addCriterion("planAmount in", values, "planamount");
            return this;
        }

        public Criteria andPlanamountNotIn(List<Integer> values) {
            addCriterion("planAmount not in", values, "planamount");
            return this;
        }

        public Criteria andPlanamountBetween(Integer value1, Integer value2) {
            addCriterion("planAmount between", value1, value2, "planamount");
            return this;
        }

        public Criteria andPlanamountNotBetween(Integer value1, Integer value2) {
            addCriterion("planAmount not between", value1, value2, "planamount");
            return this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andLastupdatetimestampIsNull() {
            addCriterion("lastupdatetimestamp is null");
            return this;
        }

        public Criteria andLastupdatetimestampIsNotNull() {
            addCriterion("lastupdatetimestamp is not null");
            return this;
        }

        public Criteria andLastupdatetimestampEqualTo(Date value) {
            addCriterion("lastupdatetimestamp =", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampNotEqualTo(Date value) {
            addCriterion("lastupdatetimestamp <>", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampGreaterThan(Date value) {
            addCriterion("lastupdatetimestamp >", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("lastupdatetimestamp >=", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampLessThan(Date value) {
            addCriterion("lastupdatetimestamp <", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampLessThanOrEqualTo(Date value) {
            addCriterion("lastupdatetimestamp <=", value, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampIn(List<Date> values) {
            addCriterion("lastupdatetimestamp in", values, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampNotIn(List<Date> values) {
            addCriterion("lastupdatetimestamp not in", values, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampBetween(Date value1, Date value2) {
            addCriterion("lastupdatetimestamp between", value1, value2, "lastupdatetimestamp");
            return this;
        }

        public Criteria andLastupdatetimestampNotBetween(Date value1, Date value2) {
            addCriterion("lastupdatetimestamp not between", value1, value2, "lastupdatetimestamp");
            return this;
        }
    }
}