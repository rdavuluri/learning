package com.rd.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.rd.commons.Setup;

public class Click extends Setup{
	//branching
	
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	/**
	 * Waits for the {@link WebElement} to be click and then clicks
	 * WebElement
	 */
	public static void clickElement(WebElement element) {
		try {
			element.click();			
		}catch(Throwable t) {
			System.out.println("Error occured while executing clickElement "+t.getMessage());
		}		
	}
	
	/**
	 * Waits for the {@link WebElement} to be click and then clicks
	 * WebElement
	 * @throws InterruptedException 
	 */
	public static void clickElement(WebElement element, boolean condition) throws InterruptedException {
		if(condition) {
			Thread.sleep(2000);
		}
		try {
			element.click();			
		}catch(Throwable t) {
			System.out.println("Error occured while executing clickElement "+t.getMessage());
		}		
	}
	
	/**
	 * Clicking an element by javascript executor
	 */
	public static void clickElementByJS(WebElement element) {
		try {
			js.executeScript("arguments[0].click();", element);
		}catch(Throwable t) {
			System.out.println("Error occured while executing clickElementByJS "+t.getMessage());
		}		 
	}
	
	
	
	

}
