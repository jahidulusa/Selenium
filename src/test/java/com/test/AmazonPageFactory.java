package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	
	@FindBy(xpath="(//*[@class='nav-line-1'])[3]")
	private WebElement signin;
	
	@FindBy(xpath="//*[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	private WebElement signin2;
	
	private String URL = "https://www.amazon.com/";
	
	private String username = "uddinshomir94@yahoo.com";
	
	private String pass = "ttstudent123"; 

	public String getURL() {
		return URL;
	}

	public String getUsername() {
		return username;
	}

	public String getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin2() {
		return signin2;
	}
	

}
