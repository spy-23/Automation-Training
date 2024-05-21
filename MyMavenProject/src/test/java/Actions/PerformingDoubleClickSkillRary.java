package Actions;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDoubleClickSkillRary {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoapp.skillrary.com/product.php?p=selenium");
        Actions actions=new Actions(driver);
        //using double click method
        //actions.doubleClick(driver.findElement(By.id("add"))).perform();
        //using movetoelement and doubleclick on it
        actions.moveToElement(driver.findElement(By.id("add"))).doubleClick().perform();

    }

}