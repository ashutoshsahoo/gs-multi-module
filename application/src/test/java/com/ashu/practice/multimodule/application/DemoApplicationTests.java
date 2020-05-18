package com.ashu.practice.multimodule.application;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DemoApplication application;

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
