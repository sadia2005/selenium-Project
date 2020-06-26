package com.xyz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLooping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement passenger_ele = driver.findElement(By.id("divpaxinfo"));
		 Thread.sleep(2000);
		 System.out.println( passenger_ele.getText());
		 passenger_ele.click();
		 //select element
		 WebElement selectAdult = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
		 Select select = new Select(selectAdult);		
		 //select.selectByIndex(2);
		 
		 List<WebElement> allAdultOptions = select.getOptions();
		 
		 for(int i = 0;i<allAdultOptions.size();i++) {
			 allAdultOptions.get(i).click();
		   Thread.sleep(2000);
		 }

	}

}
