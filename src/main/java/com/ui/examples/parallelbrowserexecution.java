package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelbrowserexecution {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void paralle(String browsername) throws InterruptedException {
		if (browsername.equals("CHROME")) {
			driver = new ChromeDriver();
		} else if (browsername.equals("EDGE")) {
			driver = new EdgeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		name.click();
		name.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		Thread.sleep(3000);
		String titlepage = driver.getTitle();
		System.out.println(titlepage);
		if (titlepage.equals("OrangeHRM")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login Failed");
		}
		driver.close();
		driver.quit();
	}

}
