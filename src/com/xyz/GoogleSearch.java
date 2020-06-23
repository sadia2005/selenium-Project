package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void  main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Amazon.com");
	    driver.findElement(By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK' and @value='Google Search']")).click();
	    
}
}