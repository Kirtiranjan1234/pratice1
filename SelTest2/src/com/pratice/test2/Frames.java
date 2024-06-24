package com.pratice.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kirti/OneDrive/Desktop/page%201.html");
	driver.findElement(By.id("d1")).sendKeys("Apu");
	driver.switchTo().frame(0);
	driver.findElement(By.id("d2")).sendKeys("Kirtiranjan");
	}

}
