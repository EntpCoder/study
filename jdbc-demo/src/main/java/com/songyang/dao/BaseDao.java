package com.songyang.dao;


import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/4 23:20
 */
public interface BaseDao<T> {
    public int insert(T t);
    public int deleteById(Long id);
    public int update(T t);
    public List<T> selectAll();
    public T selectById(Long id);
}
