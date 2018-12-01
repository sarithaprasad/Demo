package com.tib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement signin =driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signin).build().perform();
		

	}

}
