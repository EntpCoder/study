package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class InterviewInvitation implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_id")
    private Integer invitationId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_id")
    private Integer companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.resume_id")
    private Integer resumeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.is_agree")
    private Integer isAgree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_time")
    private Date invitationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_contact")
    private String companyContact;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_telno")
    private Integer companyTelno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.interview_invitation_status")
    private Integer interviewInvitationStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xxx")
    private String xxx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: interview_invitation")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_id")
    public Integer getInvitationId() {
        return invitationId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_id")
    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.resume_id")
    public Integer getResumeId() {
        return resumeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.resume_id")
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.is_agree")
    public Integer getIsAgree() {
        return isAgree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.is_agree")
    public void setIsAgree(Integer isAgree) {
        this.isAgree = isAgree;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_time")
    public Date getInvitationTime() {
        return invitationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.invitation_time")
    public void setInvitationTime(Date invitationTime) {
        this.invitationTime = invitationTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_contact")
    public String getCompanyContact() {
        return companyContact;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_contact")
    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact == null ? null : companyContact.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_telno")
    public Integer getCompanyTelno() {
        return companyTelno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.company_telno")
    public void setCompanyTelno(Integer companyTelno) {
        this.companyTelno = companyTelno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.interview_invitation_status")
    public Integer getInterviewInvitationStatus() {
        return interviewInvitationStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.interview_invitation_status")
    public void setInterviewInvitationStatus(Integer interviewInvitationStatus) {
        this.interviewInvitationStatus = interviewInvitationStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xxx")
    public String getXxx() {
        return xxx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: interview_invitation.xxx")
    public void setXxx(String xxx) {
        this.xxx = xxx == null ? null : xxx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: interview_invitation")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invitationId=").append(invitationId);
        sb.append(", companyId=").append(companyId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", isAgree=").append(isAgree);
        sb.append(", invitationTime=").append(invitationTime);
        sb.append(", companyContact=").append(companyContact);
        sb.append(", companyTelno=").append(companyTelno);
        sb.append(", interviewInvitationStatus=").append(interviewInvitationStatus);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", xxx=").append(xxx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}