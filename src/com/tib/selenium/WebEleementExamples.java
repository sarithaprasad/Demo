package com.tib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebEleementExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.amazon.in/");
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
		
		
		WebDriverWait wait =  (WebDriverWait) new FluentWait(driver).pollingEvery(5,TimeUnit.SECONDS);
		
		
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		boolean sbd = searchbox.isDisplayed();
		
		System.out.println("Is serach box displayed? --> "+sbd);
		
		String attributeSb= searchbox.getAttribute("class");
		
		System.out.println("The class attribute of search box is --> "+attributeSb);
	
		System.out.println("The tagname of search box is --> "+searchbox.getTagName());
	
		System.out.println("The location of search box is --> "+searchbox.getLocation());
		
		System.out.println("The CSS Value of search box is --> "+searchbox.getCssValue("color"));
		
		WebElement username = driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]"));
		
		System.out.println("The text of username element is -->"+username.getText());
		
		searchbox.sendKeys("Mobile Phones");
		searchbox.clear();
		
		searchbox.sendKeys("Tablets");
		
		WebElement searchbin = driver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']"));
		
		searchbin.click();

	}

}
