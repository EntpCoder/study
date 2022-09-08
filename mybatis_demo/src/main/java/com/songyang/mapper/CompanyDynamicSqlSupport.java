package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class CompanyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.225+08:00", comments="Source Table: company")
    public static final Company company = new Company();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_id")
    public static final SqlColumn<Integer> companyId = company.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_name")
    public static final SqlColumn<String> companyName = company.companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_type")
    public static final SqlColumn<String> companyType = company.companyType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.compay_address")
    public static final SqlColumn<String> compayAddress = company.compayAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_introduction")
    public static final SqlColumn<String> companyIntroduction = company.companyIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.create_by")
    public static final SqlColumn<String> createBy = company.createBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_size")
    public static final SqlColumn<String> companySize = company.companySize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_email")
    public static final SqlColumn<String> companyEmail = company.companyEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.update_time")
    public static final SqlColumn<Date> updateTime = company.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.is_delete")
    public static final SqlColumn<Integer> isDelete = company.isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_telno")
    public static final SqlColumn<Long> companyTelno = company.companyTelno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.website_company")
    public static final SqlColumn<String> websiteCompany = company.websiteCompany;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.longitude")
    public static final SqlColumn<String> longitude = company.longitude;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.pwd")
    public static final SqlColumn<String> pwd = company.pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_status")
    public static final SqlColumn<Integer> companyStatus = company.companyStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.company_industry")
    public static final SqlColumn<String> companyIndustry = company.companyIndustry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.x")
    public static final SqlColumn<String> x = company.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.xx")
    public static final SqlColumn<String> xx = company.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source field: company.xxx")
    public static final SqlColumn<String> xxx = company.xxx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.229+08:00", comments="Source Table: company")
    public static final class Company extends AliasableSqlTable<Company> {
        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<String> companyName = column("company_name", JDBCType.VARCHAR);

        public final SqlColumn<String> companyType = column("company_type", JDBCType.VARCHAR);

        public final SqlColumn<String> compayAddress = column("compay_address", JDBCType.VARCHAR);

        public final SqlColumn<String> companyIntroduction = column("company_introduction", JDBCType.VARCHAR);

        public final SqlColumn<String> createBy = column("create_by", JDBCType.VARCHAR);

        public final SqlColumn<String> companySize = column("company_size", JDBCType.VARCHAR);

        public final SqlColumn<String> companyEmail = column("company_email", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.DATE);

        public final SqlColumn<Integer> isDelete = column("is_delete", JDBCType.INTEGER);

        public final SqlColumn<Long> companyTelno = column("company_telno", JDBCType.BIGINT);

        public final SqlColumn<String> websiteCompany = column("website_company", JDBCType.VARCHAR);

        public final SqlColumn<String> longitude = column("longitude", JDBCType.VARCHAR);

        public final SqlColumn<String> pwd = column("pwd", JDBCType.VARCHAR);

        public final SqlColumn<Integer> companyStatus = column("company_status", JDBCType.INTEGER);

        public final SqlColumn<String> companyIndustry = column("company_industry", JDBCType.VARCHAR);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public final SqlColumn<String> xxx = column("xxx", JDBCType.VARCHAR);

        public Company() {
            super("company", Company::new);
        }
    }
}