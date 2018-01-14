package com.cq.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.cq.dao.CqPrdFilmMapper;
import com.cq.model.CqPrd;
import com.cq.model.CqPrdFilm;
import com.cq.service.CqPrdFilmService;

@Service
public class CqPrdFilmServiceImpl implements CqPrdFilmService{
	Logger logger = Logger.getLogger(CqPrdFilmServiceImpl.class); 
	
	@Autowired
	private CqPrdFilmMapper cqPrdFilmMapper;


	


	@Override
	public List<CqPrdFilm> getPrdFilmList() {
		logger.info("开始查询数据");
		List<CqPrdFilm> filmList =  this.cqPrdFilmMapper.getPrdFilmList();
		return filmList;
	}
}
