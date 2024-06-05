package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class edgeBrowser {
    public static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }
    @Test
    public void openBrowser(){
        driver.get("https://www.facebook.com/");
        System.out.println("Thread Id for Edge Driver:-"+Thread.currentThread().getId());
        System.out.println("Title from Edge:-"+driver.getTitle());
    }
    @AfterClass
    public void close(){
        driver.quit();
    }

}
