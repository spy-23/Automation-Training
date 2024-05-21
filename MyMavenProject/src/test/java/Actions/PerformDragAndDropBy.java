package Actions;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDropBy {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
        Actions actions=new Actions(driver);
        //draganddropby moves price range from start
        actions.dragAndDropBy(driver.findElement(By.xpath("//span[contains(@class,\"slider from\")]")), 30, 0).perform();
        //draganddropby moves price range from end
        actions.dragAndDropBy(driver.findElement(By.xpath("//span[contains(@class,\"slider to\")]")),-40, 0).perform();
        Thread.sleep(2000);
        //both goes back to orginal
        actions.dragAndDropBy(driver.findElement(By.xpath("//span[contains(@class,\"slider from\")]")), -30, 0).perform();
        actions.dragAndDropBy(driver.findElement(By.xpath("//span[contains(@class,\"slider to\")]")),40, 0).perform();

    }

}