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
	
	// This is my test - shihab 2
	
	@Test
	public void shihab2()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.quit();
		
	}
	
	// This is my test - shihab 3
	
		@Test
		public void shihab3()
		{
			driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			driver.quit();
			
		}
	
		// This is my test - Latif
		
			@Test
			public void latif()
			{
				driver=new FirefoxDriver();
				driver.get("http://www.facebook.com");
				driver.quit();
				
			}
			
			// This is my test - prodeep
			
				@Test
				public void prodeep()
				{
					driver=new FirefoxDriver();
					driver.get("http://www.facebook.com");
					driver.quit();
					
				}
}
