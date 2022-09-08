package com.songyang.mapper;

import static com.songyang.mapper.PersonalLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.PersonalLog;
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
public interface PersonalLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PersonalLog>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    BasicColumn[] selectList = BasicColumn.columnList(loginPerId, perId, loginType, loginIp, loginTime, personalLog.personalLog, personLogStatus, x, xx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PersonalLogResult", value = {
        @Result(column="login_per_id", property="loginPerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="per_id", property="perId", jdbcType=JdbcType.INTEGER),
        @Result(column="login_type", property="loginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_ip", property="loginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="personal_log", property="personalLog", jdbcType=JdbcType.INTEGER),
        @Result(column="person_log_status", property="personLogStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR)
    })
    List<PersonalLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PersonalLogResult")
    Optional<PersonalLog> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int deleteByPrimaryKey(Integer loginPerId_) {
        return delete(c -> 
            c.where(loginPerId, isEqualTo(loginPerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int insert(PersonalLog row) {
        return MyBatis3Utils.insert(this::insert, row, personalLog, c ->
            c.map(loginPerId).toProperty("loginPerId")
            .map(perId).toProperty("perId")
            .map(loginType).toProperty("loginType")
            .map(loginIp).toProperty("loginIp")
            .map(loginTime).toProperty("loginTime")
            .map(personalLog.personalLog).toProperty("personalLog")
            .map(personLogStatus).toProperty("personLogStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int insertMultiple(Collection<PersonalLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, personalLog, c ->
            c.map(loginPerId).toProperty("loginPerId")
            .map(perId).toProperty("perId")
            .map(loginType).toProperty("loginType")
            .map(loginIp).toProperty("loginIp")
            .map(loginTime).toProperty("loginTime")
            .map(personalLog.personalLog).toProperty("personalLog")
            .map(personLogStatus).toProperty("personLogStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int insertSelective(PersonalLog row) {
        return MyBatis3Utils.insert(this::insert, row, personalLog, c ->
            c.map(loginPerId).toPropertyWhenPresent("loginPerId", row::getLoginPerId)
            .map(perId).toPropertyWhenPresent("perId", row::getPerId)
            .map(loginType).toPropertyWhenPresent("loginType", row::getLoginType)
            .map(loginIp).toPropertyWhenPresent("loginIp", row::getLoginIp)
            .map(loginTime).toPropertyWhenPresent("loginTime", row::getLoginTime)
            .map(personalLog.personalLog).toPropertyWhenPresent("personalLog", row::getPersonalLog)
            .map(personLogStatus).toPropertyWhenPresent("personLogStatus", row::getPersonLogStatus)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default Optional<PersonalLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default List<PersonalLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default List<PersonalLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default Optional<PersonalLog> selectByPrimaryKey(Integer loginPerId_) {
        return selectOne(c ->
            c.where(loginPerId, isEqualTo(loginPerId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, personalLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    static UpdateDSL<UpdateModel> updateAllColumns(PersonalLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(loginPerId).equalTo(row::getLoginPerId)
                .set(perId).equalTo(row::getPerId)
                .set(loginType).equalTo(row::getLoginType)
                .set(loginIp).equalTo(row::getLoginIp)
                .set(loginTime).equalTo(row::getLoginTime)
                .set(personalLog.personalLog).equalTo(row::getPersonalLog)
                .set(personLogStatus).equalTo(row::getPersonLogStatus)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PersonalLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(loginPerId).equalToWhenPresent(row::getLoginPerId)
                .set(perId).equalToWhenPresent(row::getPerId)
                .set(loginType).equalToWhenPresent(row::getLoginType)
                .set(loginIp).equalToWhenPresent(row::getLoginIp)
                .set(loginTime).equalToWhenPresent(row::getLoginTime)
                .set(personalLog.personalLog).equalToWhenPresent(row::getPersonalLog)
                .set(personLogStatus).equalToWhenPresent(row::getPersonLogStatus)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int updateByPrimaryKey(PersonalLog row) {
        return update(c ->
            c.set(perId).equalTo(row::getPerId)
            .set(loginType).equalTo(row::getLoginType)
            .set(loginIp).equalTo(row::getLoginIp)
            .set(loginTime).equalTo(row::getLoginTime)
            .set(personalLog.personalLog).equalTo(row::getPersonalLog)
            .set(personLogStatus).equalTo(row::getPersonLogStatus)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .where(loginPerId, isEqualTo(row::getLoginPerId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: personal_log")
    default int updateByPrimaryKeySelective(PersonalLog row) {
        return update(c ->
            c.set(perId).equalToWhenPresent(row::getPerId)
            .set(loginType).equalToWhenPresent(row::getLoginType)
            .set(loginIp).equalToWhenPresent(row::getLoginIp)
            .set(loginTime).equalToWhenPresent(row::getLoginTime)
            .set(personalLog.personalLog).equalToWhenPresent(row::getPersonalLog)
            .set(personLogStatus).equalToWhenPresent(row::getPersonLogStatus)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .where(loginPerId, isEqualTo(row::getLoginPerId))
        );
    }
}