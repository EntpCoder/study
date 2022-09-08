package com.songyang.mapper;

import static com.songyang.mapper.CompanyLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.CompanyLog;
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
public interface CompanyLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CompanyLog>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    BasicColumn[] selectList = BasicColumn.columnList(loginCompanyId, companyId, loginType, loginIp, loginTime, companyLogStatus, x, xx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CompanyLogResult", value = {
        @Result(column="login_company_id", property="loginCompanyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="login_type", property="loginType", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_ip", property="loginIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="company_log_status", property="companyLogStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR)
    })
    List<CompanyLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CompanyLogResult")
    Optional<CompanyLog> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.245+08:00", comments="Source Table: company_log")
    default int deleteByPrimaryKey(Integer loginCompanyId_) {
        return delete(c -> 
            c.where(loginCompanyId, isEqualTo(loginCompanyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int insert(CompanyLog row) {
        return MyBatis3Utils.insert(this::insert, row, companyLog, c ->
            c.map(loginCompanyId).toProperty("loginCompanyId")
            .map(companyId).toProperty("companyId")
            .map(loginType).toProperty("loginType")
            .map(loginIp).toProperty("loginIp")
            .map(loginTime).toProperty("loginTime")
            .map(companyLogStatus).toProperty("companyLogStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int insertMultiple(Collection<CompanyLog> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, companyLog, c ->
            c.map(loginCompanyId).toProperty("loginCompanyId")
            .map(companyId).toProperty("companyId")
            .map(loginType).toProperty("loginType")
            .map(loginIp).toProperty("loginIp")
            .map(loginTime).toProperty("loginTime")
            .map(companyLogStatus).toProperty("companyLogStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int insertSelective(CompanyLog row) {
        return MyBatis3Utils.insert(this::insert, row, companyLog, c ->
            c.map(loginCompanyId).toPropertyWhenPresent("loginCompanyId", row::getLoginCompanyId)
            .map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(loginType).toPropertyWhenPresent("loginType", row::getLoginType)
            .map(loginIp).toPropertyWhenPresent("loginIp", row::getLoginIp)
            .map(loginTime).toPropertyWhenPresent("loginTime", row::getLoginTime)
            .map(companyLogStatus).toPropertyWhenPresent("companyLogStatus", row::getCompanyLogStatus)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default Optional<CompanyLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default List<CompanyLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default List<CompanyLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default Optional<CompanyLog> selectByPrimaryKey(Integer loginCompanyId_) {
        return selectOne(c ->
            c.where(loginCompanyId, isEqualTo(loginCompanyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, companyLog, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    static UpdateDSL<UpdateModel> updateAllColumns(CompanyLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(loginCompanyId).equalTo(row::getLoginCompanyId)
                .set(companyId).equalTo(row::getCompanyId)
                .set(loginType).equalTo(row::getLoginType)
                .set(loginIp).equalTo(row::getLoginIp)
                .set(loginTime).equalTo(row::getLoginTime)
                .set(companyLogStatus).equalTo(row::getCompanyLogStatus)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CompanyLog row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(loginCompanyId).equalToWhenPresent(row::getLoginCompanyId)
                .set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(loginType).equalToWhenPresent(row::getLoginType)
                .set(loginIp).equalToWhenPresent(row::getLoginIp)
                .set(loginTime).equalToWhenPresent(row::getLoginTime)
                .set(companyLogStatus).equalToWhenPresent(row::getCompanyLogStatus)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int updateByPrimaryKey(CompanyLog row) {
        return update(c ->
            c.set(companyId).equalTo(row::getCompanyId)
            .set(loginType).equalTo(row::getLoginType)
            .set(loginIp).equalTo(row::getLoginIp)
            .set(loginTime).equalTo(row::getLoginTime)
            .set(companyLogStatus).equalTo(row::getCompanyLogStatus)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .where(loginCompanyId, isEqualTo(row::getLoginCompanyId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.249+08:00", comments="Source Table: company_log")
    default int updateByPrimaryKeySelective(CompanyLog row) {
        return update(c ->
            c.set(companyId).equalToWhenPresent(row::getCompanyId)
            .set(loginType).equalToWhenPresent(row::getLoginType)
            .set(loginIp).equalToWhenPresent(row::getLoginIp)
            .set(loginTime).equalToWhenPresent(row::getLoginTime)
            .set(companyLogStatus).equalToWhenPresent(row::getCompanyLogStatus)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .where(loginCompanyId, isEqualTo(row::getLoginCompanyId))
        );
    }
}