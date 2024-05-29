package com.ui.examples;

public class LoginPageTest {
	public static void main(String [] args) {
		
		
	SignInPage signInPage=new SignInPage(Browser.CHROME);
	signInPage.maximizewindow();
	signInPage.doSignInWith("iamfd","password");

	
}
}