package com.songyang.dao.impl;

import java.sql.ResultSet;

/**
 * @author Yang Song
 * @date 2022/9/4 23:54
 */
public interface Convert<T> {
    public T convert(ResultSet rs);
}
