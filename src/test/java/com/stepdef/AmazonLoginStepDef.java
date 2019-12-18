package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.loginpagefactorymaster.AmazonPageFactory;
import com.util.Highlighter1111;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLoginStepDef {
	
	WebDriver driver;
	AmazonPageFactory pf;
	Highlighter1111 color;
	@BeforeTest	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TUANNGUYEN\\git\\Shomir\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		pf = PageFactory.initElements(driver, AmazonPageFactory.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		color = new Highlighter1111(driver);
	    
	}
@Test
@Given("^Put URL and go to login page$")
	public void put_URL_and_go_to_login_page() throws Throwable {
		driver.get(pf.getURL());
	   
	}

	@When("^User able to click my account$")
	public void user_able_to_click_my_account() throws Throwable {
		pf.getSignin().click();
	   
	   
	}

	@When("^User able to use valid user name \"([^\"]*)\"$")
	public void user_able_to_use_valid_user_name(String Username) throws Throwable {
		pf.getEmail().sendKeys(Username);
	   
	}

	@When("^User able to put valid password \"([^\"]*)\"$")
	public void user_able_to_put_valid_password(String password) throws Throwable {
		pf.getPassword().sendKeys(password);
	   
	}

	@When("^User able to click submit button$")
	public void user_able_to_click_submit_button() throws Throwable {
		pf.getSignin2().click();
	   
	}

	@Then("^User able to validate Login status$")
	public void user_able_to_validate_Login_status() throws Throwable {
		
		if (driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Failed");
		}
	
	   
	}
@AfterTest
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	   
	}


}
