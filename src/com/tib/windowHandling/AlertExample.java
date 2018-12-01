package com.tib.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement editbox = driver.findElement(By.xpath("//input[@name='cusid']"));
		
		editbox.sendKeys("53920");
		
		WebElement submitbutton = driver.findElement(By.xpath("//input[@name='submit']"));
		
		submitbutton.click();
		
		Thread.sleep(2000);
	
	driver.switchTo().alert().accept();

	}

}
