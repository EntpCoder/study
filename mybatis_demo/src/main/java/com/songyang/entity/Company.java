package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Company implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.213+08:00", comments="Source field: company.company_id")
    private Integer companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_name")
    private String companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_type")
    private String companyType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.compay_address")
    private String compayAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_introduction")
    private String companyIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.create_by")
    private String createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_size")
    private String companySize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_email")
    private String companyEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.is_delete")
    private Integer isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_telno")
    private Long companyTelno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.website_company")
    private String websiteCompany;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.longitude")
    private String longitude;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.pwd")
    private String pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_status")
    private Integer companyStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_industry")
    private String companyIndustry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xxx")
    private String xxx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source Table: company")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_name")
    public String getCompanyName() {
        return companyName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_type")
    public String getCompanyType() {
        return companyType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_type")
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.compay_address")
    public String getCompayAddress() {
        return compayAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.compay_address")
    public void setCompayAddress(String compayAddress) {
        this.compayAddress = compayAddress == null ? null : compayAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_introduction")
    public String getCompanyIntroduction() {
        return companyIntroduction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_introduction")
    public void setCompanyIntroduction(String companyIntroduction) {
        this.companyIntroduction = companyIntroduction == null ? null : companyIntroduction.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.create_by")
    public String getCreateBy() {
        return createBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.create_by")
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_size")
    public String getCompanySize() {
        return companySize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_size")
    public void setCompanySize(String companySize) {
        this.companySize = companySize == null ? null : companySize.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_email")
    public String getCompanyEmail() {
        return companyEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_email")
    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.is_delete")
    public Integer getIsDelete() {
        return isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.is_delete")
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_telno")
    public Long getCompanyTelno() {
        return companyTelno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.company_telno")
    public void setCompanyTelno(Long companyTelno) {
        this.companyTelno = companyTelno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.website_company")
    public String getWebsiteCompany() {
        return websiteCompany;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.website_company")
    public void setWebsiteCompany(String websiteCompany) {
        this.websiteCompany = websiteCompany == null ? null : websiteCompany.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.217+08:00", comments="Source field: company.longitude")
    public String getLongitude() {
        return longitude;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.pwd")
    public String getPwd() {
        return pwd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.pwd")
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_status")
    public Integer getCompanyStatus() {
        return companyStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_status")
    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_industry")
    public String getCompanyIndustry() {
        return companyIndustry;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.company_industry")
    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry == null ? null : companyIndustry.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xxx")
    public String getXxx() {
        return xxx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source field: company.xxx")
    public void setXxx(String xxx) {
        this.xxx = xxx == null ? null : xxx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.221+08:00", comments="Source Table: company")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyId=").append(companyId);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyType=").append(companyType);
        sb.append(", compayAddress=").append(compayAddress);
        sb.append(", companyIntroduction=").append(companyIntroduction);
        sb.append(", createBy=").append(createBy);
        sb.append(", companySize=").append(companySize);
        sb.append(", companyEmail=").append(companyEmail);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", companyTelno=").append(companyTelno);
        sb.append(", websiteCompany=").append(websiteCompany);
        sb.append(", longitude=").append(longitude);
        sb.append(", pwd=").append(pwd);
        sb.append(", companyStatus=").append(companyStatus);
        sb.append(", companyIndustry=").append(companyIndustry);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", xxx=").append(xxx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}