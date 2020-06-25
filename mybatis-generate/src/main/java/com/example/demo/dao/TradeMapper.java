package com.example.demo.dao;

import com.example.demo.model.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Long tradeId);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Long tradeId);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKeyWithBLOBs(Trade record);

    int updateByPrimaryKey(Trade record);
}