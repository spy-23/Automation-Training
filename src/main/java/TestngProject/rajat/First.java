package TestngProject.rajat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rajatbhatti51@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("the title of the page is " + driver.getTitle());
		System.out.println("the last loaded page URL is" + driver.getPageSource());
//		driver.findElement(By.xpath(//input[@name='inputPassword']));
	
		driver.quit();;

	}

}
