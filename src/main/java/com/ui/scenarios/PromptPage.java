package com.ui.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PromptPage extends BrowserUtil {
	private WebDriver wd;

	public PromptPage(WebDriver wd) {
		super(wd);
		this.wd = wd;
	}
	private static final By alertButton = By.id("alert");
	private static final By modalButton = By.linkText("Modal");

	public ModalPage clickOnModal() {
		maximizewindow();
		clickOn(modalButton);
		return new ModalPage(wd);

	}

}
