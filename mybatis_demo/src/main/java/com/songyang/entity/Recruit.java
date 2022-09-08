package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Recruit implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_id")
    private Integer recId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.company_id")
    private Integer companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_salary")
    private String recJobSalary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_address")
    private String recJobAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_experience")
    private String recJobExperience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.education")
    private String education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.myskill")
    private String myskill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_introduction")
    private String jobIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_demand")
    private String jobDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_create_time")
    private Date recCreateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_end_time")
    private Date recEndTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.kwd")
    private String kwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.recruit_status")
    private Integer recruitStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_per_num")
    private Integer recPerNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_name")
    private String recName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: recruit")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_id")
    public Integer getRecId() {
        return recId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_id")
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_salary")
    public String getRecJobSalary() {
        return recJobSalary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_salary")
    public void setRecJobSalary(String recJobSalary) {
        this.recJobSalary = recJobSalary == null ? null : recJobSalary.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_address")
    public String getRecJobAddress() {
        return recJobAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_address")
    public void setRecJobAddress(String recJobAddress) {
        this.recJobAddress = recJobAddress == null ? null : recJobAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_experience")
    public String getRecJobExperience() {
        return recJobExperience;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_experience")
    public void setRecJobExperience(String recJobExperience) {
        this.recJobExperience = recJobExperience == null ? null : recJobExperience.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.education")
    public String getEducation() {
        return education;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.education")
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.myskill")
    public String getMyskill() {
        return myskill;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.myskill")
    public void setMyskill(String myskill) {
        this.myskill = myskill == null ? null : myskill.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_introduction")
    public String getJobIntroduction() {
        return jobIntroduction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_introduction")
    public void setJobIntroduction(String jobIntroduction) {
        this.jobIntroduction = jobIntroduction == null ? null : jobIntroduction.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_demand")
    public String getJobDemand() {
        return jobDemand;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.job_demand")
    public void setJobDemand(String jobDemand) {
        this.jobDemand = jobDemand == null ? null : jobDemand.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_create_time")
    public Date getRecCreateTime() {
        return recCreateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_create_time")
    public void setRecCreateTime(Date recCreateTime) {
        this.recCreateTime = recCreateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_end_time")
    public Date getRecEndTime() {
        return recEndTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_end_time")
    public void setRecEndTime(Date recEndTime) {
        this.recEndTime = recEndTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.kwd")
    public String getKwd() {
        return kwd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.kwd")
    public void setKwd(String kwd) {
        this.kwd = kwd == null ? null : kwd.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.recruit_status")
    public Integer getRecruitStatus() {
        return recruitStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.recruit_status")
    public void setRecruitStatus(Integer recruitStatus) {
        this.recruitStatus = recruitStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_per_num")
    public Integer getRecPerNum() {
        return recPerNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_per_num")
    public void setRecPerNum(Integer recPerNum) {
        this.recPerNum = recPerNum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_name")
    public String getRecName() {
        return recName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_name")
    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: recruit")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recId=").append(recId);
        sb.append(", companyId=").append(companyId);
        sb.append(", recJobSalary=").append(recJobSalary);
        sb.append(", recJobAddress=").append(recJobAddress);
        sb.append(", recJobExperience=").append(recJobExperience);
        sb.append(", education=").append(education);
        sb.append(", myskill=").append(myskill);
        sb.append(", jobIntroduction=").append(jobIntroduction);
        sb.append(", jobDemand=").append(jobDemand);
        sb.append(", recCreateTime=").append(recCreateTime);
        sb.append(", recEndTime=").append(recEndTime);
        sb.append(", kwd=").append(kwd);
        sb.append(", recruitStatus=").append(recruitStatus);
        sb.append(", recPerNum=").append(recPerNum);
        sb.append(", recName=").append(recName);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}