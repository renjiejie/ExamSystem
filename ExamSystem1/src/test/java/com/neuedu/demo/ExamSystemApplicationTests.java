package com.neuedu.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neuedu.demo.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamSystemApplicationTests {
	@Autowired
	private UserController uc;
	@Test
	public void contextLoads() {
		uc.login("xie", "123");
	}

}
