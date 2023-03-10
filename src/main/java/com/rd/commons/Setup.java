package com.rd.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {
	
	/**
	 * The heart of the Automation. The selenium object used for automatically running
	 * commands on a web browser.
	 */
	public static WebDriver driver;
	
	/**
	 * A static used for explicitly/implicitly waiting for a condition to happen while
	 * running the test.
	 */
	public static WebDriverWait wait;
	
	/**
	 * Launching the different web browsers based on the selection to load the 
	 * application to test.
	 * @return
	 */
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "res/drivers/chromedriver.exe");
		driver = new ChromeDriver();//(options);
		return driver;
	}
	

	
	

}
