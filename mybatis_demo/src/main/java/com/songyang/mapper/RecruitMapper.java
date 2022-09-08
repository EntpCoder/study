package com.songyang.mapper;

import static com.songyang.mapper.RecruitDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.Recruit;
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
public interface RecruitMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Recruit>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    BasicColumn[] selectList = BasicColumn.columnList(recId, companyId, recJobSalary, recJobAddress, recJobExperience, education, myskill, jobIntroduction, jobDemand, recCreateTime, recEndTime, kwd, recruitStatus, recPerNum, recName, x, xx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RecruitResult", value = {
        @Result(column="rec_id", property="recId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="rec_job_salary", property="recJobSalary", jdbcType=JdbcType.VARCHAR),
        @Result(column="rec_job_address", property="recJobAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="rec_job_experience", property="recJobExperience", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="myskill", property="myskill", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_introduction", property="jobIntroduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="job_demand", property="jobDemand", jdbcType=JdbcType.VARCHAR),
        @Result(column="rec_create_time", property="recCreateTime", jdbcType=JdbcType.DATE),
        @Result(column="rec_end_time", property="recEndTime", jdbcType=JdbcType.DATE),
        @Result(column="kwd", property="kwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="recruit_status", property="recruitStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="rec_per_num", property="recPerNum", jdbcType=JdbcType.INTEGER),
        @Result(column="rec_name", property="recName", jdbcType=JdbcType.VARCHAR),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR)
    })
    List<Recruit> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RecruitResult")
    Optional<Recruit> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int deleteByPrimaryKey(Integer recId_) {
        return delete(c -> 
            c.where(recId, isEqualTo(recId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int insert(Recruit row) {
        return MyBatis3Utils.insert(this::insert, row, recruit, c ->
            c.map(recId).toProperty("recId")
            .map(companyId).toProperty("companyId")
            .map(recJobSalary).toProperty("recJobSalary")
            .map(recJobAddress).toProperty("recJobAddress")
            .map(recJobExperience).toProperty("recJobExperience")
            .map(education).toProperty("education")
            .map(myskill).toProperty("myskill")
            .map(jobIntroduction).toProperty("jobIntroduction")
            .map(jobDemand).toProperty("jobDemand")
            .map(recCreateTime).toProperty("recCreateTime")
            .map(recEndTime).toProperty("recEndTime")
            .map(kwd).toProperty("kwd")
            .map(recruitStatus).toProperty("recruitStatus")
            .map(recPerNum).toProperty("recPerNum")
            .map(recName).toProperty("recName")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int insertMultiple(Collection<Recruit> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, recruit, c ->
            c.map(recId).toProperty("recId")
            .map(companyId).toProperty("companyId")
            .map(recJobSalary).toProperty("recJobSalary")
            .map(recJobAddress).toProperty("recJobAddress")
            .map(recJobExperience).toProperty("recJobExperience")
            .map(education).toProperty("education")
            .map(myskill).toProperty("myskill")
            .map(jobIntroduction).toProperty("jobIntroduction")
            .map(jobDemand).toProperty("jobDemand")
            .map(recCreateTime).toProperty("recCreateTime")
            .map(recEndTime).toProperty("recEndTime")
            .map(kwd).toProperty("kwd")
            .map(recruitStatus).toProperty("recruitStatus")
            .map(recPerNum).toProperty("recPerNum")
            .map(recName).toProperty("recName")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int insertSelective(Recruit row) {
        return MyBatis3Utils.insert(this::insert, row, recruit, c ->
            c.map(recId).toPropertyWhenPresent("recId", row::getRecId)
            .map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(recJobSalary).toPropertyWhenPresent("recJobSalary", row::getRecJobSalary)
            .map(recJobAddress).toPropertyWhenPresent("recJobAddress", row::getRecJobAddress)
            .map(recJobExperience).toPropertyWhenPresent("recJobExperience", row::getRecJobExperience)
            .map(education).toPropertyWhenPresent("education", row::getEducation)
            .map(myskill).toPropertyWhenPresent("myskill", row::getMyskill)
            .map(jobIntroduction).toPropertyWhenPresent("jobIntroduction", row::getJobIntroduction)
            .map(jobDemand).toPropertyWhenPresent("jobDemand", row::getJobDemand)
            .map(recCreateTime).toPropertyWhenPresent("recCreateTime", row::getRecCreateTime)
            .map(recEndTime).toPropertyWhenPresent("recEndTime", row::getRecEndTime)
            .map(kwd).toPropertyWhenPresent("kwd", row::getKwd)
            .map(recruitStatus).toPropertyWhenPresent("recruitStatus", row::getRecruitStatus)
            .map(recPerNum).toPropertyWhenPresent("recPerNum", row::getRecPerNum)
            .map(recName).toPropertyWhenPresent("recName", row::getRecName)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default Optional<Recruit> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default List<Recruit> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default List<Recruit> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default Optional<Recruit> selectByPrimaryKey(Integer recId_) {
        return selectOne(c ->
            c.where(recId, isEqualTo(recId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, recruit, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    static UpdateDSL<UpdateModel> updateAllColumns(Recruit row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(recId).equalTo(row::getRecId)
                .set(companyId).equalTo(row::getCompanyId)
                .set(recJobSalary).equalTo(row::getRecJobSalary)
                .set(recJobAddress).equalTo(row::getRecJobAddress)
                .set(recJobExperience).equalTo(row::getRecJobExperience)
                .set(education).equalTo(row::getEducation)
                .set(myskill).equalTo(row::getMyskill)
                .set(jobIntroduction).equalTo(row::getJobIntroduction)
                .set(jobDemand).equalTo(row::getJobDemand)
                .set(recCreateTime).equalTo(row::getRecCreateTime)
                .set(recEndTime).equalTo(row::getRecEndTime)
                .set(kwd).equalTo(row::getKwd)
                .set(recruitStatus).equalTo(row::getRecruitStatus)
                .set(recPerNum).equalTo(row::getRecPerNum)
                .set(recName).equalTo(row::getRecName)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Recruit row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(recId).equalToWhenPresent(row::getRecId)
                .set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(recJobSalary).equalToWhenPresent(row::getRecJobSalary)
                .set(recJobAddress).equalToWhenPresent(row::getRecJobAddress)
                .set(recJobExperience).equalToWhenPresent(row::getRecJobExperience)
                .set(education).equalToWhenPresent(row::getEducation)
                .set(myskill).equalToWhenPresent(row::getMyskill)
                .set(jobIntroduction).equalToWhenPresent(row::getJobIntroduction)
                .set(jobDemand).equalToWhenPresent(row::getJobDemand)
                .set(recCreateTime).equalToWhenPresent(row::getRecCreateTime)
                .set(recEndTime).equalToWhenPresent(row::getRecEndTime)
                .set(kwd).equalToWhenPresent(row::getKwd)
                .set(recruitStatus).equalToWhenPresent(row::getRecruitStatus)
                .set(recPerNum).equalToWhenPresent(row::getRecPerNum)
                .set(recName).equalToWhenPresent(row::getRecName)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int updateByPrimaryKey(Recruit row) {
        return update(c ->
            c.set(companyId).equalTo(row::getCompanyId)
            .set(recJobSalary).equalTo(row::getRecJobSalary)
            .set(recJobAddress).equalTo(row::getRecJobAddress)
            .set(recJobExperience).equalTo(row::getRecJobExperience)
            .set(education).equalTo(row::getEducation)
            .set(myskill).equalTo(row::getMyskill)
            .set(jobIntroduction).equalTo(row::getJobIntroduction)
            .set(jobDemand).equalTo(row::getJobDemand)
            .set(recCreateTime).equalTo(row::getRecCreateTime)
            .set(recEndTime).equalTo(row::getRecEndTime)
            .set(kwd).equalTo(row::getKwd)
            .set(recruitStatus).equalTo(row::getRecruitStatus)
            .set(recPerNum).equalTo(row::getRecPerNum)
            .set(recName).equalTo(row::getRecName)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .where(recId, isEqualTo(row::getRecId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.277+08:00", comments="Source Table: recruit")
    default int updateByPrimaryKeySelective(Recruit row) {
        return update(c ->
            c.set(companyId).equalToWhenPresent(row::getCompanyId)
            .set(recJobSalary).equalToWhenPresent(row::getRecJobSalary)
            .set(recJobAddress).equalToWhenPresent(row::getRecJobAddress)
            .set(recJobExperience).equalToWhenPresent(row::getRecJobExperience)
            .set(education).equalToWhenPresent(row::getEducation)
            .set(myskill).equalToWhenPresent(row::getMyskill)
            .set(jobIntroduction).equalToWhenPresent(row::getJobIntroduction)
            .set(jobDemand).equalToWhenPresent(row::getJobDemand)
            .set(recCreateTime).equalToWhenPresent(row::getRecCreateTime)
            .set(recEndTime).equalToWhenPresent(row::getRecEndTime)
            .set(kwd).equalToWhenPresent(row::getKwd)
            .set(recruitStatus).equalToWhenPresent(row::getRecruitStatus)
            .set(recPerNum).equalToWhenPresent(row::getRecPerNum)
            .set(recName).equalToWhenPresent(row::getRecName)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .where(recId, isEqualTo(row::getRecId))
        );
    }
}