package POMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyDemoQA {
    static WebDriver driver;

    @Test(priority = 0)
    public void openUrl() {
        driver = new ChromeDriver();
        System.out.println("Browser opened.");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        System.out.println("Url is opened.");
    }



    @Test(dependsOnMethods = "openUrl")
    public void test() {
        demoQAPom obj = new demoQAPom(driver);
        obj.clickElements();
        System.out.println("clicked on Elements.");
        obj.clickTextBox();
        System.out.println("clicked on Text Box.");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(obj.userName));
        obj.enterUserName();
        System.out.println("Entered Username.");
        obj.enterUserEmail();
        System.out.println("Entered email.");
        obj.enterCurrentAddress();
        System.out.println("Entered current address.");
        obj.enterPermanentAddress();
        System.out.println("Entered permanent address.");
        obj.clickSubmitButton();
        System.out.println("clicked on Submit button");
        if (driver.getPageSource().contains("Permananet Address :Pune, MH"))
            System.out.println("Test case is passed.");

        WebElement permanentAddress = driver.findElement(By.xpath("//p[@class=\"mb-1\"][4]"));
        Assert.assertTrue(permanentAddress.isDisplayed(), "address not found.");
    }

    @Test(dependsOnMethods = "test")
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed.");
    }

}
