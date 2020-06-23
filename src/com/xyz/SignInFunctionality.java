package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInFunctionality {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.cssSelector("a.signin")).click();
		 driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sadia momo");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello");
		 driver.findElement(By.cssSelector("input.signinbtn")).click();
		String actualmsg =  driver.findElement(By.cssSelector("div#div_login_error")).getText();
		String expectedmsg = "Wrong username and password combination.";
		
		if (actualmsg == expectedmsg) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}
	

}
