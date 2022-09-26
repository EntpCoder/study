package com.songyang.service.impl;

import com.songyang.entity.Product;
import com.songyang.mapper.ProductMapper;
import com.songyang.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表  服务实现类
 * </p>
 * @author Yang Song
 * @since 2022-09-23
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
