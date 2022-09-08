package com.songyang.entity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Mycollection implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.collection_id")
    private Integer collectionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.rec_id")
    private Integer recId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.per_id")
    private Integer perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.mycollection_status")
    private Integer mycollectionStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: mycollection")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.collection_id")
    public Integer getCollectionId() {
        return collectionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.collection_id")
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.rec_id")
    public Integer getRecId() {
        return recId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.rec_id")
    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.per_id")
    public Integer getPerId() {
        return perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.per_id")
    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.mycollection_status")
    public Integer getMycollectionStatus() {
        return mycollectionStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.mycollection_status")
    public void setMycollectionStatus(Integer mycollectionStatus) {
        this.mycollectionStatus = mycollectionStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source field: mycollection.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.261+08:00", comments="Source Table: mycollection")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectionId=").append(collectionId);
        sb.append(", recId=").append(recId);
        sb.append(", perId=").append(perId);
        sb.append(", mycollectionStatus=").append(mycollectionStatus);
        sb.append(", x=").append(x);
        sb.append(", xx=").append(xx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}