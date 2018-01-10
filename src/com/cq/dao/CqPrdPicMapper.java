package com.cq.dao;

import java.util.List;
import java.util.Map;

import com.cq.model.CqPrdPic;

public interface CqPrdPicMapper {
    int deleteByPrimaryKey(String id);

    int insert(CqPrdPic record);

    int insertSelective(CqPrdPic record);

    CqPrdPic selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CqPrdPic record);

    int updateByPrimaryKey(CqPrdPic record);

    /**
     * ����prdId��ѯ����Ʒ�µ���������ͼƬ
     * @return
     */
	List<Map<String,Object>> getPrdPicList(String prdId);
}