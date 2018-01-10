package com.cq.service;

import java.util.List;
import java.util.Map;

import com.cq.model.CqPrd;
import com.cq.model.CqPrdPic;

public interface CqPrdPicService {


	void getPrdPicList(String prdId, Map<String, Object> model);
}
