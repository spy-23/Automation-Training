package com.ui.examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public abstract class BrowserUtil {
	private WebDriver wd;
	private WebDriverWait wait;
//parent (/../../../..)
	public BrowserUtil(WebDriver wd) {
		super();
		this.wd = wd;
		wait = new WebDriverWait(wd, Duration.ofSeconds(30));
	}

	public void goToWebsite(String url) {
		wd.get(url);
	}

	public void maximizewindow() {
		wd.manage().window().maximize();
	}

	public void enterTextInto(By locator, String textToEnter) {
		// sleepFor(2);
		// WebElement element=wd.findElement(locator);
		// use below one
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		// sleepFor(2);
		element.sendKeys(textToEnter);

	}

	

	public void clickOn(By locator) {

		// WebElement element=wd.findElement(locator);
		// use below one
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();

	}

	public void getVisibleText(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String count = element.getText();
		System.out.println("No is " + count);

	}

	// handling alert and accept alert....
	public void acceptAlert() {
		Alert myAlert = wd.switchTo().alert();
		myAlert.accept();
	}

	public void dismissAlert() {
		Alert myAlert = wd.switchTo().alert();
		myAlert.dismiss();
	}

	public String getAlertText() {
		Alert myAlert = wd.switchTo().alert();
		String textOfAlert = myAlert.getText();
		return textOfAlert;

	}

	public void sleepFor(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchToFrame(String frameIdOrName) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}
	public void switchToFrame(int frameIndex) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	//dropdown selection
	public void selectFromDropdown(By dropdownLocator, String value)
	{
		clickOn(dropdownLocator);
		By dataLocator=By.xpath("//span[contains(text(),'"+value+"')]//..");
		clickOn(dataLocator);
		}
	
	

	
	

}
