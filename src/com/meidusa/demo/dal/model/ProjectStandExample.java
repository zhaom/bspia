package com.meidusa.demo.dal.model;

import com.meidusa.demo.dal.model.ProjectStandExample;
import com.meidusa.toolkit.dal.ibator.AbstractExample;
import java.util.Date;
import java.util.List;

public class ProjectStandExample extends AbstractExample<ProjectStandExample.Criteria> {

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table projectstand
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    public ProjectStandExample() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table projectstand
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    public ProjectStandExample(ProjectStandExample example) {
        super(example);
    }

    /**
     * This method was generated by Apache iBATIS Ibator.
     * This method corresponds to the database table projectstand
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This class was generated by Apache iBATIS Ibator.
     * This class corresponds to the database table projectstand
     *
     * @ibatorgenerated Fri Jul 12 23:54:18 CST 2013
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

        public Criteria andEnterprisenameIsNull() {
            addCriterion("enterprisename is null");
            return this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("enterprisename is not null");
            return this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("enterprisename =", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("enterprisename <>", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("enterprisename >", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprisename >=", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("enterprisename <", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("enterprisename <=", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("enterprisename like", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("enterprisename not like", value, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("enterprisename in", values, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("enterprisename not in", values, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("enterprisename between", value1, value2, "enterprisename");
            return this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("enterprisename not between", value1, value2, "enterprisename");
            return this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return this;
        }

        public Criteria andProjectsizeIsNull() {
            addCriterion("projectsize is null");
            return this;
        }

        public Criteria andProjectsizeIsNotNull() {
            addCriterion("projectsize is not null");
            return this;
        }

        public Criteria andProjectsizeEqualTo(String value) {
            addCriterion("projectsize =", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeNotEqualTo(String value) {
            addCriterion("projectsize <>", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeGreaterThan(String value) {
            addCriterion("projectsize >", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeGreaterThanOrEqualTo(String value) {
            addCriterion("projectsize >=", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeLessThan(String value) {
            addCriterion("projectsize <", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeLessThanOrEqualTo(String value) {
            addCriterion("projectsize <=", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeLike(String value) {
            addCriterion("projectsize like", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeNotLike(String value) {
            addCriterion("projectsize not like", value, "projectsize");
            return this;
        }

        public Criteria andProjectsizeIn(List<String> values) {
            addCriterion("projectsize in", values, "projectsize");
            return this;
        }

        public Criteria andProjectsizeNotIn(List<String> values) {
            addCriterion("projectsize not in", values, "projectsize");
            return this;
        }

        public Criteria andProjectsizeBetween(String value1, String value2) {
            addCriterion("projectsize between", value1, value2, "projectsize");
            return this;
        }

        public Criteria andProjectsizeNotBetween(String value1, String value2) {
            addCriterion("projectsize not between", value1, value2, "projectsize");
            return this;
        }

        public Criteria andCompletetimeIsNull() {
            addCriterion("completetime is null");
            return this;
        }

        public Criteria andCompletetimeIsNotNull() {
            addCriterion("completetime is not null");
            return this;
        }

        public Criteria andCompletetimeEqualTo(String value) {
            addCriterion("completetime =", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeNotEqualTo(String value) {
            addCriterion("completetime <>", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeGreaterThan(String value) {
            addCriterion("completetime >", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeGreaterThanOrEqualTo(String value) {
            addCriterion("completetime >=", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeLessThan(String value) {
            addCriterion("completetime <", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeLessThanOrEqualTo(String value) {
            addCriterion("completetime <=", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeLike(String value) {
            addCriterion("completetime like", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeNotLike(String value) {
            addCriterion("completetime not like", value, "completetime");
            return this;
        }

        public Criteria andCompletetimeIn(List<String> values) {
            addCriterion("completetime in", values, "completetime");
            return this;
        }

        public Criteria andCompletetimeNotIn(List<String> values) {
            addCriterion("completetime not in", values, "completetime");
            return this;
        }

        public Criteria andCompletetimeBetween(String value1, String value2) {
            addCriterion("completetime between", value1, value2, "completetime");
            return this;
        }

        public Criteria andCompletetimeNotBetween(String value1, String value2) {
            addCriterion("completetime not between", value1, value2, "completetime");
            return this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("contractamount is null");
            return this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("contractamount is not null");
            return this;
        }

        public Criteria andContractamountEqualTo(String value) {
            addCriterion("contractamount =", value, "contractamount");
            return this;
        }

        public Criteria andContractamountNotEqualTo(String value) {
            addCriterion("contractamount <>", value, "contractamount");
            return this;
        }

        public Criteria andContractamountGreaterThan(String value) {
            addCriterion("contractamount >", value, "contractamount");
            return this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(String value) {
            addCriterion("contractamount >=", value, "contractamount");
            return this;
        }

        public Criteria andContractamountLessThan(String value) {
            addCriterion("contractamount <", value, "contractamount");
            return this;
        }

        public Criteria andContractamountLessThanOrEqualTo(String value) {
            addCriterion("contractamount <=", value, "contractamount");
            return this;
        }

        public Criteria andContractamountLike(String value) {
            addCriterion("contractamount like", value, "contractamount");
            return this;
        }

        public Criteria andContractamountNotLike(String value) {
            addCriterion("contractamount not like", value, "contractamount");
            return this;
        }

        public Criteria andContractamountIn(List<String> values) {
            addCriterion("contractamount in", values, "contractamount");
            return this;
        }

        public Criteria andContractamountNotIn(List<String> values) {
            addCriterion("contractamount not in", values, "contractamount");
            return this;
        }

        public Criteria andContractamountBetween(String value1, String value2) {
            addCriterion("contractamount between", value1, value2, "contractamount");
            return this;
        }

        public Criteria andContractamountNotBetween(String value1, String value2) {
            addCriterion("contractamount not between", value1, value2, "contractamount");
            return this;
        }

        public Criteria andSpamountIsNull() {
            addCriterion("spamount is null");
            return this;
        }

        public Criteria andSpamountIsNotNull() {
            addCriterion("spamount is not null");
            return this;
        }

        public Criteria andSpamountEqualTo(String value) {
            addCriterion("spamount =", value, "spamount");
            return this;
        }

        public Criteria andSpamountNotEqualTo(String value) {
            addCriterion("spamount <>", value, "spamount");
            return this;
        }

        public Criteria andSpamountGreaterThan(String value) {
            addCriterion("spamount >", value, "spamount");
            return this;
        }

        public Criteria andSpamountGreaterThanOrEqualTo(String value) {
            addCriterion("spamount >=", value, "spamount");
            return this;
        }

        public Criteria andSpamountLessThan(String value) {
            addCriterion("spamount <", value, "spamount");
            return this;
        }

        public Criteria andSpamountLessThanOrEqualTo(String value) {
            addCriterion("spamount <=", value, "spamount");
            return this;
        }

        public Criteria andSpamountLike(String value) {
            addCriterion("spamount like", value, "spamount");
            return this;
        }

        public Criteria andSpamountNotLike(String value) {
            addCriterion("spamount not like", value, "spamount");
            return this;
        }

        public Criteria andSpamountIn(List<String> values) {
            addCriterion("spamount in", values, "spamount");
            return this;
        }

        public Criteria andSpamountNotIn(List<String> values) {
            addCriterion("spamount not in", values, "spamount");
            return this;
        }

        public Criteria andSpamountBetween(String value1, String value2) {
            addCriterion("spamount between", value1, value2, "spamount");
            return this;
        }

        public Criteria andSpamountNotBetween(String value1, String value2) {
            addCriterion("spamount not between", value1, value2, "spamount");
            return this;
        }

        public Criteria andSystemosIsNull() {
            addCriterion("systemos is null");
            return this;
        }

        public Criteria andSystemosIsNotNull() {
            addCriterion("systemos is not null");
            return this;
        }

        public Criteria andSystemosEqualTo(String value) {
            addCriterion("systemos =", value, "systemos");
            return this;
        }

        public Criteria andSystemosNotEqualTo(String value) {
            addCriterion("systemos <>", value, "systemos");
            return this;
        }

        public Criteria andSystemosGreaterThan(String value) {
            addCriterion("systemos >", value, "systemos");
            return this;
        }

        public Criteria andSystemosGreaterThanOrEqualTo(String value) {
            addCriterion("systemos >=", value, "systemos");
            return this;
        }

        public Criteria andSystemosLessThan(String value) {
            addCriterion("systemos <", value, "systemos");
            return this;
        }

        public Criteria andSystemosLessThanOrEqualTo(String value) {
            addCriterion("systemos <=", value, "systemos");
            return this;
        }

        public Criteria andSystemosLike(String value) {
            addCriterion("systemos like", value, "systemos");
            return this;
        }

        public Criteria andSystemosNotLike(String value) {
            addCriterion("systemos not like", value, "systemos");
            return this;
        }

        public Criteria andSystemosIn(List<String> values) {
            addCriterion("systemos in", values, "systemos");
            return this;
        }

        public Criteria andSystemosNotIn(List<String> values) {
            addCriterion("systemos not in", values, "systemos");
            return this;
        }

        public Criteria andSystemosBetween(String value1, String value2) {
            addCriterion("systemos between", value1, value2, "systemos");
            return this;
        }

        public Criteria andSystemosNotBetween(String value1, String value2) {
            addCriterion("systemos not between", value1, value2, "systemos");
            return this;
        }

        public Criteria andApplydomainIsNull() {
            addCriterion("applydomain is null");
            return this;
        }

        public Criteria andApplydomainIsNotNull() {
            addCriterion("applydomain is not null");
            return this;
        }

        public Criteria andApplydomainEqualTo(String value) {
            addCriterion("applydomain =", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainNotEqualTo(String value) {
            addCriterion("applydomain <>", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainGreaterThan(String value) {
            addCriterion("applydomain >", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainGreaterThanOrEqualTo(String value) {
            addCriterion("applydomain >=", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainLessThan(String value) {
            addCriterion("applydomain <", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainLessThanOrEqualTo(String value) {
            addCriterion("applydomain <=", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainLike(String value) {
            addCriterion("applydomain like", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainNotLike(String value) {
            addCriterion("applydomain not like", value, "applydomain");
            return this;
        }

        public Criteria andApplydomainIn(List<String> values) {
            addCriterion("applydomain in", values, "applydomain");
            return this;
        }

        public Criteria andApplydomainNotIn(List<String> values) {
            addCriterion("applydomain not in", values, "applydomain");
            return this;
        }

        public Criteria andApplydomainBetween(String value1, String value2) {
            addCriterion("applydomain between", value1, value2, "applydomain");
            return this;
        }

        public Criteria andApplydomainNotBetween(String value1, String value2) {
            addCriterion("applydomain not between", value1, value2, "applydomain");
            return this;
        }

        public Criteria andSppercentIsNull() {
            addCriterion("sppercent is null");
            return this;
        }

        public Criteria andSppercentIsNotNull() {
            addCriterion("sppercent is not null");
            return this;
        }

        public Criteria andSppercentEqualTo(String value) {
            addCriterion("sppercent =", value, "sppercent");
            return this;
        }

        public Criteria andSppercentNotEqualTo(String value) {
            addCriterion("sppercent <>", value, "sppercent");
            return this;
        }

        public Criteria andSppercentGreaterThan(String value) {
            addCriterion("sppercent >", value, "sppercent");
            return this;
        }

        public Criteria andSppercentGreaterThanOrEqualTo(String value) {
            addCriterion("sppercent >=", value, "sppercent");
            return this;
        }

        public Criteria andSppercentLessThan(String value) {
            addCriterion("sppercent <", value, "sppercent");
            return this;
        }

        public Criteria andSppercentLessThanOrEqualTo(String value) {
            addCriterion("sppercent <=", value, "sppercent");
            return this;
        }

        public Criteria andSppercentLike(String value) {
            addCriterion("sppercent like", value, "sppercent");
            return this;
        }

        public Criteria andSppercentNotLike(String value) {
            addCriterion("sppercent not like", value, "sppercent");
            return this;
        }

        public Criteria andSppercentIn(List<String> values) {
            addCriterion("sppercent in", values, "sppercent");
            return this;
        }

        public Criteria andSppercentNotIn(List<String> values) {
            addCriterion("sppercent not in", values, "sppercent");
            return this;
        }

        public Criteria andSppercentBetween(String value1, String value2) {
            addCriterion("sppercent between", value1, value2, "sppercent");
            return this;
        }

        public Criteria andSppercentNotBetween(String value1, String value2) {
            addCriterion("sppercent not between", value1, value2, "sppercent");
            return this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return this;
        }

        public Criteria andCameracountIsNull() {
            addCriterion("cameracount is null");
            return this;
        }

        public Criteria andCameracountIsNotNull() {
            addCriterion("cameracount is not null");
            return this;
        }

        public Criteria andCameracountEqualTo(String value) {
            addCriterion("cameracount =", value, "cameracount");
            return this;
        }

        public Criteria andCameracountNotEqualTo(String value) {
            addCriterion("cameracount <>", value, "cameracount");
            return this;
        }

        public Criteria andCameracountGreaterThan(String value) {
            addCriterion("cameracount >", value, "cameracount");
            return this;
        }

        public Criteria andCameracountGreaterThanOrEqualTo(String value) {
            addCriterion("cameracount >=", value, "cameracount");
            return this;
        }

        public Criteria andCameracountLessThan(String value) {
            addCriterion("cameracount <", value, "cameracount");
            return this;
        }

        public Criteria andCameracountLessThanOrEqualTo(String value) {
            addCriterion("cameracount <=", value, "cameracount");
            return this;
        }

        public Criteria andCameracountLike(String value) {
            addCriterion("cameracount like", value, "cameracount");
            return this;
        }

        public Criteria andCameracountNotLike(String value) {
            addCriterion("cameracount not like", value, "cameracount");
            return this;
        }

        public Criteria andCameracountIn(List<String> values) {
            addCriterion("cameracount in", values, "cameracount");
            return this;
        }

        public Criteria andCameracountNotIn(List<String> values) {
            addCriterion("cameracount not in", values, "cameracount");
            return this;
        }

        public Criteria andCameracountBetween(String value1, String value2) {
            addCriterion("cameracount between", value1, value2, "cameracount");
            return this;
        }

        public Criteria andCameracountNotBetween(String value1, String value2) {
            addCriterion("cameracount not between", value1, value2, "cameracount");
            return this;
        }

        public Criteria andLastupdatedateIsNull() {
            addCriterion("lastupdatedate is null");
            return this;
        }

        public Criteria andLastupdatedateIsNotNull() {
            addCriterion("lastupdatedate is not null");
            return this;
        }

        public Criteria andLastupdatedateEqualTo(Date value) {
            addCriterion("lastupdatedate =", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateNotEqualTo(Date value) {
            addCriterion("lastupdatedate <>", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateGreaterThan(Date value) {
            addCriterion("lastupdatedate >", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastupdatedate >=", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateLessThan(Date value) {
            addCriterion("lastupdatedate <", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateLessThanOrEqualTo(Date value) {
            addCriterion("lastupdatedate <=", value, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateIn(List<Date> values) {
            addCriterion("lastupdatedate in", values, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateNotIn(List<Date> values) {
            addCriterion("lastupdatedate not in", values, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateBetween(Date value1, Date value2) {
            addCriterion("lastupdatedate between", value1, value2, "lastupdatedate");
            return this;
        }

        public Criteria andLastupdatedateNotBetween(Date value1, Date value2) {
            addCriterion("lastupdatedate not between", value1, value2, "lastupdatedate");
            return this;
        }
    }
}