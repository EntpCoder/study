package com.songyang.template;

/**
 * @author Yang Song
 * @date 2022/9/2 16:10
 */
public interface IBaseDao<T>{
    /**
     * 通用插入方法
     * @param entity 插入实体
     * @return 影响行数
     */
    int insert(T entity);
}
