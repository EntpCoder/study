package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RecruitDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: recruit")
    public static final Recruit recruit = new Recruit();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_id")
    public static final SqlColumn<Integer> recId = recruit.recId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.company_id")
    public static final SqlColumn<Integer> companyId = recruit.companyId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_salary")
    public static final SqlColumn<String> recJobSalary = recruit.recJobSalary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_address")
    public static final SqlColumn<String> recJobAddress = recruit.recJobAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.rec_job_experience")
    public static final SqlColumn<String> recJobExperience = recruit.recJobExperience;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source field: recruit.education")
    public static final SqlColumn<String> education = recruit.education;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.myskill")
    public static final SqlColumn<String> myskill = recruit.myskill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.job_introduction")
    public static final SqlColumn<String> jobIntroduction = recruit.jobIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.job_demand")
    public static final SqlColumn<String> jobDemand = recruit.jobDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.rec_create_time")
    public static final SqlColumn<Date> recCreateTime = recruit.recCreateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.rec_end_time")
    public static final SqlColumn<Date> recEndTime = recruit.recEndTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.kwd")
    public static final SqlColumn<String> kwd = recruit.kwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.recruit_status")
    public static final SqlColumn<Integer> recruitStatus = recruit.recruitStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.rec_per_num")
    public static final SqlColumn<Integer> recPerNum = recruit.recPerNum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.rec_name")
    public static final SqlColumn<String> recName = recruit.recName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.x")
    public static final SqlColumn<String> x = recruit.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source field: recruit.xx")
    public static final SqlColumn<String> xx = recruit.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: recruit")
    public static final class Recruit extends AliasableSqlTable<Recruit> {
        public final SqlColumn<Integer> recId = column("rec_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<String> recJobSalary = column("rec_job_salary", JDBCType.VARCHAR);

        public final SqlColumn<String> recJobAddress = column("rec_job_address", JDBCType.VARCHAR);

        public final SqlColumn<String> recJobExperience = column("rec_job_experience", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> myskill = column("myskill", JDBCType.VARCHAR);

        public final SqlColumn<String> jobIntroduction = column("job_introduction", JDBCType.VARCHAR);

        public final SqlColumn<String> jobDemand = column("job_demand", JDBCType.VARCHAR);

        public final SqlColumn<Date> recCreateTime = column("rec_create_time", JDBCType.DATE);

        public final SqlColumn<Date> recEndTime = column("rec_end_time", JDBCType.DATE);

        public final SqlColumn<String> kwd = column("kwd", JDBCType.VARCHAR);

        public final SqlColumn<Integer> recruitStatus = column("recruit_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> recPerNum = column("rec_per_num", JDBCType.INTEGER);

        public final SqlColumn<String> recName = column("rec_name", JDBCType.VARCHAR);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public Recruit() {
            super("recruit", Recruit::new);
        }
    }
}