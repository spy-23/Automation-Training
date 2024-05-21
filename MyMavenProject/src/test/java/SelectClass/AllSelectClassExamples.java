package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllSelectClassExamples {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
        WebElement coffeeDropDown = driver.findElement(By.name("coffee"));

        //select class for dropdown
        Select coffeeSelctOptions=new Select(coffeeDropDown);
        // getoption() is used to get all list of options
        List<WebElement> coffeeList = coffeeSelctOptions.getOptions();
        for(WebElement coffee:coffeeList)
        {
            System.out.println(coffee.getText());
        }
        //select dropdown list by index number
        coffeeSelctOptions.selectByIndex(3);
        Thread.sleep(3000);
        //select dropdown list by value from html
        coffeeSelctOptions.selectByValue("sugar");
        Thread.sleep(3000);
        //select dropdown list by visible text from html
        coffeeSelctOptions.selectByVisibleText("With cream");
        Thread.sleep(3000);
        //to verify dropdown is multi select
        System.out.println(coffeeSelctOptions.isMultiple());

    }

}