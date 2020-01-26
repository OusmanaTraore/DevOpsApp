package com.gtm.devops;

import static org.assertj.core.api.Assertions.assertThat;

import com.gtm.devops.controller.LoginController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class DevOpsApplicationTests {

	@Autowired
	private LoginController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}