package com.cq.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.cq.dao.CqPrdMapper;
import com.cq.dao.CqPrdPicMapper;
import com.cq.model.CqPrd;
import com.cq.service.CqPrdPicService;

@Service
public class CqPrdPicServiceImpl implements CqPrdPicService{
	Logger logger = Logger.getLogger(CqPrdPicServiceImpl.class); 
	
	@Autowired
	private CqPrdPicMapper cqPrdPicMapper;

	@Autowired
	private CqPrdMapper cqPrdMapper;


	@Override
	public void getPrdPicList(String prdId, Map<String, Object> model) {
		logger.info("开始查询数据");
		List<Map<String, Object>> picList =  this.cqPrdPicMapper.getPrdPicList(prdId);
		if(!CollectionUtils.isEmpty(picList)){
			if(picList.size()>5){
				picList = picList.subList(0, 5);
			}
			model.put("picList", picList);
		}
		
		CqPrd cqPrd = this.cqPrdMapper.selectByPrimaryKey(prdId);
		model.put("cqPrd", cqPrd);
	}
	
	
	public static void main(String[] args) {
		List test = new ArrayList();
		test.add("0");
		test.add("1");
		test.add("2");
		test.add("3");
		test = test.subList(0, 3);
		System.out.println(JSON.toJSONString(test));
	}
}
