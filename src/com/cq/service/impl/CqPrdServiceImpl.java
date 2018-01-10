package com.cq.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cq.dao.CqPrdMapper;
import com.cq.model.CqPrd;
import com.cq.service.CqPrdService;

@Service
public class CqPrdServiceImpl implements CqPrdService{
	Logger logger = Logger.getLogger(CqPrdServiceImpl.class); 
	
	@Autowired
	private CqPrdMapper cqPrdMapper;

	@Override
	public List<CqPrd> getPrdList() {
		logger.info("开始查询数据");
		return this.cqPrdMapper.getPrdList();
	}
	
	
	
}
