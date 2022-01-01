package com.crm.amdocs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Product {
	
	@Test
	public void deleteProduct() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
	
	@Test
	public void modifyProduct() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
