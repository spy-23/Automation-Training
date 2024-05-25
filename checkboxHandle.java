import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class checkboxHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        //WebElement homeCheckbox=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//span[@class='rct-checkbox']"))).build().perform();
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        driver.quit();
    }
}
