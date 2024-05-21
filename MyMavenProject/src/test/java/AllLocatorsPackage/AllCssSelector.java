package AllLocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllCssSelector {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
    //CSS Selector syntax 1: [AttributeName="AttributeValue"]
    driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");

    //CSS selector syntax 2:htmltag[AttributeName="AttributeValue"]
    //using HTML tags along with attibute name and attribute value
    driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");

    //CSS selector syntax 3: #AttributeValue : this is only for id locators,shortcut is "#"
    driver.findElement(By.cssSelector("#login-button")).click();

    //CSS Selector syntax 4: htmltag#AttributeValue :: this is only for id locators with html tag,shortcut is "#"
    driver.findElement(By.cssSelector("input#login-button")).click();

    // CSS Selector syntax 5: .AttributeValue : "." indicates class locators and supports only class locators
    // ex: Classname="abc xyz", it can be used as .abc or .xyz, we should not use .abc.xyz
    driver.findElement(By.cssSelector(".btn_action")).click();

//Syntax 6 :htmltag.AttributeValue,  supports only classname
    driver.findElement(By.cssSelector("input.btn_action")).click();


}
}