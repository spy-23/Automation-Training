package com.ui.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchScript1 {
		public static void main(String[] args)
		{
		
	WebDriver wd=new ChromeDriver();	
		wd.get("https://www.google.com");	
		wd.get("https://www.facebook.com");
		wd.manage().window().maximize();	
			
			
		}
		
}
