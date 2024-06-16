package com.ui.examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		SignInPage signInPage = new SignInPage(wd);
		// login and createjob page
		// signInPage.doSignInWith("iamfd","password").goToCreateJobPage().createJob();

		// count no of jobs
		signInPage.doSignInWith("iamfd", "password").goToCreateJobPage().createJob(" Google ", "Nexus 2",
				" Nexus 2 blue ", "12345123451234", "12/01/2024", "Unresponsive screen",
				"test remarks", "aniket", "singh", "9205862998", "yuviyuvi338@gmail.com", "95", "masorovar colony",
				"park", "colony street","panni nagar"," Uttar Pradesh ","203001", " In Warrenty ");

	}
}