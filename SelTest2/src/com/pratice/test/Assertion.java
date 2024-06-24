package com.pratice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
@Test
public void TestVerifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String ExpectedTitle = "Soogle";
	String ActualTitle = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(ActualTitle, ExpectedTitle);
	driver.close();
}
}