package com.auto.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebSiteTests {

	@BeforeTest
	public void initiate() {
		System.out.println("Initiating tests/ pre reqs");
	}

	@AfterTest
	public void tearDown() {
		System.out.println("Closing/exiting resources");
	}

	@Test
	public void test1() {
		System.out.println("Running Test1");
	}

	@Test
	public void test2() {
		System.out.println("Running Test1");
	}

	@Test
	public void test3() {
		System.out.println("Running Test1");
	}

}
