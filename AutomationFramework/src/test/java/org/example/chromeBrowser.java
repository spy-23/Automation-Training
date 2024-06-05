package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class chromeBrowser {
    public static WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
    }
    @Test
    public void openBrowser(){
        driver.get("https://www.facebook.com/");
        System.out.println("Thread Id for Chrome Driver:-"+Thread.currentThread().getId());
        System.out.println("Title from Chrome:-"+driver.getTitle());
    }
    @AfterClass
    public void close(){
        driver.quit();
    }

}
