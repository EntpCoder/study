package com.songyang.mapper;


import java.io.Serializable;
import java.util.List;

/**
 * @author Yang Song
 * @date 2022/9/4 23:20
 */
public interface BaseMapper<T> {
    /**
     * 插入数据
     *
     * @param t 对象
     * @return 影响行
     */
    public int insert(T t);

    /**
     * 删除数据
     * @param id id
     * @return 影响行
     */
    public int deleteById(Serializable id);

    /**
     * 更新数据
     * @param t 更新对象
     * @return 影响行
     */
    public int update(T t);

    /**
     * 查询所有
     * @return 结果集
     */
    public List<T> selectAll();

    /**
     * 根据id查询
     * @param id id
     * @return 结果对象
     */
    public T selectById(Long id);
}
