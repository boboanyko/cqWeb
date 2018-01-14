package com.cq.dao;

import java.util.List;

import com.cq.model.CqPrdFilm;

public interface CqPrdFilmMapper {
    int deleteByPrimaryKey(String id);

    int insert(CqPrdFilm record);

    int insertSelective(CqPrdFilm record);

    CqPrdFilm selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CqPrdFilm record);

    int updateByPrimaryKey(CqPrdFilm record);

    /**
     * 查询所有的影像列表
     * @return
     */
	List<CqPrdFilm> getPrdFilmList();
}