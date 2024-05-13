import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {
    WebDriver webdriver = new ChromeDriver();
    @BeforeTest
    public void Setup(){
        webdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @Test
    public void Login(){
        webdriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        webdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        webdriver.findElement(By.xpath("//button[@type='submit']")).click();
        // for checking login was successfull or not

        String pageTitle = webdriver.getTitle();
        if (pageTitle.equals("OrangeHRM")){
            System.out.println("Login Successfull");
        }else{
            System.out.println("Login failed");
        }

    }
    @AfterTest
    public void Teardown(){
        webdriver.close();
        webdriver.quit();
    }


}
