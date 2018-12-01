package com.tib.windowHandling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM_RELATED\\chrome_driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/popup.php");
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.open('https://www.w3schools.com/jsref/met_win_open.asp')");

	}

}
