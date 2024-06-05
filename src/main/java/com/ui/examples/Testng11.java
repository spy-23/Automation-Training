package com.ui.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testng11 {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void open() throws InterruptedException {
		System.out.println("before");
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("test");
		WebElement first = driver.findElement(By.linkText("Sign up for Facebook"));
		first.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("aniket");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("singh");
		WebElement phone = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phone.sendKeys("9870745227");
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Hexa@1234");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByVisibleText("7");
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1998");
		WebElement gender = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/label)[2]"));
		gender.click();
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		submit.click();
		System.out.println("test123");
		String title=driver.getTitle();
		   if (title.equals("Sign up for Facebook | Facebook")) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");
	        }
		
		
	}
    @AfterTest
    public void End(){
    	System.out.println("After");
        driver.close();
        driver.quit();
    }

}
