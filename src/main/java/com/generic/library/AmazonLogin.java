package com.generic.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.loginpagefactorymaster.AmazonPageFactory;
import com.util.Highlighter1111;
import com.util.Screenshot;

public class AmazonLogin{
	
	WebDriver driver;
	AmazonPageFactory pf;
	Highlighter1111 color;
	
	public void getSetup() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shomir\\git\\repository\\Selenium_Automation\\Selenium_Automation\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			pf = PageFactory.initElements(driver, AmazonPageFactory.class);
			driver.get(pf.getURL());
			driver.manage().window().maximize(); 
			color = new Highlighter1111(driver);
		}
	
	public void amazonLoginFunction() {
			
			Screenshot.captureScreenShot(driver,"AmazonLoginPage");
			color.drawBorder(pf.getSignin(), "Red");
			pf.getSignin().click();
			color.drawBorder(pf.getEmail(), "Blue");
			pf.getEmail().sendKeys(pf.getUsername());
			pf.getContinuebutton().click();
			pf.getPassword().sendKeys(pf.getPass());
			pf.getSignin2().click();
	
	
	}

	
	public void loginValidation() {
		
		if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Failed");
		}
	
	}
	
	public void tearDown() {
		
		driver.quit();
	}
}
		
		