package com.crm.amdocs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Customer {
	
	@Test
	public void createCustomer() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		
	}
	
	@Test
	public void delteCustomer() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
}
