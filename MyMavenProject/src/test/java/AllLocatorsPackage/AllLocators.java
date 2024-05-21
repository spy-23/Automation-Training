package AllLocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://saucedemo.com/v1/");
        driver.manage().window().maximize();
		// Locator 1:id()
		//Syntax : AttributeName="AttributeValue"
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();
     driver.findElement(By.id("item_4_title_link")).click();

  // Locator 2:name()
  // Syntax :  //Syntax : AttributeName="AttributeValue"
  //Use: name and id attributes can be same, so if id is not available then we should go for name locators
     driver.findElement(By.name("user-name")).sendKeys("standard_user");
     driver.findElement(By.name("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();

        //Locator 3: className(): in httml class and classname are same
        //syntax:AttributeName="AttributeValue"
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
	     driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 driver.findElement(By.className("btn_action")).click();


        //Locator 6: cssSelector() : any attribute with square bracket will treat as CSS selector.. it should be unique ..  check the example in Navigatetoamazon
        //syntax : [AttributeName="AttributeValue"]
        //it takes any attribute
        driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");

    }

}