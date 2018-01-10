package com.cq.dao;

import java.util.List;

import com.cq.model.CqPrd;

public interface CqPrdMapper {
    int deleteByPrimaryKey(String id);

    int insert(CqPrd record);

    int insertSelective(CqPrd record);

    CqPrd selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CqPrd record);

    int updateByPrimaryKey(CqPrd record);

    
    /*
     * ��ȡ������Ʒ����
     */
	List<CqPrd> getPrdList();
}