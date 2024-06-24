package com.pratice.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.news18.com/");
	int y = driver.findElement(By.xpath("//span[text()='MORE FROM NEWS18 CRICKETNEXT']")).getLocation().getY();
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
