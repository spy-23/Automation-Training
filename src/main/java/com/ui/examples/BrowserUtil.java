package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BrowserUtil {
	private WebDriver wd;

	public BrowserUtil(WebDriver wd) {
		super();
		this.wd = wd;
	}

	public void goToWebsite(String url) {
		wd.get(url);
		}
		public void maximizewindow() {
			wd.manage().window().maximize();
		}
		
		public void enterTextInto(By locator,String textToEnter)
		{
			sleepFor(2);
			WebElement element=wd.findElement(locator);
			element.clear();
			sleepFor(2);
			element.sendKeys(textToEnter);
			
		}
		public void clickOn(By locator)
		{
			sleepFor(5);
			WebElement element=wd.findElement(locator);
			element.click();
			
		}
		
		
		public void sleepFor(int seconds)
		{
			
			try {
				Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

}
