package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Utilities {

public void waits(WebDriver driver, WebElement element, String condition)  {
    try {
        switch (condition) {
            case "toClick":
                new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(element));
                break;

            case "toVisible":
                new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(element));
                break;
            default:
                throw new Exception("Invalid Condition " + condition);
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
    public void clickElement(WebDriver driver, WebElement element) {
        waits(driver, element,"toClick");
        element.click();
    }
    public void visibleElement(WebDriver driver, WebElement element){
        waits(driver,element,"toVisible");
        element.click();
    }
    public void scrollToWebElement(WebDriver driver, WebElement element) {
      JavascriptExecutor jse= (JavascriptExecutor)driver;
      jse.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public void dropdownSelectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void enterBtnPress(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
    public void arrowBtnPress(WebDriver driver){
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyDown(Keys.ARROW_DOWN).build().perform();
        actions.keyUp(Keys.ARROW_DOWN).build().perform();
        enterBtnPress(driver);
    }
    public void screenshot(WebDriver driver) throws IOException {
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File(".\\resources\\screenshots\\passed.png"));

    }

}
