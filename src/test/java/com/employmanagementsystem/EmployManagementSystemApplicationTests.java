package com.employmanagementsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootConfiguration
@SpringBootTest
class EmployManagementSystemApplicationTests {

	@Test
	void contextLoads() {
		int a=10;
		assertEquals(10,a);
	}
	

}
