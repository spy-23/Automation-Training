package com.ui.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		//workbook handle sceanarios
		WebDriver wd=new ChromeDriver();
		wd.get("http://139.59.91.96:5001/selenium-workbook/wyswyg-editor.html");
		WebElement headingLocator=wd.findElement(By.tagName("h1"));
		String HeadingText=headingLocator.getText();
		System.out.println(HeadingText);// switch to frame
		System.out.println("under frame");
		wd.switchTo().frame("editor_ifr");
		WebElement bodyOfTextArea=wd.findElement(By.id("tinymce"));
		bodyOfTextArea.clear();
		bodyOfTextArea.sendKeys("text of frame body");
		wd.switchTo().parentFrame(); // exit from child frame and switch back to main/parent frame
		System.out.println("Outside"+HeadingText);
		
		
		
		
		

}}
