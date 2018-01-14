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
     * ��ѯ���е�Ӱ���б�
     * @return
     */
	List<CqPrdFilm> getPrdFilmList();
}