package com.xyz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckboxRS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000);
		 String xpath_Ele = "//input[@id='ctl00_mainContent_chk_friendsandfamily']";
		 WebElement checkbox_ele = driver.findElement(By.xpath(xpath_Ele));
		 System.out.println(checkbox_ele.isSelected());
		 checkbox_ele.click();
		System.out.println(checkbox_ele.isSelected());
	
		 //count the checkbox and select it together 
		//List <WebElement> allCheckbox =driver.findElements(By.xpath("//input[@ypet='checkbox']"));
        //System.out.println( allCheckbox.size());
		int cheboxSize = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(cheboxSize);
		
		Assert.assertEquals(cheboxSize, 6);
		System.out.println("passed................................");
		
	}	

}
