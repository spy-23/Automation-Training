package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SignInPage extends BrowserUtil {
	
	private static final By USER_NAME_TEXTBOX_LOCATOR = By.id("username");
	private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("password");
	private static final By SIGN_BUTTON_LOCATOR = By.xpath("//span[text()=' Sign in ']");
	private WebDriver wd;
	SignInPage(WebDriver wd) {
		super(wd);
		this.wd=wd;
		goToWebsite("http://phoenix.techwithjatin.com/");
		maximizewindow();
	}

	

	public DashboardPage doSignInWith(String username, String password) {
		enterTextInto(USER_NAME_TEXTBOX_LOCATOR, username);
		enterTextInto(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(SIGN_BUTTON_LOCATOR);
		DashboardPage dashboardPage=new DashboardPage(wd);
		return dashboardPage;


		
	}
	

}
