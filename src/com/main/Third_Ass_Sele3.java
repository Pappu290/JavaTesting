package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Third_Ass_Sele3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-a"))).perform();  //  Drag & Drop not working
		
		//builder.dragAndDrop(driver.findElement(By.xpath("//div[@id='column-a']/header")), driver.findElement(By.xpath("//div[@id='column-b']/header"))).perform();
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='column-b']/header")).isSelected()); 
		System.out.println(driver.findElement(By.xpath("//div[@id='column-b']/header")).isSelected());     
		
		
		
		builder.dragAndDrop(driver.findElement(By.id("column-a")), driver.findElement(By.id("column-a")));
		
		
	  
		

	}

}
