package com.songyang.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Persons implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_id")
    private Integer perId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_name")
    private String perName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_gender")
    private Integer perGender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_birth")
    private Date perBirth;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_tel")
    private Long perTel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_email")
    private String perEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_address")
    private String perAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_image")
    private String perImage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_status")
    private Integer perStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.person_status")
    private Integer personStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.xx")
    private String xx;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.x")
    private String x;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: persons")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_id")
    public Integer getPerId() {
        return perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_id")
    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.password")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_name")
    public String getPerName() {
        return perName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_name")
    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_gender")
    public Integer getPerGender() {
        return perGender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_gender")
    public void setPerGender(Integer perGender) {
        this.perGender = perGender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_birth")
    public Date getPerBirth() {
        return perBirth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_birth")
    public void setPerBirth(Date perBirth) {
        this.perBirth = perBirth;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_tel")
    public Long getPerTel() {
        return perTel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_tel")
    public void setPerTel(Long perTel) {
        this.perTel = perTel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_email")
    public String getPerEmail() {
        return perEmail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_email")
    public void setPerEmail(String perEmail) {
        this.perEmail = perEmail == null ? null : perEmail.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_address")
    public String getPerAddress() {
        return perAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_address")
    public void setPerAddress(String perAddress) {
        this.perAddress = perAddress == null ? null : perAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_image")
    public String getPerImage() {
        return perImage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_image")
    public void setPerImage(String perImage) {
        this.perImage = perImage == null ? null : perImage.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_status")
    public Integer getPerStatus() {
        return perStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.per_status")
    public void setPerStatus(Integer perStatus) {
        this.perStatus = perStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.person_status")
    public Integer getPersonStatus() {
        return personStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.person_status")
    public void setPersonStatus(Integer personStatus) {
        this.personStatus = personStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.xx")
    public String getXx() {
        return xx;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.xx")
    public void setXx(String xx) {
        this.xx = xx == null ? null : xx.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.x")
    public String getX() {
        return x;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source field: persons.x")
    public void setX(String x) {
        this.x = x == null ? null : x.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-07T09:06:42.269+08:00", comments="Source Table: persons")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", perId=").append(perId);
        sb.append(", password=").append(password);
        sb.append(", perName=").append(perName);
        sb.append(", perGender=").append(perGender);
        sb.append(", perBirth=").append(perBirth);
        sb.append(", perTel=").append(perTel);
        sb.append(", perEmail=").append(perEmail);
        sb.append(", perAddress=").append(perAddress);
        sb.append(", perImage=").append(perImage);
        sb.append(", perStatus=").append(perStatus);
        sb.append(", personStatus=").append(personStatus);
        sb.append(", xx=").append(xx);
        sb.append(", x=").append(x);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}