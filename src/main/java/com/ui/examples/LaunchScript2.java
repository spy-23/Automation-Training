package com.ui.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchScript2 {
		public static void main(String[] args)
		{
			BrowserUtil bs=new BrowserUtil(Browser.CHROME);
			bs.goToWebsite("https://www.facebook.com");
			bs.maximizewindow();
			System.out.println("aniket123");
			
			
			
		}
		
}
