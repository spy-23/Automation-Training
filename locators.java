import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class locators {
    public static void main(String[] args) {

        // Chrome browser setup
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        // Opening the website's URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Implicitly wait of 5 seconds to load the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Finding the username and sending the username
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // Finding the password and sending the password
        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin");

        // Finding the login button and clicking on it
        WebElement loginbtn= driver.findElement(By.tagName("button"));
        loginbtn.click();

        // Closing the browser
        driver.quit();
    }
}
