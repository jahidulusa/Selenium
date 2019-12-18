package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeworktwoSelenium {
	
	public static void main(String[] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shomir\\git\\repository\\Selenium_Automation\\Selenium_Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		AmazonPageFactory obj = PageFactory.initElements(driver, AmazonPageFactory.class);
		
		driver.get(obj.getURL());
		driver.manage().window().maximize(); 
		
		
		
		
		//WebElement signin = driver.findElement(By.xpath("(//*[@class='nav-line-1'])[3]"));
		//signin.click();
		
		obj.getSignin().click();
		
		
		//WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
		//email.sendKeys("uddinshomir94@yahoo.com");
		
		obj.getEmail().sendKeys(obj.getUsername());
		
		//WebElement continuebutton = driver.findElement(By.xpath("//*[@type='submit']"));
		//continuebutton.click();
		
		obj.getContinuebutton().click();
		
		
		//WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		//password.sendKeys("ttstudent123");
		
		obj.getPassword().sendKeys(obj.getPass());
		
		
		
		//WebElement signin2 = driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		//signin2.click();
		
		obj.getSignin2().click();
		
		if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Failed");
		}
		
		}

}
