package com.cq;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cq.dao.PrdGroupMapper;
import com.cq.model.PrdGroup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:config/*.xml"})
@WebAppConfiguration
public class PrdGroupServiceTest {

	@Autowired
	private PrdGroupMapper prdGroupMapper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("success");
		PrdGroup groupTest = prdGroupMapper.selectByPrimaryKey("1");
		System.out.println(groupTest.toString());
	}

}
