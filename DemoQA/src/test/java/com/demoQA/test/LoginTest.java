package com.demoQA.test;

import com.demoQA.pages.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @Parameters({"URL"})
    @BeforeTest
    public void setup(String url){
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }


    @Test(dataProvider = "fetchData", enabled = true)
    public void test1(String fName, String lName, String email, String number){
        Registration reg=new Registration(driver);
        reg.setfName(fName);
        reg.setlName(lName);
        reg.setEmail(email);
        reg.setGender();
        reg.setMobileNumber(number);
        reg.setDate();
        reg.setHobbies();
        reg.setSubject();

    }


//    @Test
//    public void gen(){
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
////        WebElement myElement = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));  // Replace with your locator
////        wait.until(ExpectedConditions.elementToBeClickable(myElement));
////        System.out.println();
////
//        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
//    }


    @DataProvider
    public Object[][] fetchData(){
        Object[][] data = new Object[1][4];
        data[0][0]="Rajat";
        data[0][1]="shukla";
        data[0][2]="rajatshukla432@gmail.com";
        data[0][3]="9555145907";

        return data;
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }


}
