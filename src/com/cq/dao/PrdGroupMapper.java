package com.cq.dao;

import com.cq.model.PrdGroup;

public interface PrdGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(PrdGroup record);

    int insertSelective(PrdGroup record);

    PrdGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PrdGroup record);

    int updateByPrimaryKey(PrdGroup record);
}