import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownHandle {
    public static void main(String[] args) {
        //Method-1
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement dropdown=driver.findElement(By.tagName("select"));
        Select select=new Select(dropdown);
        select.selectByValue("IND");
    }
}
