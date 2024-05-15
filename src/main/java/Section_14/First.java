package Section_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.xpath(("//input[@name='name'])[1]")));
	System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText()); // by default , selenium will not give the suggestion , because package is static one so import manually 
 
	WebElement date = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	System.out.println(driver.findElement(with(By.tagName("input")).below(date))); 
	}

}
