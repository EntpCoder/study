package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class PersonalLog implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_per_id")
    private Integer loginPerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.per_id")
    private Integer perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_type")
    private String loginType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_ip")
    private String loginIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_time")
    private Date loginTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.personal_log")
    private Integer personalLog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.person_log_status")
    private Integer personLogStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: personal_log")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_per_id")
    public Integer getLoginPerId() {
        return loginPerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_per_id")
    public void setLoginPerId(Integer loginPerId) {
        this.loginPerId = loginPerId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.per_id")
    public Integer getPerId() {
        return perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.per_id")
    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_type")
    public String getLoginType() {
        return loginType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_type")
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_ip")
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_time")
    public Date getLoginTime() {
        return loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_time")
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.personal_log")
    public Integer getPersonalLog() {
        return personalLog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.personal_log")
    public void setPersonalLog(Integer personalLog) {
        this.personalLog = personalLog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.person_log_status")
    public Integer getPersonLogStatus() {
        return personLogStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.person_log_status")
    public void setPersonLogStatus(Integer personLogStatus) {
        this.personLogStatus = personLogStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: personal_log")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginPerId=").append(loginPerId);
        sb.append(", perId=").append(perId);
        sb.append(", loginType=").append(loginType);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", personalLog=").append(personalLog);
        sb.append(", personLogStatus=").append(personLogStatus);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}