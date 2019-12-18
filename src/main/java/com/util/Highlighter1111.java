package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter1111 {
		
		WebDriver driver;
		public Highlighter1111(WebDriver driver) {
			this.driver=driver;
	  }
	 
	 
		public void drawBorder(WebElement webelement, String color){
	       WebElement element_node = webelement;
	       JavascriptExecutor jse = (JavascriptExecutor) driver;
	       jse.executeScript("arguments[0].style.border='3px solid "+color+"'", element_node);
	   }
}
