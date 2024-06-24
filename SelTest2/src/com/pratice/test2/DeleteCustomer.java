package com.pratice.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCustomer {
	@Test
	public void deleteCustomer() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
	}
}
