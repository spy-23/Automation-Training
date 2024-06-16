package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng2 {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void Start() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void login() throws InterruptedException
	{
		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
		name.click();
		name.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(3000);
		String titlepage=driver.getTitle();
		System.out.println(titlepage);
		   if (titlepage.equals("OrangeHRM")) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	        }
		}
	@AfterTest
	public void End()
	{
		driver.close();
		driver.quit();	
	}
}
