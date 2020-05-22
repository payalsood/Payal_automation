package com.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeClass
	public void logIn(){
		System.out.println("Login method");
	}
	
	
	@BeforeMethod
	public void enterUrl(){
		System.out.println("Enter url");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launch the browser");
	}
	
	@BeforeSuite
	public void setUp(){
		System.out.println("Setup system property for chrome");
	}
	
	@Test
	public void googleTitleTest(){
		System.out.println("Google Title Test One");
	}
	
	@Test
	public void chromeTitleTest(){
		System.out.println("Chrome Title Test");
	}
	
	@AfterMethod
	public void logOut(){
		System.out.println("logout method");
	}
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("Close browser");
	}
	
	@AfterSuite
	public void generateTestReport(){
		System.out.println("Generate Test Reports");
	}
	
	
	
	
	
	
	
	

}
