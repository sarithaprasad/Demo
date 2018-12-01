package com.tib.windowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pactice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0; i< linklist.size(); i++)
		{
		String linktext =	linklist.get(i).getText();
		System.out.println(linktext);
		}
			
		}
	}


