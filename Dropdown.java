package com.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class saucedemoDropdownTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(httpswww.saucedemo.com);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement userName = driver.findElement(By.id(user-name));
        userName.sendKeys(standard_user);

        WebElement password = driver.findElement(By.xpath(input[@placeholder=Password]));
        password.sendKeys(secret_sauce);

        WebElement submit = driver.findElement(By.className(submit-button));
        submit.click();

        WebElement sort = driver.findElement(By.className(product_sort_container));


        Select select = new Select(sort);

        select.selectByValue(lohi);

        select.selectByIndex((1));

        select.selectByVisibleText(Price (high to low));
		
//	   List<WebElement> list = driver.findElements(By.tagName("option"));
//       WebElement lowToHigh = list.get(2);
//       lowToHigh.click();


        Thread.sleep(3000);
        driver.quit();


    }
}
