package com.songyang.entity;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
            "id = " + id +
            ", username = " + username +
            ", sex = " + sex +
        "}";
    }
}
