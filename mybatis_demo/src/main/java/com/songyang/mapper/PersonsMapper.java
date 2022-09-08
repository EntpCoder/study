package com.songyang.mapper;

import static com.songyang.mapper.PersonsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.Persons;
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
public interface PersonsMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Persons>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    BasicColumn[] selectList = BasicColumn.columnList(perId, password, perName, perGender, perBirth, perTel, perEmail, perAddress, perImage, perStatus, personStatus, xx, x);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PersonsResult", value = {
        @Result(column="per_id", property="perId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="per_name", property="perName", jdbcType=JdbcType.VARCHAR),
        @Result(column="per_gender", property="perGender", jdbcType=JdbcType.INTEGER),
        @Result(column="per_birth", property="perBirth", jdbcType=JdbcType.DATE),
        @Result(column="per_tel", property="perTel", jdbcType=JdbcType.BIGINT),
        @Result(column="per_email", property="perEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="per_address", property="perAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="per_image", property="perImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="per_status", property="perStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="person_status", property="personStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR)
    })
    List<Persons> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PersonsResult")
    Optional<Persons> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int deleteByPrimaryKey(Integer perId_) {
        return delete(c -> 
            c.where(perId, isEqualTo(perId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int insert(Persons row) {
        return MyBatis3Utils.insert(this::insert, row, persons, c ->
            c.map(perId).toProperty("perId")
            .map(password).toProperty("password")
            .map(perName).toProperty("perName")
            .map(perGender).toProperty("perGender")
            .map(perBirth).toProperty("perBirth")
            .map(perTel).toProperty("perTel")
            .map(perEmail).toProperty("perEmail")
            .map(perAddress).toProperty("perAddress")
            .map(perImage).toProperty("perImage")
            .map(perStatus).toProperty("perStatus")
            .map(personStatus).toProperty("personStatus")
            .map(xx).toProperty("xx")
            .map(x).toProperty("x")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int insertMultiple(Collection<Persons> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, persons, c ->
            c.map(perId).toProperty("perId")
            .map(password).toProperty("password")
            .map(perName).toProperty("perName")
            .map(perGender).toProperty("perGender")
            .map(perBirth).toProperty("perBirth")
            .map(perTel).toProperty("perTel")
            .map(perEmail).toProperty("perEmail")
            .map(perAddress).toProperty("perAddress")
            .map(perImage).toProperty("perImage")
            .map(perStatus).toProperty("perStatus")
            .map(personStatus).toProperty("personStatus")
            .map(xx).toProperty("xx")
            .map(x).toProperty("x")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int insertSelective(Persons row) {
        return MyBatis3Utils.insert(this::insert, row, persons, c ->
            c.map(perId).toPropertyWhenPresent("perId", row::getPerId)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
            .map(perName).toPropertyWhenPresent("perName", row::getPerName)
            .map(perGender).toPropertyWhenPresent("perGender", row::getPerGender)
            .map(perBirth).toPropertyWhenPresent("perBirth", row::getPerBirth)
            .map(perTel).toPropertyWhenPresent("perTel", row::getPerTel)
            .map(perEmail).toPropertyWhenPresent("perEmail", row::getPerEmail)
            .map(perAddress).toPropertyWhenPresent("perAddress", row::getPerAddress)
            .map(perImage).toPropertyWhenPresent("perImage", row::getPerImage)
            .map(perStatus).toPropertyWhenPresent("perStatus", row::getPerStatus)
            .map(personStatus).toPropertyWhenPresent("personStatus", row::getPersonStatus)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
            .map(x).toPropertyWhenPresent("x", row::getX)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default Optional<Persons> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default List<Persons> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default List<Persons> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default Optional<Persons> selectByPrimaryKey(Integer perId_) {
        return selectOne(c ->
            c.where(perId, isEqualTo(perId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, persons, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    static UpdateDSL<UpdateModel> updateAllColumns(Persons row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(perId).equalTo(row::getPerId)
                .set(password).equalTo(row::getPassword)
                .set(perName).equalTo(row::getPerName)
                .set(perGender).equalTo(row::getPerGender)
                .set(perBirth).equalTo(row::getPerBirth)
                .set(perTel).equalTo(row::getPerTel)
                .set(perEmail).equalTo(row::getPerEmail)
                .set(perAddress).equalTo(row::getPerAddress)
                .set(perImage).equalTo(row::getPerImage)
                .set(perStatus).equalTo(row::getPerStatus)
                .set(personStatus).equalTo(row::getPersonStatus)
                .set(xx).equalTo(row::getXx)
                .set(x).equalTo(row::getX);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Persons row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(perId).equalToWhenPresent(row::getPerId)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(perName).equalToWhenPresent(row::getPerName)
                .set(perGender).equalToWhenPresent(row::getPerGender)
                .set(perBirth).equalToWhenPresent(row::getPerBirth)
                .set(perTel).equalToWhenPresent(row::getPerTel)
                .set(perEmail).equalToWhenPresent(row::getPerEmail)
                .set(perAddress).equalToWhenPresent(row::getPerAddress)
                .set(perImage).equalToWhenPresent(row::getPerImage)
                .set(perStatus).equalToWhenPresent(row::getPerStatus)
                .set(personStatus).equalToWhenPresent(row::getPersonStatus)
                .set(xx).equalToWhenPresent(row::getXx)
                .set(x).equalToWhenPresent(row::getX);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int updateByPrimaryKey(Persons row) {
        return update(c ->
            c.set(password).equalTo(row::getPassword)
            .set(perName).equalTo(row::getPerName)
            .set(perGender).equalTo(row::getPerGender)
            .set(perBirth).equalTo(row::getPerBirth)
            .set(perTel).equalTo(row::getPerTel)
            .set(perEmail).equalTo(row::getPerEmail)
            .set(perAddress).equalTo(row::getPerAddress)
            .set(perImage).equalTo(row::getPerImage)
            .set(perStatus).equalTo(row::getPerStatus)
            .set(personStatus).equalTo(row::getPersonStatus)
            .set(xx).equalTo(row::getXx)
            .set(x).equalTo(row::getX)
            .where(perId, isEqualTo(row::getPerId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.273+08:00", comments="Source Table: persons")
    default int updateByPrimaryKeySelective(Persons row) {
        return update(c ->
            c.set(password).equalToWhenPresent(row::getPassword)
            .set(perName).equalToWhenPresent(row::getPerName)
            .set(perGender).equalToWhenPresent(row::getPerGender)
            .set(perBirth).equalToWhenPresent(row::getPerBirth)
            .set(perTel).equalToWhenPresent(row::getPerTel)
            .set(perEmail).equalToWhenPresent(row::getPerEmail)
            .set(perAddress).equalToWhenPresent(row::getPerAddress)
            .set(perImage).equalToWhenPresent(row::getPerImage)
            .set(perStatus).equalToWhenPresent(row::getPerStatus)
            .set(personStatus).equalToWhenPresent(row::getPersonStatus)
            .set(xx).equalToWhenPresent(row::getXx)
            .set(x).equalToWhenPresent(row::getX)
            .where(perId, isEqualTo(row::getPerId))
        );
    }
}