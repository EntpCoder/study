package com.songyang.mapper;

import static com.songyang.mapper.InterviewInvitationDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.InterviewInvitation;
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
public interface InterviewInvitationMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<InterviewInvitation>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    BasicColumn[] selectList = BasicColumn.columnList(invitationId, companyId, resumeId, isAgree, invitationTime, companyContact, companyTelno, interviewInvitationStatus, x, xx, xxx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InterviewInvitationResult", value = {
        @Result(column="invitation_id", property="invitationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="resume_id", property="resumeId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_agree", property="isAgree", jdbcType=JdbcType.INTEGER),
        @Result(column="invitation_time", property="invitationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="company_contact", property="companyContact", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_telno", property="companyTelno", jdbcType=JdbcType.INTEGER),
        @Result(column="interview_invitation_status", property="interviewInvitationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR),
        @Result(column="xxx", property="xxx", jdbcType=JdbcType.VARCHAR)
    })
    List<InterviewInvitation> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InterviewInvitationResult")
    Optional<InterviewInvitation> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int deleteByPrimaryKey(Integer invitationId_) {
        return delete(c -> 
            c.where(invitationId, isEqualTo(invitationId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int insert(InterviewInvitation row) {
        return MyBatis3Utils.insert(this::insert, row, interviewInvitation, c ->
            c.map(invitationId).toProperty("invitationId")
            .map(companyId).toProperty("companyId")
            .map(resumeId).toProperty("resumeId")
            .map(isAgree).toProperty("isAgree")
            .map(invitationTime).toProperty("invitationTime")
            .map(companyContact).toProperty("companyContact")
            .map(companyTelno).toProperty("companyTelno")
            .map(interviewInvitationStatus).toProperty("interviewInvitationStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(xxx).toProperty("xxx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int insertMultiple(Collection<InterviewInvitation> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, interviewInvitation, c ->
            c.map(invitationId).toProperty("invitationId")
            .map(companyId).toProperty("companyId")
            .map(resumeId).toProperty("resumeId")
            .map(isAgree).toProperty("isAgree")
            .map(invitationTime).toProperty("invitationTime")
            .map(companyContact).toProperty("companyContact")
            .map(companyTelno).toProperty("companyTelno")
            .map(interviewInvitationStatus).toProperty("interviewInvitationStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
            .map(xxx).toProperty("xxx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int insertSelective(InterviewInvitation row) {
        return MyBatis3Utils.insert(this::insert, row, interviewInvitation, c ->
            c.map(invitationId).toPropertyWhenPresent("invitationId", row::getInvitationId)
            .map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(resumeId).toPropertyWhenPresent("resumeId", row::getResumeId)
            .map(isAgree).toPropertyWhenPresent("isAgree", row::getIsAgree)
            .map(invitationTime).toPropertyWhenPresent("invitationTime", row::getInvitationTime)
            .map(companyContact).toPropertyWhenPresent("companyContact", row::getCompanyContact)
            .map(companyTelno).toPropertyWhenPresent("companyTelno", row::getCompanyTelno)
            .map(interviewInvitationStatus).toPropertyWhenPresent("interviewInvitationStatus", row::getInterviewInvitationStatus)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
            .map(xxx).toPropertyWhenPresent("xxx", row::getXxx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default Optional<InterviewInvitation> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default List<InterviewInvitation> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default List<InterviewInvitation> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default Optional<InterviewInvitation> selectByPrimaryKey(Integer invitationId_) {
        return selectOne(c ->
            c.where(invitationId, isEqualTo(invitationId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, interviewInvitation, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    static UpdateDSL<UpdateModel> updateAllColumns(InterviewInvitation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(invitationId).equalTo(row::getInvitationId)
                .set(companyId).equalTo(row::getCompanyId)
                .set(resumeId).equalTo(row::getResumeId)
                .set(isAgree).equalTo(row::getIsAgree)
                .set(invitationTime).equalTo(row::getInvitationTime)
                .set(companyContact).equalTo(row::getCompanyContact)
                .set(companyTelno).equalTo(row::getCompanyTelno)
                .set(interviewInvitationStatus).equalTo(row::getInterviewInvitationStatus)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx)
                .set(xxx).equalTo(row::getXxx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(InterviewInvitation row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(invitationId).equalToWhenPresent(row::getInvitationId)
                .set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(resumeId).equalToWhenPresent(row::getResumeId)
                .set(isAgree).equalToWhenPresent(row::getIsAgree)
                .set(invitationTime).equalToWhenPresent(row::getInvitationTime)
                .set(companyContact).equalToWhenPresent(row::getCompanyContact)
                .set(companyTelno).equalToWhenPresent(row::getCompanyTelno)
                .set(interviewInvitationStatus).equalToWhenPresent(row::getInterviewInvitationStatus)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx)
                .set(xxx).equalToWhenPresent(row::getXxx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int updateByPrimaryKey(InterviewInvitation row) {
        return update(c ->
            c.set(companyId).equalTo(row::getCompanyId)
            .set(resumeId).equalTo(row::getResumeId)
            .set(isAgree).equalTo(row::getIsAgree)
            .set(invitationTime).equalTo(row::getInvitationTime)
            .set(companyContact).equalTo(row::getCompanyContact)
            .set(companyTelno).equalTo(row::getCompanyTelno)
            .set(interviewInvitationStatus).equalTo(row::getInterviewInvitationStatus)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .set(xxx).equalTo(row::getXxx)
            .where(invitationId, isEqualTo(row::getInvitationId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: interview_invitation")
    default int updateByPrimaryKeySelective(InterviewInvitation row) {
        return update(c ->
            c.set(companyId).equalToWhenPresent(row::getCompanyId)
            .set(resumeId).equalToWhenPresent(row::getResumeId)
            .set(isAgree).equalToWhenPresent(row::getIsAgree)
            .set(invitationTime).equalToWhenPresent(row::getInvitationTime)
            .set(companyContact).equalToWhenPresent(row::getCompanyContact)
            .set(companyTelno).equalToWhenPresent(row::getCompanyTelno)
            .set(interviewInvitationStatus).equalToWhenPresent(row::getInterviewInvitationStatus)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .set(xxx).equalToWhenPresent(row::getXxx)
            .where(invitationId, isEqualTo(row::getInvitationId))
        );
    }
}