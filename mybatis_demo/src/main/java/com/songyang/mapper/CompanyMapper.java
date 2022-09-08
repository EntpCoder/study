package com.songyang.mapper;

import static com.songyang.mapper.CompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.Company;
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
public interface CompanyMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Company>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.237+08:00", comments="Source Table: company")
    BasicColumn[] selectList = BasicColumn.columnList(companyId, companyName, companyType, compayAddress, companyIntroduction, createBy, companySize, companyEmail, updateTime, isDelete, companyTelno, websiteCompany, longitude, pwd, companyStatus, companyIndustry, x, xx, xxx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CompanyResult", value = {
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_name", property="companyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_type", property="companyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="compay_address", property="compayAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_introduction", property="companyIntroduction", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_size", property="companySize", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_email", property="companyEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.DATE),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.INTEGER),
        @Result(column="company_telno", property="companyTelno", jdbcType=JdbcType.BIGINT),
        @Result(column="website_company", property="websiteCompany", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_status", property="companyStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="company_industry", property="companyIndustry", jdbcType=JdbcType.VARCHAR),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR),
        @Result(column="xxx", property="xxx", jdbcType=JdbcType.VARCHAR)
    })
    List<Company> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CompanyResult")
    Optional<Company> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    default int deleteByPrimaryKey(Integer companyId_) {
        return delete(c -> 
            c.where(companyId, isEqualTo(companyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.233+08:00", comments="Source Table: company")
    default int insert(Company row) {
        return MyBatis3Utils.insert(this::insert, row, company, c ->
            c.map(companyId).toProperty("companyId")
            .map(companyName).toProperty("companyName")
            .map(companyType).toProperty("companyType")
            .map(compayAddress).toProperty("compayAddress")
            .map(companyIntroduction).toProperty("companyIntroduction")
            .map(createBy).toProperty("createBy")
            .map(companySize).toProperty("companySize")
            .map(companyEmail).toProperty("companyEmail")
            .map(updateTime).toProperty("updateTime")
            .map(isDelete).toProperty("isDelete")
            .map(companyTelno).toProperty("companyTelno")
            .map(websiteCompany).toProperty("websiteCompany")
            .map(longitude).toProperty("longitude")
            .map(pwd).toProperty("pwd")
            .map(companyStatus).toProperty("companyStatus")
            .map(companyIndustry).toProperty("companyIndustry")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(xxx).toProperty("xxx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.237+08:00", comments="Source Table: company")
    default int insertMultiple(Collection<Company> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, company, c ->
            c.map(companyId).toProperty("companyId")
            .map(companyName).toProperty("companyName")
            .map(companyType).toProperty("companyType")
            .map(compayAddress).toProperty("compayAddress")
            .map(companyIntroduction).toProperty("companyIntroduction")
            .map(createBy).toProperty("createBy")
            .map(companySize).toProperty("companySize")
            .map(companyEmail).toProperty("companyEmail")
            .map(updateTime).toProperty("updateTime")
            .map(isDelete).toProperty("isDelete")
            .map(companyTelno).toProperty("companyTelno")
            .map(websiteCompany).toProperty("websiteCompany")
            .map(longitude).toProperty("longitude")
            .map(pwd).toProperty("pwd")
            .map(companyStatus).toProperty("companyStatus")
            .map(companyIndustry).toProperty("companyIndustry")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(xxx).toProperty("xxx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.237+08:00", comments="Source Table: company")
    default int insertSelective(Company row) {
        return MyBatis3Utils.insert(this::insert, row, company, c ->
            c.map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(companyName).toPropertyWhenPresent("companyName", row::getCompanyName)
            .map(companyType).toPropertyWhenPresent("companyType", row::getCompanyType)
            .map(compayAddress).toPropertyWhenPresent("compayAddress", row::getCompayAddress)
            .map(companyIntroduction).toPropertyWhenPresent("companyIntroduction", row::getCompanyIntroduction)
            .map(createBy).toPropertyWhenPresent("createBy", row::getCreateBy)
            .map(companySize).toPropertyWhenPresent("companySize", row::getCompanySize)
            .map(companyEmail).toPropertyWhenPresent("companyEmail", row::getCompanyEmail)
            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
            .map(isDelete).toPropertyWhenPresent("isDelete", row::getIsDelete)
            .map(companyTelno).toPropertyWhenPresent("companyTelno", row::getCompanyTelno)
            .map(websiteCompany).toPropertyWhenPresent("websiteCompany", row::getWebsiteCompany)
            .map(longitude).toPropertyWhenPresent("longitude", row::getLongitude)
            .map(pwd).toPropertyWhenPresent("pwd", row::getPwd)
            .map(companyStatus).toPropertyWhenPresent("companyStatus", row::getCompanyStatus)
            .map(companyIndustry).toPropertyWhenPresent("companyIndustry", row::getCompanyIndustry)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
            .map(xxx).toPropertyWhenPresent("xxx", row::getXxx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default Optional<Company> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default List<Company> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default List<Company> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default Optional<Company> selectByPrimaryKey(Integer companyId_) {
        return selectOne(c ->
            c.where(companyId, isEqualTo(companyId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, company, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    static UpdateDSL<UpdateModel> updateAllColumns(Company row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyId).equalTo(row::getCompanyId)
                .set(companyName).equalTo(row::getCompanyName)
                .set(companyType).equalTo(row::getCompanyType)
                .set(compayAddress).equalTo(row::getCompayAddress)
                .set(companyIntroduction).equalTo(row::getCompanyIntroduction)
                .set(createBy).equalTo(row::getCreateBy)
                .set(companySize).equalTo(row::getCompanySize)
                .set(companyEmail).equalTo(row::getCompanyEmail)
                .set(updateTime).equalTo(row::getUpdateTime)
                .set(isDelete).equalTo(row::getIsDelete)
                .set(companyTelno).equalTo(row::getCompanyTelno)
                .set(websiteCompany).equalTo(row::getWebsiteCompany)
                .set(longitude).equalTo(row::getLongitude)
                .set(pwd).equalTo(row::getPwd)
                .set(companyStatus).equalTo(row::getCompanyStatus)
                .set(companyIndustry).equalTo(row::getCompanyIndustry)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx)
                .set(xxx).equalTo(row::getXxx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Company row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(companyName).equalToWhenPresent(row::getCompanyName)
                .set(companyType).equalToWhenPresent(row::getCompanyType)
                .set(compayAddress).equalToWhenPresent(row::getCompayAddress)
                .set(companyIntroduction).equalToWhenPresent(row::getCompanyIntroduction)
                .set(createBy).equalToWhenPresent(row::getCreateBy)
                .set(companySize).equalToWhenPresent(row::getCompanySize)
                .set(companyEmail).equalToWhenPresent(row::getCompanyEmail)
                .set(updateTime).equalToWhenPresent(row::getUpdateTime)
                .set(isDelete).equalToWhenPresent(row::getIsDelete)
                .set(companyTelno).equalToWhenPresent(row::getCompanyTelno)
                .set(websiteCompany).equalToWhenPresent(row::getWebsiteCompany)
                .set(longitude).equalToWhenPresent(row::getLongitude)
                .set(pwd).equalToWhenPresent(row::getPwd)
                .set(companyStatus).equalToWhenPresent(row::getCompanyStatus)
                .set(companyIndustry).equalToWhenPresent(row::getCompanyIndustry)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx)
                .set(xxx).equalToWhenPresent(row::getXxx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default int updateByPrimaryKey(Company row) {
        return update(c ->
            c.set(companyName).equalTo(row::getCompanyName)
            .set(companyType).equalTo(row::getCompanyType)
            .set(compayAddress).equalTo(row::getCompayAddress)
            .set(companyIntroduction).equalTo(row::getCompanyIntroduction)
            .set(createBy).equalTo(row::getCreateBy)
            .set(companySize).equalTo(row::getCompanySize)
            .set(companyEmail).equalTo(row::getCompanyEmail)
            .set(updateTime).equalTo(row::getUpdateTime)
            .set(isDelete).equalTo(row::getIsDelete)
            .set(companyTelno).equalTo(row::getCompanyTelno)
            .set(websiteCompany).equalTo(row::getWebsiteCompany)
            .set(longitude).equalTo(row::getLongitude)
            .set(pwd).equalTo(row::getPwd)
            .set(companyStatus).equalTo(row::getCompanyStatus)
            .set(companyIndustry).equalTo(row::getCompanyIndustry)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .set(xxx).equalTo(row::getXxx)
            .where(companyId, isEqualTo(row::getCompanyId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.241+08:00", comments="Source Table: company")
    default int updateByPrimaryKeySelective(Company row) {
        return update(c ->
            c.set(companyName).equalToWhenPresent(row::getCompanyName)
            .set(companyType).equalToWhenPresent(row::getCompanyType)
            .set(compayAddress).equalToWhenPresent(row::getCompayAddress)
            .set(companyIntroduction).equalToWhenPresent(row::getCompanyIntroduction)
            .set(createBy).equalToWhenPresent(row::getCreateBy)
            .set(companySize).equalToWhenPresent(row::getCompanySize)
            .set(companyEmail).equalToWhenPresent(row::getCompanyEmail)
            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
            .set(isDelete).equalToWhenPresent(row::getIsDelete)
            .set(companyTelno).equalToWhenPresent(row::getCompanyTelno)
            .set(websiteCompany).equalToWhenPresent(row::getWebsiteCompany)
            .set(longitude).equalToWhenPresent(row::getLongitude)
            .set(pwd).equalToWhenPresent(row::getPwd)
            .set(companyStatus).equalToWhenPresent(row::getCompanyStatus)
            .set(companyIndustry).equalToWhenPresent(row::getCompanyIndustry)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .set(xxx).equalToWhenPresent(row::getXxx)
            .where(companyId, isEqualTo(row::getCompanyId))
        );
    }
}