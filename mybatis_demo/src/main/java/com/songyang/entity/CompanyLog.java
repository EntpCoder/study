package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class CompanyLog implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_company_id")
    private Integer loginCompanyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_id")
    private Integer companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_type")
    private String loginType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_ip")
    private String loginIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_time")
    private Date loginTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_log_status")
    private Integer companyLogStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_company_id")
    public Integer getLoginCompanyId() {
        return loginCompanyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_company_id")
    public void setLoginCompanyId(Integer loginCompanyId) {
        this.loginCompanyId = loginCompanyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_type")
    public String getLoginType() {
        return loginType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_type")
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_ip")
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_time")
    public Date getLoginTime() {
        return loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_time")
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_log_status")
    public Integer getCompanyLogStatus() {
        return companyLogStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_log_status")
    public void setCompanyLogStatus(Integer companyLogStatus) {
        this.companyLogStatus = companyLogStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginCompanyId=").append(loginCompanyId);
        sb.append(", companyId=").append(companyId);
        sb.append(", loginType=").append(loginType);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", companyLogStatus=").append(companyLogStatus);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}