package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		String search_box = "//input[@name='q']";
		String google_search = "//div[@jsname='VlcLAe']//input[@name='btnK' and @value='Google Search']";
		
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement search_box_ele = driver.findElement(By.xpath(search_box));
		search_box_ele.sendKeys("Amazon.com");
		
		WebElement google_search_btn = driver.findElement(By.xpath(google_search));
		google_search_btn.click();
		
		Thread.sleep(3000);

	}

}
