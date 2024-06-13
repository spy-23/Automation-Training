package com.ui.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingModal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd=new ChromeDriver();
		//workbook handle sceanarios
		wd.get("http://139.59.91.96:5001/selenium-workbook/popups.html");
		//modal locator
		WebElement modalButton=wd.findElement((By.linkText("Modal")));
		modalButton.click();
		//text box area of modal x path
		WebElement modalTextBox=wd.findElement((By.xpath("//div[@class='modal-body']/p/input")));
		modalTextBox.sendKeys("please enter the text here");
		
		//WebElement okButton=wd.findElement((By.xpath("//div[@class='OK']/p/input")));
		//okButton.click();
		Thread.sleep(3000);
		
		WebElement cancelButton=wd.findElement((By.xpath("//button[text()='Cancel']")));
		cancelButton.click();
		
		
		

}}
