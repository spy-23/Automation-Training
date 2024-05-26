package com.ui.examples;
import static com.ui.examples.PhoenixLocator.*;

public class LaunchScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil bs=new BrowserUtil(Browser.CHROME);
		bs.goToWebsite("http://phoenix.techwithjatin.com/");
		bs.maximizewindow();
		//import static for not to use class name for calling static methods
		bs.enterTextInto(locatorById("username"),"iamsup");
		bs.enterTextInto(locatorById("password"),"password");
		bs.buttonClick(locatorByXpath("//span[text()=' Sign in ']"));
		
	}

}
