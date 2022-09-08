package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PersonalLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: personal_log")
    public static final PersonalLog personalLog = new PersonalLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_per_id")
    public static final SqlColumn<Integer> loginPerId = personalLog.loginPerId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.per_id")
    public static final SqlColumn<Integer> perId = personalLog.perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_type")
    public static final SqlColumn<String> loginType = personalLog.loginType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_ip")
    public static final SqlColumn<String> loginIp = personalLog.loginIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.login_time")
    public static final SqlColumn<Date> loginTime = personalLog.loginTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.person_log_status")
    public static final SqlColumn<Integer> personLogStatus = personalLog.personLogStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: personal_log.x")
    public static final SqlColumn<String> x = personalLog.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: personal_log.xx")
    public static final SqlColumn<String> xx = personalLog.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: personal_log")
    public static final class PersonalLog extends AliasableSqlTable<PersonalLog> {
        public final SqlColumn<Integer> loginPerId = column("login_per_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> perId = column("per_id", JDBCType.INTEGER);

        public final SqlColumn<String> loginType = column("login_type", JDBCType.VARCHAR);

        public final SqlColumn<String> loginIp = column("login_ip", JDBCType.VARCHAR);

        public final SqlColumn<Date> loginTime = column("login_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> personalLog = column("personal_log", JDBCType.INTEGER);

        public final SqlColumn<Integer> personLogStatus = column("person_log_status", JDBCType.INTEGER);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public PersonalLog() {
            super("personal_log", PersonalLog::new);
        }
    }
}