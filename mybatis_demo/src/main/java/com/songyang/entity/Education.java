package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Education implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_id")
    private Integer eduId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_school")
    private String eduSchool;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_degree")
    private String eduDegree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_sub_major")
    private String eduSubMajor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_start")
    private Date eduTimeStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_end")
    private Date eduTimeEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.resume_id")
    private Integer resumeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.education_status")
    private Integer educationStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.major_introduction")
    private String majorIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.get_certificate")
    private String getCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.language_skills")
    private String languageSkills;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: education")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_id")
    public Integer getEduId() {
        return eduId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_id")
    public void setEduId(Integer eduId) {
        this.eduId = eduId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_school")
    public String getEduSchool() {
        return eduSchool;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_school")
    public void setEduSchool(String eduSchool) {
        this.eduSchool = eduSchool == null ? null : eduSchool.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_degree")
    public String getEduDegree() {
        return eduDegree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_degree")
    public void setEduDegree(String eduDegree) {
        this.eduDegree = eduDegree == null ? null : eduDegree.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_sub_major")
    public String getEduSubMajor() {
        return eduSubMajor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_sub_major")
    public void setEduSubMajor(String eduSubMajor) {
        this.eduSubMajor = eduSubMajor == null ? null : eduSubMajor.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_start")
    public Date getEduTimeStart() {
        return eduTimeStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_start")
    public void setEduTimeStart(Date eduTimeStart) {
        this.eduTimeStart = eduTimeStart;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_end")
    public Date getEduTimeEnd() {
        return eduTimeEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_time_end")
    public void setEduTimeEnd(Date eduTimeEnd) {
        this.eduTimeEnd = eduTimeEnd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.resume_id")
    public Integer getResumeId() {
        return resumeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.resume_id")
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.education_status")
    public Integer getEducationStatus() {
        return educationStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.education_status")
    public void setEducationStatus(Integer educationStatus) {
        this.educationStatus = educationStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.major_introduction")
    public String getMajorIntroduction() {
        return majorIntroduction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.major_introduction")
    public void setMajorIntroduction(String majorIntroduction) {
        this.majorIntroduction = majorIntroduction == null ? null : majorIntroduction.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.get_certificate")
    public String getGetCertificate() {
        return getCertificate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.get_certificate")
    public void setGetCertificate(String getCertificate) {
        this.getCertificate = getCertificate == null ? null : getCertificate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.language_skills")
    public String getLanguageSkills() {
        return languageSkills;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.language_skills")
    public void setLanguageSkills(String languageSkills) {
        this.languageSkills = languageSkills == null ? null : languageSkills.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: education")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eduId=").append(eduId);
        sb.append(", eduSchool=").append(eduSchool);
        sb.append(", eduDegree=").append(eduDegree);
        sb.append(", eduSubMajor=").append(eduSubMajor);
        sb.append(", eduTimeStart=").append(eduTimeStart);
        sb.append(", eduTimeEnd=").append(eduTimeEnd);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", educationStatus=").append(educationStatus);
        sb.append(", majorIntroduction=").append(majorIntroduction);
        sb.append(", getCertificate=").append(getCertificate);
        sb.append(", languageSkills=").append(languageSkills);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}