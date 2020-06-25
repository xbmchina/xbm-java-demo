package com.example.demo.dao;

import com.example.demo.model.shopBuyer;

public interface shopBuyerMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(shopBuyer record);

    int insertSelective(shopBuyer record);

    shopBuyer selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(shopBuyer record);

    int updateByPrimaryKeyWithBLOBs(shopBuyer record);

    int updateByPrimaryKey(shopBuyer record);
}