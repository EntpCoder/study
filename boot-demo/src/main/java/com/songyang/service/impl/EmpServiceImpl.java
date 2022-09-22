package com.songyang.service.impl;

import com.songyang.entity.Emp;
import com.songyang.mapper.EmpMapper;
import com.songyang.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-22
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
