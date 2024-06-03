import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
public class ParallelDrivers {
    WebDriver webdriver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            webdriver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            webdriver = new EdgeDriver();
        }

        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void Login() {
        webdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webdriver.findElement(By.xpath("//input[@placeholder='Username']"))
                .sendKeys("Admin");
        webdriver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("admin123");
        webdriver.findElement(By.xpath("//button[@type='submit']")).click();

        // Check if login was successful
        String pageTitle = webdriver.getTitle();
        if (pageTitle.equals("OrangeHRM")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    @AfterTest
    public void tearDown() {
        webdriver.quit();
    }

}
