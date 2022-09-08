package com.songyang.mapper;

import static com.songyang.mapper.EducationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.Education;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface EducationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Education>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    BasicColumn[] selectList = BasicColumn.columnList(eduId, eduSchool, eduDegree, eduSubMajor, eduTimeStart, eduTimeEnd, resumeId, educationStatus, majorIntroduction, getCertificate, languageSkills, x, xx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="EducationResult", value = {
        @Result(column="edu_id", property="eduId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="edu_school", property="eduSchool", jdbcType=JdbcType.VARCHAR),
        @Result(column="edu_degree", property="eduDegree", jdbcType=JdbcType.VARCHAR),
        @Result(column="edu_sub_major", property="eduSubMajor", jdbcType=JdbcType.VARCHAR),
        @Result(column="edu_time_start", property="eduTimeStart", jdbcType=JdbcType.DATE),
        @Result(column="edu_time_end", property="eduTimeEnd", jdbcType=JdbcType.DATE),
        @Result(column="resume_id", property="resumeId", jdbcType=JdbcType.INTEGER),
        @Result(column="education_status", property="educationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="major_introduction", property="majorIntroduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="get_certificate", property="getCertificate", jdbcType=JdbcType.VARCHAR),
        @Result(column="language_skills", property="languageSkills", jdbcType=JdbcType.VARCHAR),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR)
    })
    List<Education> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("EducationResult")
    Optional<Education> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int deleteByPrimaryKey(Integer eduId_) {
        return delete(c -> 
            c.where(eduId, isEqualTo(eduId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int insert(Education row) {
        return MyBatis3Utils.insert(this::insert, row, education, c ->
            c.map(eduId).toProperty("eduId")
            .map(eduSchool).toProperty("eduSchool")
            .map(eduDegree).toProperty("eduDegree")
            .map(eduSubMajor).toProperty("eduSubMajor")
            .map(eduTimeStart).toProperty("eduTimeStart")
            .map(eduTimeEnd).toProperty("eduTimeEnd")
            .map(resumeId).toProperty("resumeId")
            .map(educationStatus).toProperty("educationStatus")
            .map(majorIntroduction).toProperty("majorIntroduction")
            .map(getCertificate).toProperty("getCertificate")
            .map(languageSkills).toProperty("languageSkills")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int insertMultiple(Collection<Education> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, education, c ->
            c.map(eduId).toProperty("eduId")
            .map(eduSchool).toProperty("eduSchool")
            .map(eduDegree).toProperty("eduDegree")
            .map(eduSubMajor).toProperty("eduSubMajor")
            .map(eduTimeStart).toProperty("eduTimeStart")
            .map(eduTimeEnd).toProperty("eduTimeEnd")
            .map(resumeId).toProperty("resumeId")
            .map(educationStatus).toProperty("educationStatus")
            .map(majorIntroduction).toProperty("majorIntroduction")
            .map(getCertificate).toProperty("getCertificate")
            .map(languageSkills).toProperty("languageSkills")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int insertSelective(Education row) {
        return MyBatis3Utils.insert(this::insert, row, education, c ->
            c.map(eduId).toPropertyWhenPresent("eduId", row::getEduId)
            .map(eduSchool).toPropertyWhenPresent("eduSchool", row::getEduSchool)
            .map(eduDegree).toPropertyWhenPresent("eduDegree", row::getEduDegree)
            .map(eduSubMajor).toPropertyWhenPresent("eduSubMajor", row::getEduSubMajor)
            .map(eduTimeStart).toPropertyWhenPresent("eduTimeStart", row::getEduTimeStart)
            .map(eduTimeEnd).toPropertyWhenPresent("eduTimeEnd", row::getEduTimeEnd)
            .map(resumeId).toPropertyWhenPresent("resumeId", row::getResumeId)
            .map(educationStatus).toPropertyWhenPresent("educationStatus", row::getEducationStatus)
            .map(majorIntroduction).toPropertyWhenPresent("majorIntroduction", row::getMajorIntroduction)
            .map(getCertificate).toPropertyWhenPresent("getCertificate", row::getGetCertificate)
            .map(languageSkills).toPropertyWhenPresent("languageSkills", row::getLanguageSkills)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default Optional<Education> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default List<Education> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default List<Education> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default Optional<Education> selectByPrimaryKey(Integer eduId_) {
        return selectOne(c ->
            c.where(eduId, isEqualTo(eduId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, education, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    static UpdateDSL<UpdateModel> updateAllColumns(Education row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eduId).equalTo(row::getEduId)
                .set(eduSchool).equalTo(row::getEduSchool)
                .set(eduDegree).equalTo(row::getEduDegree)
                .set(eduSubMajor).equalTo(row::getEduSubMajor)
                .set(eduTimeStart).equalTo(row::getEduTimeStart)
                .set(eduTimeEnd).equalTo(row::getEduTimeEnd)
                .set(resumeId).equalTo(row::getResumeId)
                .set(educationStatus).equalTo(row::getEducationStatus)
                .set(majorIntroduction).equalTo(row::getMajorIntroduction)
                .set(getCertificate).equalTo(row::getGetCertificate)
                .set(languageSkills).equalTo(row::getLanguageSkills)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Education row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(eduId).equalToWhenPresent(row::getEduId)
                .set(eduSchool).equalToWhenPresent(row::getEduSchool)
                .set(eduDegree).equalToWhenPresent(row::getEduDegree)
                .set(eduSubMajor).equalToWhenPresent(row::getEduSubMajor)
                .set(eduTimeStart).equalToWhenPresent(row::getEduTimeStart)
                .set(eduTimeEnd).equalToWhenPresent(row::getEduTimeEnd)
                .set(resumeId).equalToWhenPresent(row::getResumeId)
                .set(educationStatus).equalToWhenPresent(row::getEducationStatus)
                .set(majorIntroduction).equalToWhenPresent(row::getMajorIntroduction)
                .set(getCertificate).equalToWhenPresent(row::getGetCertificate)
                .set(languageSkills).equalToWhenPresent(row::getLanguageSkills)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int updateByPrimaryKey(Education row) {
        return update(c ->
            c.set(eduSchool).equalTo(row::getEduSchool)
            .set(eduDegree).equalTo(row::getEduDegree)
            .set(eduSubMajor).equalTo(row::getEduSubMajor)
            .set(eduTimeStart).equalTo(row::getEduTimeStart)
            .set(eduTimeEnd).equalTo(row::getEduTimeEnd)
            .set(resumeId).equalTo(row::getResumeId)
            .set(educationStatus).equalTo(row::getEducationStatus)
            .set(majorIntroduction).equalTo(row::getMajorIntroduction)
            .set(getCertificate).equalTo(row::getGetCertificate)
            .set(languageSkills).equalTo(row::getLanguageSkills)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .where(eduId, isEqualTo(row::getEduId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.257+08:00", comments="Source Table: education")
    default int updateByPrimaryKeySelective(Education row) {
        return update(c ->
            c.set(eduSchool).equalToWhenPresent(row::getEduSchool)
            .set(eduDegree).equalToWhenPresent(row::getEduDegree)
            .set(eduSubMajor).equalToWhenPresent(row::getEduSubMajor)
            .set(eduTimeStart).equalToWhenPresent(row::getEduTimeStart)
            .set(eduTimeEnd).equalToWhenPresent(row::getEduTimeEnd)
            .set(resumeId).equalToWhenPresent(row::getResumeId)
            .set(educationStatus).equalToWhenPresent(row::getEducationStatus)
            .set(majorIntroduction).equalToWhenPresent(row::getMajorIntroduction)
            .set(getCertificate).equalToWhenPresent(row::getGetCertificate)
            .set(languageSkills).equalToWhenPresent(row::getLanguageSkills)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .where(eduId, isEqualTo(row::getEduId))
        );
    }
}