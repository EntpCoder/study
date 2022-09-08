package com.songyang.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class EducationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: education")
    public static final Education education = new Education();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_id")
    public static final SqlColumn<Integer> eduId = education.eduId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source field: education.edu_school")
    public static final SqlColumn<String> eduSchool = education.eduSchool;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.edu_degree")
    public static final SqlColumn<String> eduDegree = education.eduDegree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.edu_sub_major")
    public static final SqlColumn<String> eduSubMajor = education.eduSubMajor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.edu_time_start")
    public static final SqlColumn<Date> eduTimeStart = education.eduTimeStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.edu_time_end")
    public static final SqlColumn<Date> eduTimeEnd = education.eduTimeEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.resume_id")
    public static final SqlColumn<Integer> resumeId = education.resumeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.education_status")
    public static final SqlColumn<Integer> educationStatus = education.educationStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.major_introduction")
    public static final SqlColumn<String> majorIntroduction = education.majorIntroduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.get_certificate")
    public static final SqlColumn<String> getCertificate = education.getCertificate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.language_skills")
    public static final SqlColumn<String> languageSkills = education.languageSkills;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.x")
    public static final SqlColumn<String> x = education.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source field: education.xx")
    public static final SqlColumn<String> xx = education.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: education")
    public static final class Education extends AliasableSqlTable<Education> {
        public final SqlColumn<Integer> eduId = column("edu_id", JDBCType.INTEGER);

        public final SqlColumn<String> eduSchool = column("edu_school", JDBCType.VARCHAR);

        public final SqlColumn<String> eduDegree = column("edu_degree", JDBCType.VARCHAR);

        public final SqlColumn<String> eduSubMajor = column("edu_sub_major", JDBCType.VARCHAR);

        public final SqlColumn<Date> eduTimeStart = column("edu_time_start", JDBCType.DATE);

        public final SqlColumn<Date> eduTimeEnd = column("edu_time_end", JDBCType.DATE);

        public final SqlColumn<Integer> resumeId = column("resume_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> educationStatus = column("education_status", JDBCType.INTEGER);

        public final SqlColumn<String> majorIntroduction = column("major_introduction", JDBCType.VARCHAR);

        public final SqlColumn<String> getCertificate = column("get_certificate", JDBCType.VARCHAR);

        public final SqlColumn<String> languageSkills = column("language_skills", JDBCType.VARCHAR);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public Education() {
            super("education", Education::new);
        }
    }
}