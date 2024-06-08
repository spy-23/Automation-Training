package com.ui.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	public static void main(String [] args) {
		
		WebDriver wd=new ChromeDriver();
		SignInPage signInPage=new SignInPage(wd);
		
		//signInPage.doSignInWith("iamfd","password").goToCreateJobPage().createJob();
		signInPage.doSignInWith("iamfd","password").countOfItems();
	
}
}