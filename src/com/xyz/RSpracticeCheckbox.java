package com.xyz;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RSpracticeCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Thread.sleep(2000);
		 String checkbox_xpath = "//input[@value='option1']";
	Assert.assertFalse( driver.findElement(By.xpath(checkbox_xpath)).isSelected());
		 driver.findElement(By.xpath(checkbox_xpath)).click();
	Assert.assertTrue( driver.findElement(By.xpath(checkbox_xpath)).isSelected());
         driver.findElement(By.id("checkBoxOption3")).click();
         driver.findElement(By.id("checkBoxOption3")).isEnabled();
         
		String Allcheckbox = "#checkbox-example > fieldset";
		 System.out.println(driver.findElement(By.cssSelector(Allcheckbox)).getSize());//couldnt find the xpath
		 
		 
		 
		 
	}

}
