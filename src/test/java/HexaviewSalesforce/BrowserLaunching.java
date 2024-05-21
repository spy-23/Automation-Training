package HexaviewSalesforce;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserLaunching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aniket.Singh\\Pictures\\Test\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
		name.click();
		name.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.click();
		password.sendKeys("admin123");
		
		
		
	}

}
