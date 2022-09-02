package com.songyang.template;

/**
 * @author Yang Song
 * @date 2022/9/2 16:13
 */
public class BaseDao<T> implements IBaseDao<T>{
    @Override
    public int insert(T entity) {
        return 0;
    }
}
