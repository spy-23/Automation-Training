package com.ui.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalPage extends BrowserUtil {
	private WebDriver wd;

	public ModalPage(WebDriver wd) {
		super(wd);
		this.wd = wd;
		// TODO Auto-generated constructor stub
	}

// modal will act as a page beacause it is inside page
	private static final By modalButton = By.linkText("Modal");
	private static final By modalTextBox = By.xpath("//div[@class='modal-body']/p/input");
	private static final By okButton = By.xpath("//div[@class='OK']/p/input");
	//private static final By cancelButton = By.xpath("//div[@class='Cancel']/p/input");
	private static final By cancelButton = By.xpath("//button[text()='Cancel']");
	
	public PromptPage enterText(String text) 
	{
		enterTextInto(modalTextBox,text);
		sleepFor(4);
		clickOn(cancelButton);
		return new PromptPage(wd);
		
	}
	

}
