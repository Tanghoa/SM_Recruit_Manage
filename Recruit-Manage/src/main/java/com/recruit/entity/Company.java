package com.recruit.entity;

public class Company {
    private Integer companyId;

    private String companyName;

    private String companyLogo;

    private String companyStage;

    private String companyEmpCount;

    private String companyIndustury;

    private String companyDesc;

    private String companyWebsite;

    private String companyAddrProvince;

    private String companyAddrCity;

    private String companyAddrArea;

    private String companyAdrrDetail;

    private Integer status;

    private String other1;

    private String other2;



    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyStage() {
        return companyStage;
    }

    public void setCompanyStage(String companyStage) {
        this.companyStage = companyStage == null ? null : companyStage.trim();
    }

    public String getCompanyEmpCount() {
        return companyEmpCount;
    }

    public void setCompanyEmpCount(String companyEmpCount) {
        this.companyEmpCount = companyEmpCount == null ? null : companyEmpCount.trim();
    }

    public String getCompanyIndustury() {
        return companyIndustury;
    }

    public void setCompanyIndustury(String companyIndustury) {
        this.companyIndustury = companyIndustury == null ? null : companyIndustury.trim();
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc == null ? null : companyDesc.trim();
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite == null ? null : companyWebsite.trim();
    }

    public String getCompanyAddrProvince() {
        return companyAddrProvince;
    }

    public void setCompanyAddrProvince(String companyAddrProvince) {
        this.companyAddrProvince = companyAddrProvince == null ? null : companyAddrProvince.trim();
    }

    public String getCompanyAddrCity() {
        return companyAddrCity;
    }

    public void setCompanyAddrCity(String companyAddrCity) {
        this.companyAddrCity = companyAddrCity == null ? null : companyAddrCity.trim();
    }

    public String getCompanyAddrArea() {
        return companyAddrArea;
    }

    public void setCompanyAddrArea(String companyAddrArea) {
        this.companyAddrArea = companyAddrArea == null ? null : companyAddrArea.trim();
    }

    public String getCompanyAdrrDetail() {
        return companyAdrrDetail;
    }

    public void setCompanyAdrrDetail(String companyAdrrDetail) {
        this.companyAdrrDetail = companyAdrrDetail == null ? null : companyAdrrDetail.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }
}