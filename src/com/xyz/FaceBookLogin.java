package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	 WebDriver driver = new ChromeDriver();
 public static void  main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://facebook.com");
	 driver.findElement(By.id("email")).sendKeys("russel2005@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("Momo2005");
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();
 }
}
