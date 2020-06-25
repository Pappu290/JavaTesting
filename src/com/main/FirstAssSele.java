package com.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssSele {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://the-internet.herokuapp.com/login");	
		 
		 By by = By.id("username"); 
		 WebElement elem = driver.findElement(by);	
		 elem.sendKeys("tomsmith");
		 
		 By by1 = By.id("password"); 
		 WebElement elem2 = driver.findElement(by1);	
		 elem2.sendKeys("SuperSecretPassword!");
		 
		 
		 driver.findElement(By.className("radius")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.linkText("Logout")).click();
		 

		 
		 driver.close();
		
		

	}

}
