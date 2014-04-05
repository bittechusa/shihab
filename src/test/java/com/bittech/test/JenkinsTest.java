package com.bittech.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JenkinsTest 
{
	WebDriver driver =null;
	@Test
	public void shihab()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		driver.quit();
		
	}
	
	// This is my test
	
	@Test
	public void hamid()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.quit();
		
	}
	
}
