package com.tib.windowHandling;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/popup.php");
	    
	    String currentWindow = driver.getWindowHandle();
	    
	   WebElement clk= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
	   
	   clk.click();
	   
	    Set s = new HashSet();
	    
	    s.addAll(driver.getWindowHandles());
	    
	    Iterator itr = s.iterator();
	    
	    while(itr.hasNext()){
	    	String childWindow = (String) itr.next();
	    	
	    	if(!currentWindow.equalsIgnoreCase(childWindow)){
	    		driver.switchTo().window(childWindow);
	    		
	    		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("saritha@gmail.com");
	    		driver.close();
	    	}
	    	
	    }
	    	driver.switchTo().window(currentWindow);
	    	
	    	clk.click();
	    	
	    }  

	}


