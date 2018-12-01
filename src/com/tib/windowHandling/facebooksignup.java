package com.tib.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import java.io.File;

public class facebooksignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("saritha");
	    driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("sari");
	    driver.findElement(By.xpath("//input[@*='Mobile number or email address']")).sendKeys("9642413346");
	    driver.findElement(By.xpath("//input[@*='New password']")).sendKeys("sari@2018");
	    
	     
	     Select dropdown =new Select (driver.findElement(By.xpath("//select[@id='day']")));
	      dropdown.selectByValue("20");
	      Select drop =new Select (driver.findElement(By.xpath("//select[@id='month']")));
	      drop.selectByValue("10");
	      Select down =new Select (driver.findElement(By.xpath("//select[@id='year']")));
	      down.selectByValue("2000");
	      //driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
	      driver.findElement(By.xpath("//label[contains(text(),'Female')]/preceding-sibling::input")).click();
	      
	      
	    
	 }

}
