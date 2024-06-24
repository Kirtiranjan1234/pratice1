package com.pratice.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModifyCustomer {
	
	@Test
	public void modifyCustomer() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
	@Test
	public void modifyCustomer2() {
		Reporter.log("Double Modify Customer", true);
}
}
