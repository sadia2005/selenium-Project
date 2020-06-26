package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.findElement(By.id("name")).sendKeys("momo");
		 driver.findElement(By.id("alertbtn")).click();
		 driver.switchTo().alert().accept();
		 driver.findElement(By.id("name")).sendKeys("momo");
		 driver.findElement(By.id("confirmbtn")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		 
		 
		
		 
		 
	}

}
