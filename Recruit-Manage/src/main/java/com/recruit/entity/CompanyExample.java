package com.recruit.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNull() {
            addCriterion("company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNotNull() {
            addCriterion("company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualTo(String value) {
            addCriterion("company_logo =", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualTo(String value) {
            addCriterion("company_logo <>", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThan(String value) {
            addCriterion("company_logo >", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo >=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThan(String value) {
            addCriterion("company_logo <", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("company_logo <=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLike(String value) {
            addCriterion("company_logo like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotLike(String value) {
            addCriterion("company_logo not like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIn(List<String> values) {
            addCriterion("company_logo in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotIn(List<String> values) {
            addCriterion("company_logo not in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoBetween(String value1, String value2) {
            addCriterion("company_logo between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("company_logo not between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyStageIsNull() {
            addCriterion("company_stage is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStageIsNotNull() {
            addCriterion("company_stage is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStageEqualTo(String value) {
            addCriterion("company_stage =", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageNotEqualTo(String value) {
            addCriterion("company_stage <>", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageGreaterThan(String value) {
            addCriterion("company_stage >", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageGreaterThanOrEqualTo(String value) {
            addCriterion("company_stage >=", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageLessThan(String value) {
            addCriterion("company_stage <", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageLessThanOrEqualTo(String value) {
            addCriterion("company_stage <=", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageLike(String value) {
            addCriterion("company_stage like", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageNotLike(String value) {
            addCriterion("company_stage not like", value, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageIn(List<String> values) {
            addCriterion("company_stage in", values, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageNotIn(List<String> values) {
            addCriterion("company_stage not in", values, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageBetween(String value1, String value2) {
            addCriterion("company_stage between", value1, value2, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyStageNotBetween(String value1, String value2) {
            addCriterion("company_stage not between", value1, value2, "companyStage");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountIsNull() {
            addCriterion("company_emp_count is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountIsNotNull() {
            addCriterion("company_emp_count is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountEqualTo(String value) {
            addCriterion("company_emp_count =", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountNotEqualTo(String value) {
            addCriterion("company_emp_count <>", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountGreaterThan(String value) {
            addCriterion("company_emp_count >", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountGreaterThanOrEqualTo(String value) {
            addCriterion("company_emp_count >=", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountLessThan(String value) {
            addCriterion("company_emp_count <", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountLessThanOrEqualTo(String value) {
            addCriterion("company_emp_count <=", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountLike(String value) {
            addCriterion("company_emp_count like", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountNotLike(String value) {
            addCriterion("company_emp_count not like", value, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountIn(List<String> values) {
            addCriterion("company_emp_count in", values, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountNotIn(List<String> values) {
            addCriterion("company_emp_count not in", values, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountBetween(String value1, String value2) {
            addCriterion("company_emp_count between", value1, value2, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmpCountNotBetween(String value1, String value2) {
            addCriterion("company_emp_count not between", value1, value2, "companyEmpCount");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyIsNull() {
            addCriterion("company_industury is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyIsNotNull() {
            addCriterion("company_industury is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyEqualTo(String value) {
            addCriterion("company_industury =", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyNotEqualTo(String value) {
            addCriterion("company_industury <>", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyGreaterThan(String value) {
            addCriterion("company_industury >", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyGreaterThanOrEqualTo(String value) {
            addCriterion("company_industury >=", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyLessThan(String value) {
            addCriterion("company_industury <", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyLessThanOrEqualTo(String value) {
            addCriterion("company_industury <=", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyLike(String value) {
            addCriterion("company_industury like", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyNotLike(String value) {
            addCriterion("company_industury not like", value, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyIn(List<String> values) {
            addCriterion("company_industury in", values, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyNotIn(List<String> values) {
            addCriterion("company_industury not in", values, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyBetween(String value1, String value2) {
            addCriterion("company_industury between", value1, value2, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyIndusturyNotBetween(String value1, String value2) {
            addCriterion("company_industury not between", value1, value2, "companyIndustury");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNull() {
            addCriterion("company_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNotNull() {
            addCriterion("company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescEqualTo(String value) {
            addCriterion("company_desc =", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotEqualTo(String value) {
            addCriterion("company_desc <>", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThan(String value) {
            addCriterion("company_desc >", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_desc >=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThan(String value) {
            addCriterion("company_desc <", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("company_desc <=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLike(String value) {
            addCriterion("company_desc like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotLike(String value) {
            addCriterion("company_desc not like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIn(List<String> values) {
            addCriterion("company_desc in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotIn(List<String> values) {
            addCriterion("company_desc not in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescBetween(String value1, String value2) {
            addCriterion("company_desc between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotBetween(String value1, String value2) {
            addCriterion("company_desc not between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceIsNull() {
            addCriterion("company_addr_province is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceIsNotNull() {
            addCriterion("company_addr_province is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceEqualTo(String value) {
            addCriterion("company_addr_province =", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceNotEqualTo(String value) {
            addCriterion("company_addr_province <>", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceGreaterThan(String value) {
            addCriterion("company_addr_province >", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr_province >=", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceLessThan(String value) {
            addCriterion("company_addr_province <", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceLessThanOrEqualTo(String value) {
            addCriterion("company_addr_province <=", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceLike(String value) {
            addCriterion("company_addr_province like", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceNotLike(String value) {
            addCriterion("company_addr_province not like", value, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceIn(List<String> values) {
            addCriterion("company_addr_province in", values, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceNotIn(List<String> values) {
            addCriterion("company_addr_province not in", values, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceBetween(String value1, String value2) {
            addCriterion("company_addr_province between", value1, value2, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrProvinceNotBetween(String value1, String value2) {
            addCriterion("company_addr_province not between", value1, value2, "companyAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityIsNull() {
            addCriterion("company_addr_city is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityIsNotNull() {
            addCriterion("company_addr_city is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityEqualTo(String value) {
            addCriterion("company_addr_city =", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityNotEqualTo(String value) {
            addCriterion("company_addr_city <>", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityGreaterThan(String value) {
            addCriterion("company_addr_city >", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr_city >=", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityLessThan(String value) {
            addCriterion("company_addr_city <", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityLessThanOrEqualTo(String value) {
            addCriterion("company_addr_city <=", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityLike(String value) {
            addCriterion("company_addr_city like", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityNotLike(String value) {
            addCriterion("company_addr_city not like", value, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityIn(List<String> values) {
            addCriterion("company_addr_city in", values, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityNotIn(List<String> values) {
            addCriterion("company_addr_city not in", values, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityBetween(String value1, String value2) {
            addCriterion("company_addr_city between", value1, value2, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrCityNotBetween(String value1, String value2) {
            addCriterion("company_addr_city not between", value1, value2, "companyAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaIsNull() {
            addCriterion("company_addr_area is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaIsNotNull() {
            addCriterion("company_addr_area is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaEqualTo(String value) {
            addCriterion("company_addr_area =", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaNotEqualTo(String value) {
            addCriterion("company_addr_area <>", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaGreaterThan(String value) {
            addCriterion("company_addr_area >", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaGreaterThanOrEqualTo(String value) {
            addCriterion("company_addr_area >=", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaLessThan(String value) {
            addCriterion("company_addr_area <", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaLessThanOrEqualTo(String value) {
            addCriterion("company_addr_area <=", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaLike(String value) {
            addCriterion("company_addr_area like", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaNotLike(String value) {
            addCriterion("company_addr_area not like", value, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaIn(List<String> values) {
            addCriterion("company_addr_area in", values, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaNotIn(List<String> values) {
            addCriterion("company_addr_area not in", values, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaBetween(String value1, String value2) {
            addCriterion("company_addr_area between", value1, value2, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAddrAreaNotBetween(String value1, String value2) {
            addCriterion("company_addr_area not between", value1, value2, "companyAddrArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailIsNull() {
            addCriterion("company_adrr_detail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailIsNotNull() {
            addCriterion("company_adrr_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailEqualTo(String value) {
            addCriterion("company_adrr_detail =", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailNotEqualTo(String value) {
            addCriterion("company_adrr_detail <>", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailGreaterThan(String value) {
            addCriterion("company_adrr_detail >", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailGreaterThanOrEqualTo(String value) {
            addCriterion("company_adrr_detail >=", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailLessThan(String value) {
            addCriterion("company_adrr_detail <", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailLessThanOrEqualTo(String value) {
            addCriterion("company_adrr_detail <=", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailLike(String value) {
            addCriterion("company_adrr_detail like", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailNotLike(String value) {
            addCriterion("company_adrr_detail not like", value, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailIn(List<String> values) {
            addCriterion("company_adrr_detail in", values, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailNotIn(List<String> values) {
            addCriterion("company_adrr_detail not in", values, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailBetween(String value1, String value2) {
            addCriterion("company_adrr_detail between", value1, value2, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdrrDetailNotBetween(String value1, String value2) {
            addCriterion("company_adrr_detail not between", value1, value2, "companyAdrrDetail");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}