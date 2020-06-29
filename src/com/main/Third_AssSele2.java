package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third_AssSele2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get(" https://www.cleartrip.com/");
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Kolkata");
		driver.findElement(By.id("ToTag")).sendKeys("Mumbai");
		driver.findElement(By.id("DepartDate")).sendKeys("11/11/2020");
		driver.findElement(By.id("ReturnDate")).sendKeys("11/12/2020");
		
		driver.findElement(By.xpath("//select[@id='Adults']//option[3]")).click();
		driver.findElement(By.xpath("//select[@id='Childrens']//option[2]")).click();
		driver.findElement(By.xpath("//select[@id='Infants']//option[0]")).click();
		driver.findElement(By.xpath("//select[@id='Class']//option[0]")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("SpiceJet");
		driver.findElement(By.id("SearchBtn")).click();

		
		
		
		
		

	}

}
