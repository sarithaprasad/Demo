package com.tib.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
public class MyPractice {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultimatix.net");
		driver.findElement(By.id("USER")).sendKeys("1059071");
		driver.findElement(By.id("PASSWORD")).sendKeys("");
		
		//Thread.sleep(1000);
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("menuDropdownImg")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("MainCates_26"))).click();
		
       action.click(driver.findElement(By.xpath("//a[contains(text(),'My Allocation & Utilization')]"))).build().perform();
		
		

	}

}
