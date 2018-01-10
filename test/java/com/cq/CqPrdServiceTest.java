package com.cq;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cq.model.CqPrd;
import com.cq.service.CqPrdService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:config/*.xml"})
@WebAppConfiguration
public class CqPrdServiceTest {

	@Autowired
	private CqPrdService cqPrdService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("success");
		List<CqPrd> cqPrdList = cqPrdService.getPrdList();
		System.out.println(Arrays.toString(cqPrdList.toArray()));
	}

}
