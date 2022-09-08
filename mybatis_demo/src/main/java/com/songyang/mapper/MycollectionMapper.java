package com.songyang.mapper;

import static com.songyang.mapper.MycollectionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.songyang.entity.Mycollection;
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
public interface MycollectionMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Mycollection>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    BasicColumn[] selectList = BasicColumn.columnList(collectionId, recId, perId, mycollectionStatus, x, xx);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycollectionResult", value = {
        @Result(column="collection_id", property="collectionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="rec_id", property="recId", jdbcType=JdbcType.INTEGER),
        @Result(column="per_id", property="perId", jdbcType=JdbcType.INTEGER),
        @Result(column="mycollection_status", property="mycollectionStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="x", property="x", jdbcType=JdbcType.VARCHAR),
        @Result(column="xx", property="xx", jdbcType=JdbcType.VARCHAR)
    })
    List<Mycollection> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MycollectionResult")
    Optional<Mycollection> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int deleteByPrimaryKey(Integer collectionId_) {
        return delete(c -> 
            c.where(collectionId, isEqualTo(collectionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int insert(Mycollection row) {
        return MyBatis3Utils.insert(this::insert, row, mycollection, c ->
            c.map(collectionId).toProperty("collectionId")
            .map(recId).toProperty("recId")
            .map(perId).toProperty("perId")
            .map(mycollectionStatus).toProperty("mycollectionStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int insertMultiple(Collection<Mycollection> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mycollection, c ->
            c.map(collectionId).toProperty("collectionId")
            .map(recId).toProperty("recId")
            .map(perId).toProperty("perId")
            .map(mycollectionStatus).toProperty("mycollectionStatus")
            .map(x).toProperty("x")
            .map(xx).toProperty("xx")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int insertSelective(Mycollection row) {
        return MyBatis3Utils.insert(this::insert, row, mycollection, c ->
            c.map(collectionId).toPropertyWhenPresent("collectionId", row::getCollectionId)
            .map(recId).toPropertyWhenPresent("recId", row::getRecId)
            .map(perId).toPropertyWhenPresent("perId", row::getPerId)
            .map(mycollectionStatus).toPropertyWhenPresent("mycollectionStatus", row::getMycollectionStatus)
            .map(x).toPropertyWhenPresent("x", row::getX)
            .map(xx).toPropertyWhenPresent("xx", row::getXx)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default Optional<Mycollection> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default List<Mycollection> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default List<Mycollection> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default Optional<Mycollection> selectByPrimaryKey(Integer collectionId_) {
        return selectOne(c ->
            c.where(collectionId, isEqualTo(collectionId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mycollection, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    static UpdateDSL<UpdateModel> updateAllColumns(Mycollection row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collectionId).equalTo(row::getCollectionId)
                .set(recId).equalTo(row::getRecId)
                .set(perId).equalTo(row::getPerId)
                .set(mycollectionStatus).equalTo(row::getMycollectionStatus)
                .set(x).equalTo(row::getX)
                .set(xx).equalTo(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Mycollection row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(collectionId).equalToWhenPresent(row::getCollectionId)
                .set(recId).equalToWhenPresent(row::getRecId)
                .set(perId).equalToWhenPresent(row::getPerId)
                .set(mycollectionStatus).equalToWhenPresent(row::getMycollectionStatus)
                .set(x).equalToWhenPresent(row::getX)
                .set(xx).equalToWhenPresent(row::getXx);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int updateByPrimaryKey(Mycollection row) {
        return update(c ->
            c.set(recId).equalTo(row::getRecId)
            .set(perId).equalTo(row::getPerId)
            .set(mycollectionStatus).equalTo(row::getMycollectionStatus)
            .set(x).equalTo(row::getX)
            .set(xx).equalTo(row::getXx)
            .where(collectionId, isEqualTo(row::getCollectionId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source Table: mycollection")
    default int updateByPrimaryKeySelective(Mycollection row) {
        return update(c ->
            c.set(recId).equalToWhenPresent(row::getRecId)
            .set(perId).equalToWhenPresent(row::getPerId)
            .set(mycollectionStatus).equalToWhenPresent(row::getMycollectionStatus)
            .set(x).equalToWhenPresent(row::getX)
            .set(xx).equalToWhenPresent(row::getXx)
            .where(collectionId, isEqualTo(row::getCollectionId))
        );
    }
}