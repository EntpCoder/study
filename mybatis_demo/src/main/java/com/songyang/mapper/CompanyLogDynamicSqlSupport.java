package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CompanyLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    public static final CompanyLog companyLog = new CompanyLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_company_id")
    public static final SqlColumn<Integer> loginCompanyId = companyLog.loginCompanyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_id")
    public static final SqlColumn<Integer> companyId = companyLog.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_type")
    public static final SqlColumn<String> loginType = companyLog.loginType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_ip")
    public static final SqlColumn<String> loginIp = companyLog.loginIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.login_time")
    public static final SqlColumn<Date> loginTime = companyLog.loginTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.company_log_status")
    public static final SqlColumn<Integer> companyLogStatus = companyLog.companyLogStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.x")
    public static final SqlColumn<String> x = companyLog.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source field: company_log.xx")
    public static final SqlColumn<String> xx = companyLog.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    public static final class CompanyLog extends AliasableSqlTable<CompanyLog> {
        public final SqlColumn<Integer> loginCompanyId = column("login_company_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<String> loginType = column("login_type", JDBCType.VARCHAR);

        public final SqlColumn<String> loginIp = column("login_ip", JDBCType.VARCHAR);

        public final SqlColumn<Date> loginTime = column("login_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> companyLogStatus = column("company_log_status", JDBCType.INTEGER);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public CompanyLog() {
            super("company_log", CompanyLog::new);
        }
    }
}