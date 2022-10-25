package com.songyang.mapper;

import com.songyang.common.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Yang Song
 * @since 2022-10-18
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
