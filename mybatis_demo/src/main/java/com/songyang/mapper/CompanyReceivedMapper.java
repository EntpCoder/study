package com.songyang.mapper;

import static com.songyang.mapper.CompanyReceivedDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.CompanyReceived;
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
public interface CompanyReceivedMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<CompanyReceived>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    BasicColumn[] selectList = BasicColumn.columnList(companyReceiveId, isRead, isInvitation, resumeId, receiveTime, companyReceivedStatus, x, xx, recId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CompanyReceivedResult", value = {
        @Result(column="company_receive_id", property="companyReceiveId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="is_read", property="isRead", jdbcType=JdbcType.INTEGER),
        @Result(column="is_invitation", property="isInvitation", jdbcType=JdbcType.INTEGER),
        @Result(column="resume_id", property="resumeId", jdbcType=JdbcType.INTEGER),
        @Result(column="receive_time", property="receiveTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="company_received_status", property="companyReceivedStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR),
        @Result(column="rec_id", property="recId", jdbcType=JdbcType.INTEGER)
    })
    List<CompanyReceived> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CompanyReceivedResult")
    Optional<CompanyReceived> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int deleteByPrimaryKey(Integer companyReceiveId_) {
        return delete(c -> 
            c.where(companyReceiveId, isEqualTo(companyReceiveId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int insert(CompanyReceived row) {
        return MyBatis3Utils.insert(this::insert, row, companyReceived, c ->
            c.map(companyReceiveId).toProperty("companyReceiveId")
            .map(isRead).toProperty("isRead")
            .map(isInvitation).toProperty("isInvitation")
            .map(resumeId).toProperty("resumeId")
            .map(receiveTime).toProperty("receiveTime")
            .map(companyReceivedStatus).toProperty("companyReceivedStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(recId).toProperty("recId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int insertMultiple(Collection<CompanyReceived> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, companyReceived, c ->
            c.map(companyReceiveId).toProperty("companyReceiveId")
            .map(isRead).toProperty("isRead")
            .map(isInvitation).toProperty("isInvitation")
            .map(resumeId).toProperty("resumeId")
            .map(receiveTime).toProperty("receiveTime")
            .map(companyReceivedStatus).toProperty("companyReceivedStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(recId).toProperty("recId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int insertSelective(CompanyReceived row) {
        return MyBatis3Utils.insert(this::insert, row, companyReceived, c ->
            c.map(companyReceiveId).toPropertyWhenPresent("companyReceiveId", row::getCompanyReceiveId)
            .map(isRead).toPropertyWhenPresent("isRead", row::getIsRead)
            .map(isInvitation).toPropertyWhenPresent("isInvitation", row::getIsInvitation)
            .map(resumeId).toPropertyWhenPresent("resumeId", row::getResumeId)
            .map(receiveTime).toPropertyWhenPresent("receiveTime", row::getReceiveTime)
            .map(companyReceivedStatus).toPropertyWhenPresent("companyReceivedStatus", row::getCompanyReceivedStatus)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
            .map(recId).toPropertyWhenPresent("recId", row::getRecId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default Optional<CompanyReceived> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default List<CompanyReceived> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default List<CompanyReceived> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default Optional<CompanyReceived> selectByPrimaryKey(Integer companyReceiveId_) {
        return selectOne(c ->
            c.where(companyReceiveId, isEqualTo(companyReceiveId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, companyReceived, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    static UpdateDSL<UpdateModel> updateAllColumns(CompanyReceived row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyReceiveId).equalTo(row::getCompanyReceiveId)
                .set(isRead).equalTo(row::getIsRead)
                .set(isInvitation).equalTo(row::getIsInvitation)
                .set(resumeId).equalTo(row::getResumeId)
                .set(receiveTime).equalTo(row::getReceiveTime)
                .set(companyReceivedStatus).equalTo(row::getCompanyReceivedStatus)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx)
                .set(recId).equalTo(row::getRecId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(CompanyReceived row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyReceiveId).equalToWhenPresent(row::getCompanyReceiveId)
                .set(isRead).equalToWhenPresent(row::getIsRead)
                .set(isInvitation).equalToWhenPresent(row::getIsInvitation)
                .set(resumeId).equalToWhenPresent(row::getResumeId)
                .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
                .set(companyReceivedStatus).equalToWhenPresent(row::getCompanyReceivedStatus)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx)
                .set(recId).equalToWhenPresent(row::getRecId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int updateByPrimaryKey(CompanyReceived row) {
        return update(c ->
            c.set(isRead).equalTo(row::getIsRead)
            .set(isInvitation).equalTo(row::getIsInvitation)
            .set(resumeId).equalTo(row::getResumeId)
            .set(receiveTime).equalTo(row::getReceiveTime)
            .set(companyReceivedStatus).equalTo(row::getCompanyReceivedStatus)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .set(recId).equalTo(row::getRecId)
            .where(companyReceiveId, isEqualTo(row::getCompanyReceiveId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.253+08:00", comments="Source Table: company_received")
    default int updateByPrimaryKeySelective(CompanyReceived row) {
        return update(c ->
            c.set(isRead).equalToWhenPresent(row::getIsRead)
            .set(isInvitation).equalToWhenPresent(row::getIsInvitation)
            .set(resumeId).equalToWhenPresent(row::getResumeId)
            .set(receiveTime).equalToWhenPresent(row::getReceiveTime)
            .set(companyReceivedStatus).equalToWhenPresent(row::getCompanyReceivedStatus)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .set(recId).equalToWhenPresent(row::getRecId)
            .where(companyReceiveId, isEqualTo(row::getCompanyReceiveId))
        );
    }
}