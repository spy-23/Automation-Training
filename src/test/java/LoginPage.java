import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(String[] args) throws InterruptedException {

    String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    String username="admin";
    String password="admin123";

    WebDriver driver = new ChromeDriver();
    driver.get(URL);


        //Thread.sleep(3000);
    By usernameatt = By.xpath("//input[@name='username']");
    WebElement userboxpath = driver.findElement(By.xpath("//input[@name='username']"));
    userboxpath.click();
    userboxpath.sendKeys(username);



        By passatt = By.xpath("//input[@type='password']");
    WebElement passboxpath = driver.findElement(passatt);
    passboxpath.click();
    passboxpath.sendKeys(password);


    By submitatt= By.xpath("//button[@type='submit']");
    WebElement submitbutton = driver.findElement(submitatt);
    submitbutton.click();


   // Thread.sleep(3000);
    driver.quit();


    }
}


