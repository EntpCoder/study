package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class PersonsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: persons")
    public static final Persons persons = new Persons();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_id")
    public static final SqlColumn<Integer> perId = persons.perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.password")
    public static final SqlColumn<String> password = persons.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_name")
    public static final SqlColumn<String> perName = persons.perName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_gender")
    public static final SqlColumn<Integer> perGender = persons.perGender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_birth")
    public static final SqlColumn<Date> perBirth = persons.perBirth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_tel")
    public static final SqlColumn<Long> perTel = persons.perTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_email")
    public static final SqlColumn<String> perEmail = persons.perEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_address")
    public static final SqlColumn<String> perAddress = persons.perAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_image")
    public static final SqlColumn<String> perImage = persons.perImage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: persons.per_status")
    public static final SqlColumn<Integer> perStatus = persons.perStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: persons.person_status")
    public static final SqlColumn<Integer> personStatus = persons.personStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: persons.xx")
    public static final SqlColumn<String> xx = persons.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: persons.x")
    public static final SqlColumn<String> x = persons.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: persons")
    public static final class Persons extends AliasableSqlTable<Persons> {
        public final SqlColumn<Integer> perId = column("per_id", JDBCType.INTEGER);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> perName = column("per_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> perGender = column("per_gender", JDBCType.INTEGER);

        public final SqlColumn<Date> perBirth = column("per_birth", JDBCType.DATE);

        public final SqlColumn<Long> perTel = column("per_tel", JDBCType.BIGINT);

        public final SqlColumn<String> perEmail = column("per_email", JDBCType.VARCHAR);

        public final SqlColumn<String> perAddress = column("per_address", JDBCType.VARCHAR);

        public final SqlColumn<String> perImage = column("per_image", JDBCType.VARCHAR);

        public final SqlColumn<Integer> perStatus = column("per_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> personStatus = column("person_status", JDBCType.INTEGER);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public Persons() {
            super("persons", Persons::new);
        }
    }
}