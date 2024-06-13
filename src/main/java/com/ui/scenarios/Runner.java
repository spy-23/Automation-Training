package com.ui.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
		PromptPage promptPage=new PromptPage(wd);
		promptPage.clickOnModal().enterText("test");
		
	}

}
