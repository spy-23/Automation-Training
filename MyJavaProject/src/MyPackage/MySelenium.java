package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySelenium {
    public static void main(String[] args) {
       System.setProperty("web driver.chrome.driver", "C:\\Users\\Poornima\\Downloads\\chromedriver-win64\\chromedriver-win64");
        WebDriver driver= new ChromeDriver();
        driver.get("https://chromedriver.chromium.org/");

    }
}
