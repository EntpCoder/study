package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class InterviewInvitationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    public static final InterviewInvitation interviewInvitation = new InterviewInvitation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.invitation_id")
    public static final SqlColumn<Integer> invitationId = interviewInvitation.invitationId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.company_id")
    public static final SqlColumn<Integer> companyId = interviewInvitation.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.resume_id")
    public static final SqlColumn<Integer> resumeId = interviewInvitation.resumeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.is_agree")
    public static final SqlColumn<Integer> isAgree = interviewInvitation.isAgree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.invitation_time")
    public static final SqlColumn<Date> invitationTime = interviewInvitation.invitationTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.company_contact")
    public static final SqlColumn<String> companyContact = interviewInvitation.companyContact;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.company_telno")
    public static final SqlColumn<Integer> companyTelno = interviewInvitation.companyTelno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.interview_invitation_status")
    public static final SqlColumn<Integer> interviewInvitationStatus = interviewInvitation.interviewInvitationStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.x")
    public static final SqlColumn<String> x = interviewInvitation.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.xx")
    public static final SqlColumn<String> xx = interviewInvitation.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: interview_invitation.xxx")
    public static final SqlColumn<String> xxx = interviewInvitation.xxx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    public static final class InterviewInvitation extends AliasableSqlTable<InterviewInvitation> {
        public final SqlColumn<Integer> invitationId = column("invitation_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> resumeId = column("resume_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> isAgree = column("is_agree", JDBCType.INTEGER);

        public final SqlColumn<Date> invitationTime = column("invitation_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> companyContact = column("company_contact", JDBCType.VARCHAR);

        public final SqlColumn<Integer> companyTelno = column("company_telno", JDBCType.INTEGER);

        public final SqlColumn<Integer> interviewInvitationStatus = column("interview_invitation_status", JDBCType.INTEGER);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public final SqlColumn<String> xxx = column("xxx", JDBCType.VARCHAR);

        public InterviewInvitation() {
            super("interview_invitation", InterviewInvitation::new);
        }
    }
}