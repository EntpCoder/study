package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CompanyReceivedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_received")
    public static final CompanyReceived companyReceived = new CompanyReceived();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.company_receive_id")
    public static final SqlColumn<Integer> companyReceiveId = companyReceived.companyReceiveId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.is_read")
    public static final SqlColumn<Integer> isRead = companyReceived.isRead;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.is_invitation")
    public static final SqlColumn<Integer> isInvitation = companyReceived.isInvitation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.resume_id")
    public static final SqlColumn<Integer> resumeId = companyReceived.resumeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.receive_time")
    public static final SqlColumn<Date> receiveTime = companyReceived.receiveTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.company_received_status")
    public static final SqlColumn<Integer> companyReceivedStatus = companyReceived.companyReceivedStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.x")
    public static final SqlColumn<String> x = companyReceived.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source field: company_received.xx")
    public static final SqlColumn<String> xx = companyReceived.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: company_received.rec_id")
    public static final SqlColumn<Integer> recId = companyReceived.recId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_received")
    public static final class CompanyReceived extends AliasableSqlTable<CompanyReceived> {
        public final SqlColumn<Integer> companyReceiveId = column("company_receive_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> isRead = column("is_read", JDBCType.INTEGER);

        public final SqlColumn<Integer> isInvitation = column("is_invitation", JDBCType.INTEGER);

        public final SqlColumn<Integer> resumeId = column("resume_id", JDBCType.INTEGER);

        public final SqlColumn<Date> receiveTime = column("receive_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> companyReceivedStatus = column("company_received_status", JDBCType.INTEGER);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recId = column("rec_id", JDBCType.INTEGER);

        public CompanyReceived() {
            super("company_received", CompanyReceived::new);
        }
    }
}