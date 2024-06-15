package org.example;


import com.selenium.POM.LoginPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    String username="student";
    String password="Password123";



    @BeforeTest
    public void Broswersetupmethod(){
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

    }

    @Test
    public void test1(){
        LoginPageLocators login1 =new LoginPageLocators(driver);
        login1.UserNameSet(username);
        login1.Passwordset(password);
        login1.submit();
        Assert.assertEquals("Logged In Successfully | Practice Test Automation",driver.getTitle());

    }

    @AfterTest
    public void broswerteardown(){
        driver.quit();
    }




}
