package com.pratice.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	WebElement Resources = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(Resources).perform();
	driver.findElement(By.xpath("(//a[@href='https://www.vtiger.com/contact-us/'])[1]")).click();
	String Text = driver.findElement(By.xpath("//p[contains(text(),' Bengaluru')]/..//p[2]")).getText();
	System.out.println(Text);
	driver.close();
	}

}
