package com.songyang.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class MycollectionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: mycollection")
    public static final Mycollection mycollection = new Mycollection();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.collection_id")
    public static final SqlColumn<Integer> collectionId = mycollection.collectionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: mycollection.rec_id")
    public static final SqlColumn<Integer> recId = mycollection.recId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: mycollection.per_id")
    public static final SqlColumn<Integer> perId = mycollection.perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: mycollection.mycollection_status")
    public static final SqlColumn<Integer> mycollectionStatus = mycollection.mycollectionStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: mycollection.x")
    public static final SqlColumn<String> x = mycollection.x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.265+08:00", comments="Source field: mycollection.xx")
    public static final SqlColumn<String> xx = mycollection.xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: mycollection")
    public static final class Mycollection extends AliasableSqlTable<Mycollection> {
        public final SqlColumn<Integer> collectionId = column("collection_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> recId = column("rec_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> perId = column("per_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> mycollectionStatus = column("mycollection_status", JDBCType.INTEGER);

        public final SqlColumn<String> x = column("x", JDBCType.VARCHAR);

        public final SqlColumn<String> xx = column("xx", JDBCType.VARCHAR);

        public Mycollection() {
            super("mycollection", Mycollection::new);
        }
    }
}