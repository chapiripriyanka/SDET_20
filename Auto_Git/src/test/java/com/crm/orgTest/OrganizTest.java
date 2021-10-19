package com.crm.orgTest;

import org.testng.annotations.Test;

public class OrganizTest {

	@Test(groups="SmokeTest")
	public void organizTest() {
		System.out.println("execute OrganizationTest1");
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser");
		String Un = System.getProperty("username");
		String Pwd = System.getProperty("password");
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println(Un);
		System.out.println(Pwd);
	}
	@Test
	public void editorganizTest() {
		System.out.println("execute OrganizationTest2");
	}
}
