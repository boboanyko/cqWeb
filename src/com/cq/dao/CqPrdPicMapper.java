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
     * 根据prdId查询该商品下的所有详情图片
     * @return
     */
	List<Map<String,Object>> getPrdPicList(String prdId);
}