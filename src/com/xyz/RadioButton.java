package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_mainContent_view_date1")).isEnabled();
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1" )).click();
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
