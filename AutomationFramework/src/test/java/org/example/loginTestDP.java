package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class loginTestDP {
   public static WebDriver driver;

    @BeforeMethod
    public void setup(){                         // Browser Setup
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }
    @Test(dataProvider = "loginDataProvider",dataProviderClass = loginData.class)                   // Data-Provider usage
    public void loginTest(String user,String passwd){
        WebElement username=driver.findElement(By.id("email"));
        username.click();
        username.sendKeys(user);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        wait.until(ExpectedConditions.elementToBeClickable(password));  // Wait until element is clickable
        password.click();
        password.sendKeys(passwd);
    }
    @AfterMethod
    public void close(){              //Closing the browser
        driver.quit();
    }
}
