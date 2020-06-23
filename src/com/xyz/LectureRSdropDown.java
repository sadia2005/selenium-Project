package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LectureRSdropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 driver.findElement(By.id("divpaxinfo"));
		 

	}

}
