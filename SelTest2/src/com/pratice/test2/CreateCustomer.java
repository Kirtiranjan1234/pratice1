package com.pratice.test2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer {
	
	@Test
	public void createCustomer() {
		WebDriver driver=new ChromeDriver();
		WebDriver driver2=new FirefoxDriver();
		driver.get("https://www.facebook.com/");	
		}

}
