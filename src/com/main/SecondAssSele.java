package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssSele {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get(" https://www.seleniumeasy.com/test/table-pagination-demo.html");
	    driver.findElement( By.linkText("2")).click();
		System.out.println("value of 7th row's 5th column is : "+ driver.findElement( By.xpath("//table//tr[7]/td[6]")).getText());
		 
		driver.quit();

	}

}
