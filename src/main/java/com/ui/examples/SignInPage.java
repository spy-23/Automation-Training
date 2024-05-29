package com.ui.examples;

import org.openqa.selenium.By;
import static com.ui.examples.PhoenixLocator.*;

public class SignInPage extends BrowserUtil {

	SignInPage(Browser browser) {
		super(browser);
		goToWebsite("http://phoenix.techwithjatin.com/");
	}

	private static final By USER_NAME_TEXTBOX_LOCATOR = locatorById("username");
	private static final By PASSWORD_TEXTBOX_LOCATOR = locatorById("password");
	private static final By SIGN_BUTTON_LOCATOR = locatorByXpath("//span[text()=' Sign in ']");

	public void doSignInWith(String username, String password) {
		enterTextInto(USER_NAME_TEXTBOX_LOCATOR, username);
		enterTextInto(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(SIGN_BUTTON_LOCATOR);
	}
	

}
