package com.ui.scenarios;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HandlingJSAlerts {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		//workbook handle sceanrios
		wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
		WebElement alertButton=wd.findElement(By.id("alert"));
		alertButton.click();
		
		//How to handle alert
		Alert myalert= wd.switchTo().alert();
		String textOfAlert=myalert.getText();
		System.out.println(textOfAlert);
		myalert.accept();
		
	}

}
