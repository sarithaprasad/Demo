package com.tib.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.in/");
		
		
		
		driver.navigate().back(); // goes back to google.
		
		
		
		driver.navigate().forward(); // goes to amazon.
		
		
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Mobile phones");
		
		Thread.sleep(1000);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String currentTitle = driver.getTitle();
		
		System.out.println(currentTitle);
		
		//String currentPageSource = driver.getPageSource();
		
		//System.out.println(currentPageSource);
		
		driver.close();
		
		driver.quit();
	}

}
