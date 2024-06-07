import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Test;

public class Threading {
    public static WebDriver driver;
    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void test2(){
        driver = new ChromeDriver();
        driver.get("https://testng.org/reportng/");
    }
}
