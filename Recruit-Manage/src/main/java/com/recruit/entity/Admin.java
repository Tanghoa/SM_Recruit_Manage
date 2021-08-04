package com.recruit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer companyAdminId;

    private Integer companyId;

    private String companyAdminName;

    private Long companyAdminTelno;

    private String companyAdminEmail;

    private String companyAdminPassword;

    private Date companyAdminCreateTime;

    private Integer status;

    private String other1;

    private String other2;



    public Admin(Long companyAdminTelno,String companyAdminPassword ) {
        this.companyAdminTelno = companyAdminTelno;
        this.companyAdminPassword = companyAdminPassword;
    }

    public Admin(Integer companyId, String companyAdminName, Long companyAdminTelno, String companyAdminEmail, String companyAdminPassword,  Integer status) {
        this.companyId = companyId;
        this.companyAdminName = companyAdminName;
        this.companyAdminTelno = companyAdminTelno;
        this.companyAdminEmail = companyAdminEmail;
        this.companyAdminPassword = companyAdminPassword;

        this.status = status;
    }

    public Integer getCompanyAdminId() {
        return companyAdminId;
    }

    public void setCompanyAdminId(Integer companyAdminId) {
        this.companyAdminId = companyAdminId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyAdminName() {
        return companyAdminName;
    }

    public void setCompanyAdminName(String companyAdminName) {
        this.companyAdminName = companyAdminName == null ? null : companyAdminName.trim();
    }

    public Long getCompanyAdminTelno() {
        return companyAdminTelno;
    }

    public void setCompanyAdminTelno(Long companyAdminTelno) {
        this.companyAdminTelno = companyAdminTelno;
    }

    public String getCompanyAdminEmail() {
        return companyAdminEmail;
    }

    public void setCompanyAdminEmail(String companyAdminEmail) {
        this.companyAdminEmail = companyAdminEmail == null ? null : companyAdminEmail.trim();
    }

    public String getCompanyAdminPassword() {
        return companyAdminPassword;
    }

    public void setCompanyAdminPassword(String companyAdminPassword) {
        this.companyAdminPassword = companyAdminPassword == null ? null : companyAdminPassword.trim();
    }

    public Date getCompanyAdminCreateTime() {
        return companyAdminCreateTime;
    }

    public void setCompanyAdminCreateTime(Date companyAdminCreateTime) {
        this.companyAdminCreateTime = companyAdminCreateTime;
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