package com.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UISpicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 //ctl00$mainContent$ddl_originStation1
		 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 //driver.findElement(By.xpath("//table[@id='citydropdown'] //a[@value='DEL']")).click();
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//current date xpath need 
		 driver.findElement(By.id("divpaxinfo")).click();
		 Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	     s.selectByIndex(2);
	    Select m = new Select( driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    m.selectByIndex(3);
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    driver.findElement(By.partialLinkText("Special Assistance")).click();
	    Thread.sleep(2000);
	    
		 

	}

}
