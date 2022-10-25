package com.songyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.songyang.common.entity.Storage;
import com.songyang.mapper.StorageMapper;
import com.songyang.service.IStockService;
import org.springframework.stereotype.Service;

/**
 * @author Yang Song
 * @date 2022/10/18 11:50
 */
@Service
public class StockServiceImpl implements IStockService {
    private final StorageMapper storageMapper;

    public StockServiceImpl(StorageMapper storageMapper) {
        this.storageMapper = storageMapper;
    }
    @Override
    public void deduct(String commodityCode, int count) {
        // 扣库存
        UpdateWrapper<Storage> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("commodity_code",commodityCode);
        updateWrapper.setSql("count = count - "+count);
        storageMapper.update(null,updateWrapper);
    }

    @Override
    public void batchDeduct(String commodityCode, int count) {

    }
}
