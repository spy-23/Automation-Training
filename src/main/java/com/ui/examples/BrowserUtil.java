package com.ui.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
private WebDriver wd;
BrowserUtil(Browser browser)
{
	if(browser==Browser.CHROME)
	{
		wd=new ChromeDriver();
		
	}
	else if(browser==Browser.FIREFOX)
	{
		wd=new FirefoxDriver();
		
	}
	if(browser==Browser.EDGE)
	{
		wd=new EdgeDriver();
		
	}
}
	public void goToWebsite(String url)
	{
		
		wd.get(url);
	}
	public void maximizewindow()
	{
		wd.manage().window().maximize();
		
	}
	

}



