package com.tib.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingEx {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/");
	    
	    driver.switchTo().frame("a077aa5e");
	    
	    WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	    image.click();
	    
	    
	    
	    
	}

}
