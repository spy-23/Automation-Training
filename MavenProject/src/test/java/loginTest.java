import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class loginTest
{
    private static final Logger log = LoggerFactory.getLogger(loginTest.class);

    static WebDriver driver;
    @Test
    public static void openUrl(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser is launched.");
        driver.get("https://www.saucedemo.com/");
        System.out.println("Website is opened.");
    }

    @Test(dependsOnMethods = {"openUrl"})
    public static void login() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        System.out.println("Username entered.");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        System.out.println("Password Entered.");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        System.out.println("Clicked on login button.");

        String expectedTitle = "Swag Labs";
        String originalTitle = driver.getTitle();

        Assert.assertEquals(originalTitle,"Swag Labs");
        System.out.println("Logged in successfully!");
    }

    @Test(dependsOnMethods = {"openUrl","login"})
    public void quit(){
        driver.quit();
    }
}
