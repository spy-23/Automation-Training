package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp {

    WebDriver ldriver;

    public BrowserSetUp(WebDriver driver){
       this.ldriver=driver;
    }

    public void Browserlucnh(){
        ldriver=new ChromeDriver();
        ldriver.get("https://practicetestautomation.com/practice-test-login/");
    }

    public void TearDowun(){
       ldriver.quit();
    }

}
