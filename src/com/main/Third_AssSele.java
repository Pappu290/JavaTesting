package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Third_AssSele {

	public static void main(String[] args) throws InterruptedException{
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();  		//Using xpath
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected()); 
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
	    Thread.sleep(5000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected()); 
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.close();
		
		
	}

}
