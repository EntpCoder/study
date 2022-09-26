package com.songyang.mapper;

import com.songyang.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 * @author Yang Song
 * @since 2022-09-23
 */
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}
