package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		SignInPage signInPage = new SignInPage(wd);
		signInPage.doSignInWith("iamfd","password").goToCreateJobPage();
		Thread.sleep(2000);
		WebElement box=wd.findElement(By.xpath("//mat-select[@placeholder='Select Warranty Status']//..//.."));
		box.click();
		WebElement kick=wd.findElement(By.xpath("//span[contains(text(),' In Warrenty ')]//.."));
		kick.click();
		

}}
